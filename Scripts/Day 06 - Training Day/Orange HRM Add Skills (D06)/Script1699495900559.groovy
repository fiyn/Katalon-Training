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

WebUI.callTestCase(findTestCase('Day 05 - Training Day/Orange HRM Login (D05)'), [('username') : GlobalVariable.username
        , ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/i_Qualifications_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/li_Skills'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    GlobalVariable.skill)

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/textarea_Description_oxd-textarea oxd-texta_fed1e5'), 
    note)

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/button_Save'))

