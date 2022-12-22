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

WebUI.click(findTestObject('Page_Database Instances - Bizfly Database Dashboard/i_ACTIVE_bf-icon icon-m icon-more-horiz icon-color-default'))

WebUI.click(findTestObject('Page_Database Instances - Bizfly Database Dashboard/li_Backups'))

WebUI.click(findTestObject('Page_Backups - Bizfly Database Dashboard/i_S bn gi li_bf-icon icon-m icon-more-horiz icon-color-default'))

WebUI.click(findTestObject('Page_Backups - Bizfly Database Dashboard/li_Xa Backup Schedules'))

WebUI.setText(findTestObject('Page_Xa Backup Schedule - Bizfly Database Dashboard/input_OK_el-input__inner'), 'OK1')

WebUI.click(findTestObject('Page_Xa Backup Schedule - Bizfly Database Dashboard/div_Xc nhn'))

WebUI.verifyTextPresent('Vui lòng nhập OK để xác nhận.', true)

