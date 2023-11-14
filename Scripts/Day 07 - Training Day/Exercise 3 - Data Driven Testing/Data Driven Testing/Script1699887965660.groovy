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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/a_Work Shifts'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input_Shift Name_oxd-input oxd-input--focus'), 
    'Night Shift')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input_From_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input_From_oxd-input oxd-input--focus'), 
    '')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input__am'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input_From_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/i_To_oxd-icon bi-chevron-up oxd-icon-button_cb1016'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input__am'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/i__oxd-icon bi-chevron-down oxd-icon-button_af24fb'))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input_To_oxd-input oxd-input--focus oxd-tim_794c11'), 
    '07')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/p_6.00'))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input'), 'sam')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/div_Add Work ShiftShift NameWorking Hours F_3be1cf'))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/input'), 'a')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/button_Save'))

