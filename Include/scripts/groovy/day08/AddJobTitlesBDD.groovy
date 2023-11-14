package day08
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AddJobTitlesBDD {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigates to Login Page")
	def navigateLoginPage() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		
		WebUI.setText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/input_Username_username'),
			'Admin')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'),
			'hUKwJTbofgPU9eVlw/CnDQ==')
		
		WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/button_Login'))
	}

	@When("User navigates to Add Job Title Page")
	def navigateAddJobTitlePage() {
		WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/a_'))
		
		WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/i_Job_oxd-icon bi-chevron-down'))
		
		WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/a_Job Titles'))
		
		WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/i_Add_oxd-icon bi-plus oxd-button-icon'))
		
	}

	@And("User inputs Job Title details")
	def inputJobTitle() {
		WebUI.setText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'),
			'Kerani')
		
		WebUI.setText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/textarea_K_oxd-textarea oxd-textarea--focus_481e1c'),
			'Ini Kerani lah')
		
		WebUI.setText(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/textarea_n_oxd-textarea oxd-textarea--focus_e0a483'),
			'nota kaki')
	}
	
	@Then("User clicks save button to as confirmation")
	def clickSave() {
		WebUI.click(findTestObject('Object Repository/Orange Website/Page_OrangeHRM/Page_OrangeHRM/button_Save'))
	}
}