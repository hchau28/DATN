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

WebUI.navigateToUrl('https://beta.manage.bizflycloud.vn/cloud-database/instance/create')

WebUI.delay(3)

WebUI.verifyTextPresent('Khởi tạo Database Instance', true)

WebUI.verifyTextPresent('Chọn Database Engine', true)

WebUI.verifyTextPresent('Giá ước tính hàng tháng', true)

WebUI.verifyTextPresent('Primary Node', true)

WebUI.verifyTextPresent('Chọn cấu hình', true)

WebUI.verifyTextPresent('Dung lượng lưu trữ', true)

WebUI.verifyTextPresent('Data center', true)

WebUI.verifyTextPresent('Sử dụng Secondary Node', true)

WebUI.verifyTextPresent('Configuration Group', true)

WebUI.verifyTextPresent('Network', true)

WebUI.verifyTextPresent('Tên Database Instance', true)

WebUI.verifyTextPresent('Xác nhận thông tin khởi tạo', true)

