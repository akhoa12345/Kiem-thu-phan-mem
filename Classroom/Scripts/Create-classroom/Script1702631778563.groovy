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

WebUI.navigateToUrl('https://classroom-client-m4i5.onrender.com/')

WebUI.click(findTestObject('Object Repository/Page_Vite  React/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_Vite  React/inputnormal_signin_email'), 'phunganhkhoa123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/inputnormal_signin_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Page_Vite  React/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_Vite  React/a_To lp hc'))

WebUI.setText(findTestObject('Object Repository/Page_Vite  React/inputnormal_signup_classroomName'), 'Sinh học phân tử')

WebUI.setText(findTestObject('Object Repository/Page_Vite  React/inputnormal_signup_subjectName'), '')

WebUI.click(findTestObject('Object Repository/Page_Vite  React/inputnormal_signup_subjectName'))

WebUI.click(findTestObject('Object Repository/Page_Vite  React/label_Classroom Name'))

WebUI.setText(findTestObject('Object Repository/Page_Vite  React/inputnormal_signup_subjectName'), 'Sinh học phân tử')

WebUI.setText(findTestObject('Object Repository/Page_Vite  React/inputnormal_signup_maxStudent'), '125')

WebUI.setText(findTestObject('Object Repository/Page_Vite  React/textarea_Sinh hc phn t'), 'Sinh học phân tử')

WebUI.click(findTestObject('Object Repository/Page_Vite  React/span_To lp hc'))

WebUI.click(findTestObject('Object Repository/Page_Vite  React/button_OK'))

