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

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/div_Sign in to start your session          _4f6a7f'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login to Firefly III/input_password'), 'QBaYa1hmvGu0qm+2Ttlriu3oOofCPYgzT7HSS7+32Ck=')

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/a_Revenue  income'))

WebUI.click(findTestObject('Object Repository/Page_All revenue between January 1st, 2024 _e17e7d/a_Create a new transaction'))

WebUI.setText(findTestObject('Object Repository/Page_Create new deposit  Transactions  Firefly III/input_description'), 
    'Salary')

WebUI.setText(findTestObject('Object Repository/Page_Create new deposit  Transactions  Firefly III/input_source'), 'Công ty FPT')

WebUI.setText(findTestObject('Object Repository/Page_Create new deposit  Transactions  Firefly III/input_destination'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Create new deposit  Transactions  Firefly III/input_destination'))

WebUI.click(findTestObject('Object Repository/Page_Create new deposit  Transactions  Firefly III/a_Checking Account (500.00)'))

WebUI.setText(findTestObject('Object Repository/Page_Create new deposit  Transactions  Firefly III/input_amount'), '600')

WebUI.setText(findTestObject('Object Repository/Page_Create new deposit  Transactions  Firefly III/input_category'), 'Lương')

WebUI.setText(findTestObject('Object Repository/Page_Create new deposit  Transactions  Firefly III/input_ti-new-tag-input ti-valid'), 
    'Lương')

WebUI.click(findTestObject('Object Repository/Page_Create new deposit  Transactions  Firefly III/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_All revenue between January 1st, 2024 _e17e7d/div_Close                Success           _950311'), 
    0)

WebUI.closeBrowser()

