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

Mobile.callTestCase(findTestCase('TC_15_Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Beranda/Akun'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Atur Profile'), 0)

Mobile.tap(findTestObject('Akun/Atur Profile Page/android.widget.EditText - Nama Lengkap'), 0)

Mobile.setText(findTestObject('Akun/Atur Profile Page/android.widget.EditText - Nama Lengkap'), 'nama baru', 0)

Mobile.tap(findTestObject('Akun/Atur Profile Page/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Akun/Atur Profile Page/android.widget.EditText - Email'), 'email baru', 0)

Mobile.tap(findTestObject('Akun/Atur Profile Page/android.widget.EditText - Nomor Telephone'), 0)

Mobile.setText(findTestObject('Akun/Atur Profile Page/android.widget.EditText - Nomor Telephone'), '08123123', 0)

Mobile.tap(findTestObject('Akun/Atur Profile Page/Simpan'), 0)

Mobile.pressBack()

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

