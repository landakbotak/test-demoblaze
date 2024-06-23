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

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Sign up'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_sign-username'), 'user5')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_sign-password'), 'qv7Bl7A+3u0=')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'), 'user3@demo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword'), 'TbjLjw0+ixNPkxNFNBsE4g==')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Welcome user3demo.com'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Laptops'))

WebUI.click(findTestObject('Object Repository/Page_STORE/img_790_card-img-top img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_STORE/img_CATEGORIES_card-img-top img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Apple monitor 24'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Name_name'), 'JUNINA')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Country_country'), 'BANGKOK')

WebUI.doubleClick(findTestObject('Object Repository/Page_STORE/input_Country_country'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Country_country'), 'INDONESIA')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_City_city'), 'DEPOK')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Credit card_card'), '123456789012')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), '')

WebUI.click(findTestObject('Object Repository/Page_STORE/input_Month_month'))

WebUI.click(findTestObject('Object Repository/Page_STORE/input_Month_month'))

WebUI.click(findTestObject('Object Repository/Page_STORE/input_Month_month'))

WebUI.doubleClick(findTestObject('Object Repository/Page_STORE/input_Month_month'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), '1 MONTHS')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), '')

WebUI.click(findTestObject('Object Repository/Page_STORE/input_Year_year'))

WebUI.doubleClick(findTestObject('Object Repository/Page_STORE/input_Month_month'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), '1 Months')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), '2024')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log out'))

WebUI.closeBrowser()

