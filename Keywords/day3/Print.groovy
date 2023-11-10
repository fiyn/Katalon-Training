package day3

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

public class Print {

	//	@Keyword(keywordObject = 'PrintGroovy' )
	//	def printGroovy () {
	//		println 'Hello World'
	//	}
	//
	//	@Keyword(keywordObject = 'PrintGroovyVar' )
	//	def printGroovyVar() {
	//		def numberOne = 1
	//		def numberTwo = 3
	//		println numberOne + numberTwo
	//		}
	//
	//	@Keyword(keywordObject = 'PrintJava' )
	//	public void printJava() {
	//		int numberOne = 1
	//		System.out.println(numberOne)
	//	}

	@Keyword(keywordObject = 'PrintForEachLoop' )
	def printLoop() {
		def names = ["Alice", "Bob", "Charlie", "David"]
		for (name in names) {
			println name
		}
	}
}
