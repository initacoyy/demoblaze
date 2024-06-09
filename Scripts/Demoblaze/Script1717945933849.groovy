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

WebUI.openBrowser('https://www.demoblaze.com/')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Login/Call Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Cart/Gambar Handphone'))

WebUI.click(findTestObject('Cart/Add to cart_handphone'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Cart/Button Cart Home'))

WebUI.verifyElementPresent(findTestObject('Cart/Delete'), 0)

WebUI.click(findTestObject('Place Order/button Place Order'))

WebUI.setText(findTestObject('Place Order/place-order_Nama'), 'Tasya')

WebUI.setText(findTestObject('Place Order/place-order_Country'), 'Indonesia')

WebUI.setText(findTestObject('Place Order/place-order_City'), 'Depok')

WebUI.setText(findTestObject('Place Order/place-order_Credit card'), '13245648566')

WebUI.setText(findTestObject('Place Order/place-order_Month-CC'), '11')

WebUI.setText(findTestObject('Place Order/place-order_Year-CC'), '25')

WebUI.click(findTestObject('Place Order/place-ordeer button_Purchase'))

WebUI.verifyTextPresent('', false)

WebUI.click(findTestObject('Place Order/button ok'))

WebUI.closeBrowser()

