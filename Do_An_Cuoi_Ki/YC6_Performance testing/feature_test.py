import time
import logging
from locust import FastHttpUser, LoadTestShape, TaskSet
from locust import events, task, constant


# Feature: Event
@events.test_start.add_listener
def on_test_start(environment, **kwargs):
    print("Beginning test")

@events.test_stop.add_listener
def on_test_stop(environment, **kwargs):
    print("Stopped test")

@events.spawning_complete.add_listener
def spawn_users(user_count, **kwargs):
    print("Spawned ... ", user_count, " users.")

@events.quitting.add_listener
def sla(environment, **kwargs):
    if environment.stats.total.fail_ratio > 0.01:
        logging.error("Test failed due to failure ratio > 0.01%")
        environment.process_exit_code = 1
        print(environment.process_exit_code)

    else:
        environment.process_exit_code = 0
        print(environment.process_exit_code)

# Header config
header = {
    "Host": "http://ec2-3-26-8-206.ap-southeast-2.compute.amazonaws.com",
    "User-Agent": "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:109.0) Gecko/20100101 Firefox/119.0",
    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
    "Accept-Encoding": "gzip, deflate, br",
    "Accept-Language": "en-US,en;q=0.5",
    "Alt-Used": "http://ec2-3-26-8-206.ap-southeast-2.compute.amazonaws.com",
    "Connection": "keep-alive", # Another: close
    }

class FireflyDefaultTask(TaskSet):

    @task
    def get_root(self):
        self.client.get("/", headers = header)
        time.sleep(1)

            
class FireflyDoodlesTask(TaskSet):

    @task(3)
    def get_doodles(self):
        try:
            with self.client.get("/piggy-banks/create", headers=header, catch_response=True) as response:
                if response.status_code == 200:
                    response.success()
                else:
                    response.failure("Unexpected status code: {}".format(response.status_code))
        except Exception as e:
            # Handle other exceptions if needed
            response.failure("Exception: {}".format(str(e)))


class WebsiteUser(FastHttpUser):
    host = "http://ec2-3-26-8-206.ap-southeast-2.compute.amazonaws.com"
    wait_time = constant(0.5)
    # Feature: Nested Taskset
    tasks = [FireflyDefaultTask, FireflyDoodlesTask]


#Feature: Custom load Shape
class CustomShape(LoadTestShape):
    # Considering a scenario with 200 users and a spawn rate of 10 is deemed standard.
    stages = [
        # Average Load Test Shape
        {"duration": 100, "users": 200, "spawn_rate": 10},
        {"duration": 130, "users": 1, "spawn_rate": 10},
        
    ]

    def tick(self):
        run_time = self.get_run_time()

        for stage in self.stages:
            if run_time < stage["duration"]:
                tick_data = (stage["users"], stage["spawn_rate"])
                return tick_data
        """
        if run_time < self.time_limit:
            user_count = round(run_time, -2)
            return (user_count, spawn_rate)
        """
        return None