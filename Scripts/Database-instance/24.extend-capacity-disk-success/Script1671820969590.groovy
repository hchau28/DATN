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

WebUI.doubleClick(findTestObject('Page_Database Instances - Bizfly Database Dashboard/li_Nodes'))

CustomKeywords.'myPackage.myKeywords.checkTextExists'(findTestObject('Page_Nodes - Primary Node/div_Primary Node'), 'Primary Node')

WebUI.click(findTestObject('Page_Nodes - Primary Node/i_ACTIVE_bf-icon icon-m icon-more-horiz icon-color-default'))

WebUI.doubleClick(findTestObject('Page_Nodes - Primary Node/span_Ci t'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Nodes - Primary Node/Page_Cai_dat - Khoi dong Node/div_Khi ng li Node'))

WebUI.click(findTestObject('Page_Nodes - Primary Node/Page_Cai_dat - Khoi dong Node/span_Khi ng li'))

CustomKeywords.'myPackage.myKeywords.checkTextExists'(findTestObject('Page_Nodes - Primary Node/Page_Cai_dat - Khoi dong Node/div_Thnh cngKhi ng li Node fj7Tf-lp4fna9l thnh cng'), 
    'Thành công')

WebUI.closeBrowser()

