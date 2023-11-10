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

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.switchToWindowTitle('Katalon Shop – Katalon Ecommerce')

WebUI.click(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Katalon Shop  Katalon Ecommerce/a_Add to cart (1)'))

WebUI.click(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Katalon Shop  Katalon Ecommerce/a_View cart (1)'))

WebUI.click(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Cart  Katalon Shop/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/input__billing_first_name'), 
    billingFirstName)

WebUI.setText(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/input__billing_last_name'), 
    billingLastName)

WebUI.setText(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/input_(optional)_billing_company'), 
    biliingCompany)

WebUI.click(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/Page_Checkout  Katalon Shop/span_Malaysia'))

WebUI.setText(findTestObject('Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/input__select2-search__field'), country)

WebUI.click(findTestObject('Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/li_Vietnam', [('country') : country]))

WebUI.setText(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/input__billing_address_1'), 
    billingAddress)

WebUI.setText(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/input__billing_postcode'), 
    billingPostcode)

WebUI.setText(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/input__billing_city'), 
    billingTown)

WebUI.click(findTestObject('Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/Page_Checkout  Katalon Shop/select_Province'))

WebUI.setText(findTestObject('Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/Page_Checkout  Katalon Shop/input__select2-search__field'), 
    billingProvince)

WebUI.click(findTestObject('Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/Page_Checkout  Katalon Shop/li_stanbul', 
        [('billingProvince') : billingProvince]))

WebUI.setText(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/input__billing_phone'), 
    billingPhone)

WebUI.setText(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/input__billing_email'), 
    billingEmail)

WebUI.click(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/h1_Checkout'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Checkout  Katalon Shop/p_Thank you. Your order has been received'), 
    0)

