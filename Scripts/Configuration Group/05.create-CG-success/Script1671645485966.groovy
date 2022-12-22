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

WebUI.click(findTestObject('Page_Database Instances - Bizfly Database Dashboard/p_Configuration Groups'))

WebUI.click(findTestObject('Page_Configuration Groups - Bizfly Database Dashboard/button_To Configuration Groups'))

WebUI.click(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/div_MongoDB'))

WebUI.click(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/i_Khng c d liu_el-select__caret el-input__icon el-icon-arrow-up'))

WebUI.click(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/span_auto_increment_increment'))

WebUI.click(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/button_Thm mi'))

WebUI.click(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/input_Gi tr Cu hnh_el-input__inner'))

WebUI.setText(findTestObject(null), '123')

var1 = CustomKeywords.'myPackage.myKeywords.randomString'(46)

WebUI.setText(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/input_t tn Configuration Group_el-input__inner'), 
    var1)

WebUI.click(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/button_To mi Configuration Group'))

WebUI.delay(5)

WebUI.verifyTextPresent('Thành công', true)

