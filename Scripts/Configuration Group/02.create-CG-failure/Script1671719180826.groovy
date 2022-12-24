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

WebUI.click(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/div_MariaDB                            10.3                            10.3                      10.4                     Chn phin bn'))

WebUI.click(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/i_Khng c d liu_el-select__caret el-input__icon el-icon-arrow-up'))

WebUI.doubleClick(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/span_character_set_connection'))

WebUI.click(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/button_Thm mi'))

WebUI.setText(findTestObject('Page_Khi to Config Group - Bizfly Database Dashboard/input_t tn Configuration Group_el-input__inner'), 
    '12345')

WebUI.delay(2)

WebUI.verifyTextPresent('Tên Configuration Group chỉ được phép sử dụng các ký tự A-Z, a-z, ký tự \'-\', \'_\', 0-9 và chứa ít nhất 1 chữ cái.\n', 
    true)

