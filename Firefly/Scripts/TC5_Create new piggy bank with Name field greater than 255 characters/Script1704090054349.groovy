import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-3-26-8-206.ap-southeast-2.compute.amazonaws.com')

WebUI.setText(findTestObject('Object Repository/Page_Login to Firefly III/input_email'), 'phunganhkhoa12345@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login to Firefly III/input_password'), 'QBaYa1hmvGu0qm+2Ttlriu3oOofCPYgzT7HSS7+32Ck=')

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/a_Piggy banks'))

WebUI.click(findTestObject('Object Repository/Page_Piggy banks  Firefly III/a_Create new piggy bank'))

WebUI.setText(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/input_name'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniamLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniamLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/select_ACB BankChecking AccountSavings Acco_f60ddf'), 
    '29', true)

WebUI.setText(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/input_targetamount'), '450')

WebUI.setText(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/textarea_notes'), 'Buying a new iphone 13')

WebUI.setText(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/input_object_group'), 'By Khoa')

WebUI.click(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/button_Store new piggy bank'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/p_The name must be between 1 and 255 characters'), 
    0)

WebUI.closeBrowser()

