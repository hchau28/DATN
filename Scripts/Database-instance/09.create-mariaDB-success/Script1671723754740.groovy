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

WebUI.click(findTestObject('Page_Khi to Database Instance - Bizfly Database Dashboard/div_MariaDB                            10.3                            10.3                      10.4                     Chn phin bn'))

WebUI.click(findTestObject('Object Repository/Page_Khi to Database Instance - Bizfly Data_228464/div_908.424  thng                         1_8f15ca'))

WebUI.click(findTestObject('Object Repository/Page_Khi to Database Instance - Bizfly Data_228464/div_81.840  thng                         11_c399d0'))

WebUI.click(findTestObject('Page_Khi to Database Instance - Bizfly Database Dashboard/span_Configuration Group_el-checkbox__inner'))

WebUI.click(findTestObject('Object Repository/Page_Khi to Database Instance - Bizfly Data_228464/label_HN1'))

var1 = CustomKeywords.'myPackage.myKeywords.randomString'(31)

WebUI.setText(findTestObject('Object Repository/Page_Khi to Database Instance - Bizfly Data_228464/input__el-input__inner'), 
    var1)

WebUI.click(findTestObject('Page_Khi to Database Instance - Create DB/span_Xc nhn thng tin khi to'))

WebUI.verifyTextPresent('X??c nh???n mua g??i c?????c', true)

WebUI.doubleClick(findTestObject('Page_Khi to Database Instance - Create DB/div_Thanh ton'))

WebUI.delay(3)

WebUI.verifyTextPresent('Th??nh c??ng', true)

WebUI.closeBrowser()
