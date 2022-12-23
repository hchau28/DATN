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

CustomKeywords.'myPackage.myKeywords.checkTextExists'(findTestObject('Page_Khi to Secondary Node - Create Node/h3_Khi to Secondary Node'), 
    'Khởi tạo Secondary Node')

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Khi to Secondary Node - Create Node/div_HN1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Khi to Secondary Node - Create Node/input__el-input__inner'), '11111')

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Khi to Secondary Node - Create Node/div_HN1'))

WebUI.verifyTextPresent('Tên Tên Secondary Node chỉ được phép sử dụng các ký tự A-Z, a-z, ký tự \'-\', \'_\', 0-9 và chứa ít nhất 1 chữ cái', 
    true)

WebUI.closeBrowser()

