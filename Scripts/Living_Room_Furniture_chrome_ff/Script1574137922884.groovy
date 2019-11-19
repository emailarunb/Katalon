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

WebUI.navigateToUrl(GlobalVariable.URL_PROD)

not_run: WebUI.click(findTestObject('Page_Furniture  Homewares Online at Beautiful Prices  Temple  Webster/environment'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Furniture  Homewares Online at Beautiful Prices  Temple  Webster/environment'), 
    GlobalVariable.ENV, false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Living Room Furniture/Page_Furniture  Homewares Online at Beautif_0bdae4/a_Shopproducts'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Living Room Furniture/Page_Furniture  Homewares Online at Beautif_0bdae4/a_Living Room Furniture'), 
    FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('Living Room Furniture', false)

WebUI.closeBrowser()

