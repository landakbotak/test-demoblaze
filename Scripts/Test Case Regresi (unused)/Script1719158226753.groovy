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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Form_SignUp/a_Sign up'))

WebUI.setText(findTestObject('Form_SignUp/input_Username_sign-username'), 'user7@demo.com')

WebUI.setEncryptedText(findTestObject('Form_SignUp/input_Password_sign-password'), '57Ax0AJiCFuP8e/EgTWajg==')

WebUI.click(findTestObject('Form_SignUp/button_Sign up'))

WebUI.waitForElementNotPresent(findTestObject('Form_SignUp/Welcome_Text'), 5)

WebUI.click(findTestObject('Form_LogIn/a_Log in'))

WebUI.setText(findTestObject('Form_LogIn/input_Username_loginusername'), 'user3@demo.com')

WebUI.setEncryptedText(findTestObject('Form_LogIn/Input_password'), 'TbjLjw0+ixNPkxNFNBsE4g==')

WebUI.click(findTestObject('Form_LogIn/button_Log in'))

WebUI.waitForElementPresent(findTestObject('Form_LogIn/ProductStore_Text'), 5)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Laptops'))

WebUI.click(findTestObject('Object Repository/Page_STORE/img_790_card-img-top img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Form_PlaceOrder/button_Place Order'))

WebUI.setText(findTestObject('Form_PlaceOrder/input_Name_name'), 'JUNINA')

WebUI.setText(findTestObject('Form_PlaceOrder/input_Country_country'), 'INDONESIA')

WebUI.setText(findTestObject('Form_PlaceOrder/input_City_city'), 'DEPOK')

WebUI.setText(findTestObject('Form_PlaceOrder/input_Credit card_card'), '123456789012')

WebUI.click(findTestObject('Object Repository/Page_STORE/input_Month_month'))

WebUI.setText(findTestObject('Form_PlaceOrder/input_Month_month'), '1 Month')

WebUI.click(findTestObject('Object Repository/Page_STORE/input_Year_year'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), '2024')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('Form_PlaceOrder/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log out'))

WebUI.closeBrowser()

