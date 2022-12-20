package myPackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

class myKeywords {

	@Keyword
	public String randomString(int length) {

		String chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'

		Random rand = new Random();

		StringBuilder sb = new StringBuilder();

		for (int i=0; i<length; i++) {

			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}

		return sb.toString();
	}

	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			if (element != null) {
				System.out.println('hihi')
			}else {
				System.out.println('huhuh')
			}
			KeywordUtil.logInfo("Clicking element")
			element.click()
			element.getText()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def checkTextExists(TestObject to,String text) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			if (!!element) {
				int count = 0; // second
				int maxCount = 3; //seconds
				String str = element.getText();
				Boolean isExists = element.getText().contains(text);
				System.out.println(isExists);

				while (count < maxCount && !(element.getText().contains(text))) {
					Thread.sleep(1000);
					count++;
					System.out.println(count+'...second');
				}
				if (count > maxCount) {
					KeywordUtil.markFailed("Text not exists")
				}
			}else {
				KeywordUtil.markFailed("Text not exists")
			}
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Text not exists")
		} catch (Exception e) {
			KeywordUtil.markFailed("Text not exists")
		}
	}
}