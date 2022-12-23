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

WebUI.click(findTestObject('Object Repository/delete_db_instance/Page_Database Instances - Bizfly Database D_3ea25a/p_mmmmmmmmm'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Xa - Bizfly Database Dashboard/li_Xa'))

var1 = WebUI.getText(findTestObject('Page_Xa - Bizfly Database Dashboard/b_5wB6O'))

System.out.println(var1)

WebUI.doubleClick(findTestObject('Page_Xoa - DB/div_Xa'))

WebUI.setText(findTestObject('Page_Xa - Bizfly Database Dashboard/input_Xa cc bn Backups_el-input__inner'), var1)

WebUI.doubleClick(findTestObject('Page_Xoa - DB/div_Xa'))

WebUI.delay(4)

WebUI.verifyTextPresent('Thành công', true)

WebUI.closeBrowser()

