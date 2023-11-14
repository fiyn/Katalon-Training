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

WebUI.setText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/a_'))

WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/i_Job_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/a_Job Titles'))

WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/i_Add_oxd-icon bi-plus oxd-button-icon'))

resultJobTitle = CustomKeywords.'day4.JobTitle.addJobTitle'(jobTitle)

WebUI.setText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'), 
    resultJobTitle)

WebUI.setText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/textarea_K_oxd-textarea oxd-textarea--focus_481e1c'), 
    jobDescription)

WebUI.setText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/textarea_n_oxd-textarea oxd-textarea--focus_e0a483'), 
    note)

WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/button_Save'))

