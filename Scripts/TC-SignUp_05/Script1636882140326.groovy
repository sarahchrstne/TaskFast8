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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'hyukjaeiloveyou44@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_Mrs'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mrs_id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Sarah')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'C')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'tzH6RvlfSTg=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '2004', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'Cityland')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'), 'Dubs')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'Dubss')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '14', true)

WebUI.setText(findTestObject('Page_Login - My Store/input__postcode'), '12345')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/p_Country United States-United States'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '78665321')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_AuthenticationCreate an accountYour per_cf09ea'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__alias'), 'House')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_There is 1 errorpasswd is invalid'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/li_passwd is invalid'))

