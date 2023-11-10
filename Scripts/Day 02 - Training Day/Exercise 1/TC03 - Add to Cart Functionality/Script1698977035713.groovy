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

WebUI.callTestCase(findTestCase('Day 02 - Training Day/Exercise 1/TC02 - Search Functionality'), [('url') : 'https://cms.demo.katalon.com/'
        , ('name') : 'customer', ('password') : 'fcttOx1e+dws0mP0AWb2uMRTnZbRfS0W', ('keyword') : 'Ninja'], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('Search Results for “Ninja” – Katalon Shop')

WebUI.click(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Search Results for Ninja  Katalon Shop/a_Shop'))

WebUI.click(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Katalon Shop  Katalon Ecommerce/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Katalon Shop (Ecommerce)/Page_Katalon Shop  Katalon Ecommerce/a_View cart'))

WebUI.verifyElementPresent(findTestObject('Katalon Shop (Ecommerce)/Page_Cart  Katalon Shop/Page_Cart  Katalon Shop/img__attachment-woocommerce_thumbnail size-woocommerce_thumbnail'), 
    0)

