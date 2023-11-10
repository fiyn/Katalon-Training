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

WebUI.navigateToUrl('https://www.google.com/search?q=test&sca_esv=578704763&sxsrf=AM9HkKlLcoVlS4P1cqt3TNRuBRbUdj4DAQ%3A1698892257806&source=hp&ei=4QlDZZDtLbrf1e8P6vGCyAw&iflsig=AO6bgOgAAAAAZUMX8XM2blnqQfJ3wrMwznUZ9Dh0ZR0l&ved=0ahUKEwjQ4aPsoqSCAxW6b_UHHeq4AMkQ4dUDCAo&uact=5&oq=test&gs_lp=Egdnd3Mtd2l6IgR0ZXN0Mg4QABiKBRixAxiDARiRAjIOEAAYigUYsQMYgwEYkQIyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDATILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMggQABiABBixAzIFEAAYgAQyBRAAGIAEMggQABiABBixA0j1D1CYBVjYCHABeACQAQCYAbECoAHxBqoBBzEuMS4wLjK4AQPIAQD4AQGoAgrCAgcQIxjqAhgnwgIHEC4Y6gIYJ8ICERAuGIAEGLEDGIMBGMcBGNEDwgIOEC4YgAQYsQMYxwEY0QPCAggQABiKBRiRAsICCxAAGIoFGLEDGIMB&sclient=gws-wiz')

WebUI.click(findTestObject('Object Repository/Google/Page_test - Google Search/div_Press  to jump to the search boxtest   _849522'))

WebUI.setText(findTestObject('Object Repository/Google/Page_test - Google Search/textarea_test'), 'test')

WebUI.click(findTestObject('Object Repository/Google/Page_test - Google Search/path'))

WebUI.closeBrowser()

