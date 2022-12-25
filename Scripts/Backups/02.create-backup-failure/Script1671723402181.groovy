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

WebUI.refresh()

WebUI.click(findTestObject('Page_Database Instances - Bizfly Database Dashboard/div_Backups'))

WebUI.click(findTestObject('Page_Backups - Bizfly Database Dashboard/div_To backup'))

WebUI.setText(findTestObject('Page_To backup - Bizfly Database Dashboard/input__el-input__inner'), '1')

WebUI.click(findTestObject('Page_To backup - Bizfly Database Dashboard/button_To backup'))

WebUI.verifyTextPresent('Tên Backup chỉ được phép sử dụng các ký tự A-Z, a-z, ký tự \'-\', \'_\', 0-9 và chứa ít nhất 1 chữ cái.', 
    true)

