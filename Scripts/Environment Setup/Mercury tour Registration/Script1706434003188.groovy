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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_firstName'), 'sreenivas')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_lastName'), 'naidu')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_phone'), '8328077513')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_userName'), 'sreenivas@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_address1'), 'gunthapalli')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_city'), 'badvel')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_state'), 'ap')

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_postalCode'), '516227')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register Mercury Tours/select_ALBANIAALGERIAAMERICAN SAMOAANDORRAA_ae5feb'), 
    'INDIA', true)

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_email'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_password'), GlobalVariable.password)

WebUI.setText(findTestObject('Object Repository/Page_Register Mercury Tours/input_confirmPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_Register Mercury Tours/input_submit'))

WebUI.closeBrowser()

