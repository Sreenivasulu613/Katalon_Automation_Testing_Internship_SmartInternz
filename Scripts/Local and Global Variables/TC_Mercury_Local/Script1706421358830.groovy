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

WebUI.navigateToUrl('https://demo.guru99.com/test/newtours/register.php')

WebUI.setText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_firstName'), 
    firstname)

WebUI.setText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_lastName'), 
    GlobalVariable.lastname)

WebUI.setText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_phone'), GlobalVariable.phoneno)

WebUI.setText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_userName'), 
    GlobalVariable.emailid)

WebUI.setText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_address1'), 
    'gunthapalli')

WebUI.setText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_city'), 'badvel')

WebUI.setText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_state'), 'andhrapradesh')

WebUI.setText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_postalCode'), 
    '516227')

WebUI.setText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_email'), 'sreenivas')

WebUI.setEncryptedText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_password'), 
    'U4RF76YmIQw=')

WebUI.setEncryptedText(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_confirmPassword'), 
    'U4RF76YmIQw=')

WebUI.click(findTestObject('Object Repository/Local_Global variables_OR/Page_Register Mercury Tours/input_submit'))

WebUI.closeBrowser()

