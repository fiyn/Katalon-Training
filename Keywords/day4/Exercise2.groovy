package day4

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Exercise2 {

	@Keyword(keywordObject = 'Section 1')
	def printSect1() {
		int temperature = 31
		String statusMessage = ""

		if(temperature > 10) {
			statusMessage = "It's hot!"
		} else {
			statusMessage = "It's hotn't!"
		}

		println statusMessage
	}

	@Keyword(keywordObject = 'Section 2')
	def printSect2() {
		int dayOfWeek = 3
		String dayName = ""

		switch(dayOfWeek) {
			case 1:
				dayName = "Sunday";
				break;
			case 2:
				dayName = "Monday";
				break;
			case 3:
				dayName = "Tuesday";
				break;
			case 4:
				dayName = "Wednesday";
				break;
			case 5:
				dayName = "Thursday";
				break;
			case 6:
				dayName = "Friday";
				break;
			case 7:
				dayName = "Saturday";
				break;
			default:
				dayName = "Day...I Dayn't Know";
		}

		println dayName
	}

	@Keyword(keywordObject = 'Section 3')
	def printSect3() {
		for(int i=1;i<=10;i++) {
			println i
		}
	}

	@Keyword(keywordObject = 'Section 4')
	def printSect4() {
		String[] lotsOfNames = ["Name1", "Name2", "Name3"]

		for(name in lotsOfNames) {
			println name
		}
	}

	//	@Keyword(keywordObject = 'Section Plus')
	//	public void printSectPlus() {
	//			int[] numbers = {10, 20, 30, 40};
	//			for (int num : numbers) {
	//				System.out.println(num);
	//			}
	//		}
}
