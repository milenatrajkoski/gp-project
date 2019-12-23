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

WebUI.setText(findTestObject('Object Repository/Page_Administration Panel - Player Wizard/input_Please log-in_Username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Administration Panel - Player Wizard/input_Please log-in_Password'), 
    'q22IHHYN3UAfYBkD/UQ5UQ==')

WebUI.click(findTestObject('Object Repository/Page_Administration Panel - Player Wizard/input_Please log-in_logon'))

WebUI.click(findTestObject('Page_Dashboard/a_Players'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Search'))

WebUI.click(findTestObject('Object Repository/Page_Player Search/div_Processing'))

WebUI.setText(findTestObject('Object Repository/Page_Player Search/input_Exclude_table-search'), 'B2BTest4')

WebUI.sendKeys(findTestObject('Object Repository/Page_Player Search/input_Exclude_table-search'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Player Search/a_B2BTest4'), 'B2BTest4')

WebUI.closeBrowser()

