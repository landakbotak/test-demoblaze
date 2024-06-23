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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Form_LogIn/a_Log in'))

WebUI.setText(findTestObject('Form_LogIn/input_Username_loginusername'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Form_LogIn/Input_password', [('') : GlobalVariable.password]), 'NWDWf0L2WlEhilIBwLvlmw==')

WebUI.click(findTestObject('Form_LogIn/button_Log in'))

WebUI.waitForElementPresent(findTestObject('Form_SignUp/Welcome_Text'), 100)

WebUI.verifyElementPresent(findTestObject('Form_SignUp/Welcome_Text'), 50)

WebUI.click(findTestObject('Page_STORE/a_Log out'))

WebUI.waitForElementPresent(findTestObject('Form_SignUp/Welcome_Text'), 20)

WebUI.closeBrowser()

