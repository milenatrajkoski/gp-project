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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://bostage1.btobet.net/')

WebUI.setText(findTestObject('Page_Administration Panel - Player Wizard/input_Please log-in_Username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Administration Panel - Player Wizard/input_Please log-in_Password'), 'q22IHHYN3UAfYBkD/UQ5UQ==')

WebUI.sendKeys(findTestObject('Page_Administration Panel - Player Wizard/input_Please log-in_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Dashboard/a_Players'))

WebUI.click(findTestObject('Page_Dashboard/a_Search'))

WebUI.setText(findTestObject('Page_Player Search/input_Exclude_table-search'), 'B2BTest4')

WebUI.sendKeys(findTestObject('Page_Player Search/input_Exclude_table-search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Player Search/a_B2BTest4'))

WebUI.click(findTestObject('Page_Player Profile/span_Profile_icon-angle-down'))

WebUI.click(findTestObject('Page_Player Profile/a_Profile Details'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Player Profile/input_Nickname_Nickname'), '3')

WebUI.click(findTestObject('Object Repository/Page_Player Profile/input_Nickname_Nickname'))

WebUI.setText(findTestObject('Object Repository/Page_Player Profile/input_Nickname_Nickname'), '4')

WebUI.click(findTestObject('Page_Player Profile/button_Save changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Player Profile/input_Nickname_Nickname'), '4')

