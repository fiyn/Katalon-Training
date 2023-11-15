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

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/a_Work Shifts'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input_Shift Name_oxd-input oxd-input--focus'), 
    'Shift Malam')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/i_From_oxd-icon bi-clock oxd-time-input--clock (1)'))

WebUI.sendKeys(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input_From_oxd-input oxd-input--focus oxd-t_ac6c5a'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input_From_oxd-input oxd-input--focus oxd-t_ac6c5a'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input_From_oxd-input oxd-input--focus oxd-t_ac6c5a'), 
    '12')

WebUI.sendKeys(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input__oxd-input oxd-input--focus oxd-time-_f14a5d'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input__oxd-input oxd-input--focus oxd-time-_f14a5d'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input__oxd-input oxd-input--focus oxd-time-_f14a5d'), 
    '15')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input__am (1)'))

WebUI.click(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/workingHour_to_clock'))

WebUI.sendKeys(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input_From_oxd-input oxd-input--focus oxd-t_ac6c5a'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input_From_oxd-input oxd-input--focus oxd-t_ac6c5a'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input_From_oxd-input oxd-input--focus oxd-t_ac6c5a'), 
    '06')

WebUI.sendKeys(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input__oxd-input oxd-input--focus oxd-time-_f14a5d'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input__oxd-input oxd-input--focus oxd-time-_f14a5d'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input__oxd-input oxd-input--focus oxd-time-_f14a5d'), 
    '30')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input__am (1)'))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/input'), 
    'sa')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Page_OrangeHRM/button_Save'))

