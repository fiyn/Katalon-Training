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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/i_Organization_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/li_Locations'))

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/input_Name'), 
    'Kokdiang')

WebUI.setText(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/input_City'), 
    'Kubang Pasu')

WebUI.setText(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/input_City'), 
    'Kedah')

WebUI.setText(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/input_ZipPostal Code'), 
    '52000')

WebUI.setText(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/input_Phone'), 
    '0192200145')

WebDriver driver = DriverFactory.getDriverConfigurationProvider()

List<WebElements> locations = driver.findElements(By.xpath("//*[@class='oxd-select-option']"))

println(locations.size())

WebUI.click(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/div_Country'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/div_Country'), 
    'Malaysia', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForJQueryLoad(0)

WebUI.click(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/div_Malaysia'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/input_Fax'), 
    '0333333333')

WebUI.setText(findTestObject('Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/textarea_Address'), 
    'alamat sekian2')

WebUI.setText(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/textarea_Notes'), 
    'nota kaki')

WebUI.click(findTestObject('Object Repository/Orange Website/Orange Day 07 - Exercise 3/Page_OrangeHRM/Add Location/Page_OrangeHRM/button_Save'))

