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

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'asdfghjklosh@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mrs_id_gender'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_First name'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Sarah')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'C')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'GRcB2SbM9PYN3SPqDsZKKA==')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_AuthenticationCreate an accountYour per_8bfe13'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '2004', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), 'testing')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'Tarutung')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'), 'Kota')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'North Tapanuli')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_Your addressFirst name Last name Compan_14dbdc'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '11', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '65543')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'), '09776532')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '08876554321')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__alias'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_AuthenticationCreate an accountYour per_90fe0c'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__alias'), 'Home')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/textarea_Additional information_other'), 'yes')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/a_Sign out'))

