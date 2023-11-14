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



class AddSkillBDDParam {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigates to Login Page with (.*) and (.*)")
	def navigateLoginPage(String username, String password) {
		WebUI.callTestCase(findTestCase('Day 08 - Training Day/Orange HRM Login (D08)'), [('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("User navigates to Add Skill Page")
	def navigateAddSkillPage() {
		WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/a_Admin'))

		WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/i_Qualifications_oxd-icon bi-chevron-down'))

		WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/li_Skills'))

		WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/button_Add'))
	}

	@And("User inputs skill details such as (.*) and (.*)")
	def inputSkillDetails(String skill, String note) {
		WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'),
				skill)

		WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/textarea_Description_oxd-textarea oxd-texta_fed1e5'),
				note)
	}

	@Then("User clicks save button")
	def clickSaveButton() {
		WebUI.click(findTestObject('Object Repository/Orange Website/Orange Exercise Day 5/Page_OrangeHRM/button_Save'))
	}
}