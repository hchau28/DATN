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

WebUI.click(findTestObject('Page_Khi to Database Instance - Bizfly Database Dashboard/div_MongoDB'))

WebUI.click(findTestObject('Page_Khi to Database Instance - Bizfly Database Dashboard/span_cng sau khi tng s khng th gim_el-checkbox__inner'))

WebUI.setMaskedText(findTestObject('Page_Khi to Database Instance - Bizfly Database Dashboard/Page_Khi to Database Instance - Bizfly Database Dashboard/input_cng sau khi tng s khng th gim_el-input__inner'), 
    '50')

WebUI.setMaskedText(findTestObject('Page_Khi to Database Instance - Bizfly Database Dashboard/Page_Khi to Database Instance - Bizfly Database Dashboard/input_(gi tr l s nguyn trong khong t 50 n 95)_el-input__inner'), 
    '10')

WebUI.click(findTestObject('Object Repository/Page_Khi to Database Instance - Bizfly Data_228464/label_HN1'))

WebUI.click(findTestObject('Page_Khi to Database Instance - Bizfly Database Dashboard/span_Configuration Group_el-checkbox__inner'))

var1 = CustomKeywords.'myPackage.myKeywords.randomString'(5)

WebUI.setText(findTestObject('Page_Khi to Database Instance - Create DB/Input nhap name db - Create DB/input__el-input__inner'), 
    var1)

WebUI.click(findTestObject('Page_Khi to Database Instance - Create DB/span_Xc nhn thng tin khi to'))

WebUI.verifyTextPresent('X??c nh???n mua g??i c?????c', true)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Khi to Database Instance - Bizfly Data_228464/button_Thanh ton'))

WebUI.delay(3)

WebUI.verifyTextPresent('Th??nh c??ng ', true)

WebUI.closeBrowser()

