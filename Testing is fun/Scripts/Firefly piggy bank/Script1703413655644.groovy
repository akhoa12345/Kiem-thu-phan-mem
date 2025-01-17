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

WebUI.navigateToUrl('http://localhost:8080/login')

WebUI.setText(findTestObject('Object Repository/Page_Login to Firefly III/input_email'), 'phunganhkhoa12345@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login to Firefly III/input_password'), 'QBaYa1hmvGu0qm+2Ttlriu3oOofCPYgzT7HSS7+32Ck=')

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Whats playing  Firefly III/h1_Firefly III                             _cd0d3f'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/a_Budgets'))

WebUI.click(findTestObject('Object Repository/Page_Budgets  Firefly III/a_Piggy banks'))

WebUI.click(findTestObject('Object Repository/Page_Piggy banks  Firefly III/span_fa fa-plus'))

WebUI.setText(findTestObject('Object Repository/Page_Piggy banks  Firefly III/input_amount'), '5')

WebUI.click(findTestObject('Object Repository/Page_Piggy banks  Firefly III/button_Add'))

WebUI.rightClick(findTestObject('Object Repository/Page_Piggy banks  Firefly III/div_Close                Success           _03a24c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Piggy banks  Firefly III/div_Close                Success           _03a24c'), 
    0)

WebUI.closeBrowser()

