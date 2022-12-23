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

WebUI.navigateToUrl('https://beta.manage.bizflycloud.vn/cloud-database/instances/')

WebUI.setText(findTestObject('Object Repository/delete_db_instance/Page_ng nhp - Bizfly Cloud/input_Email_username'), 'chauphamthihoang@vccorp.vn')

WebUI.click(findTestObject('Object Repository/delete_db_instance/Page_ng nhp - Bizfly Cloud/i_Mt khu_fa fa-eye'))

WebUI.setText(findTestObject('Object Repository/delete_db_instance/Page_ng nhp - Bizfly Cloud/input_Mt khu_password'), 'Chau281120')

WebUI.click(findTestObject('Object Repository/delete_db_instance/Page_ng nhp - Bizfly Cloud/button_ng nhp'))

WebUI.click(findTestObject('Page_Database Instances - Bizfly Database Dashboard/i_ACTIVE_bf-icon icon-m icon-more-horiz icon-color-default'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Database Instances - List DB/span_Nodes'))

CustomKeywords.'myPackage.myKeywords.checkTextExists'(findTestObject('Page_Nodes - Primary Node/div_Primary Node'), 'Primary Node')

WebUI.click(findTestObject('Page_Nodes - Primary Node/i_ACTIVE_bf-icon icon-m icon-more-horiz icon-color-default'))

WebUI.doubleClick(findTestObject('Page_Nodes - Primary Node/span_Ci t'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Nodes - Primary Node/Page_Cai-dat - Doi cau hinh/div_1.70tr  thng                         2.288  gi'))

WebUI.click(findTestObject('Page_Nodes - Primary Node/Page_Cai-dat - Doi cau hinh/span_i cu hnh'))

WebUI.click(findTestObject('Page_Nodes - Primary Node/Page_Cai-dat - Doi cau hinh/span_Thay i cu hnh'))

WebUI.click(findTestObject('Page_Nodes - Primary Node/Page_Cai-dat - Doi cau hinh/div_Thanh ton'))

CustomKeywords.'myPackage.myKeywords.checkTextExists'(findTestObject('Page_Nodes - Primary Node/Page_Cai-dat - Doi cau hinh/div_Thnh cngang thc thin thay i cu hnh'), 
    'Thành công')

WebUI.closeBrowser()

