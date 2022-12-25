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

WebUI.navigateToUrl('https://beta.manage.bizflycloud.vn/cloud-database/instances/')

WebUI.click(findTestObject('Page_Database Instances - Bizfly Database Dashboard/i_ACTIVE_bf-icon icon-m icon-more-horiz icon-color-default'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Database Instances - List DB/span_Nodes'))

CustomKeywords.'myPackage.myKeywords.checkTextExists'(findTestObject('Page_Nodes - Bizfly Database Dashboard detail/span_Secondary Node'), 
    'Secondary Node')

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Nodes - Bizfly Database Dashboard detail/span_To Secondary Node'))

CustomKeywords.'myPackage.myKeywords.checkTextExists'(findTestObject('Page_Khi to Secondary Node - Create Node/h3_Khi to Secondary Node'), 
    'Khởi tạo Secondary Node')

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Khi to Secondary Node - Create Node/div_HN1'))

var1 = CustomKeywords.'myPackage.myKeywords.randomString'(5)

WebUI.setText(findTestObject('Page_Khi to Secondary Node - Create Node/input__el-input__inner'), var1)

WebUI.doubleClick(findTestObject('Page_Khi to Secondary Node - Create Node/div_Khi to Secondary Node'))

WebUI.click(findTestObject('Page_Khi to Secondary Node - Create Node/button_Thanh ton'))

CustomKeywords.'myPackage.myKeywords.checkTextExists'(findTestObject('Page_Khi to Secondary Node - Create Node/div_Thnh cngKhi to Secondary Node thnh cng'), 
    'Thành công')

WebUI.closeBrowser()

