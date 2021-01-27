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

import io.appium.java_client.android.AndroidDriver as AndroidDriver
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.google.common.collect.ImmutableMap as ImmutableMap
import io.appium.java_client.MobileElement as MobileElement

Mobile.tap(findTestObject('android.widget.Spinner - Tgl Lahir'), 0)

Mobile.scrollToText('22')

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - 22'), 0)

Mobile.tap(findTestObject('android.widget.Spinner - Bln Lahir'), 0)

Mobile.scrollToText('Juli')

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Juli'), 0)

Mobile.tap(findTestObject('android.widget.Spinner - Thn Lahir'), 0)

Mobile.scrollToText('1996')

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - 1996'), 0)

Mobile.tap(findTestObject('android.widget.TextView - No. Handphone'), 2)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.getKeyboard().sendKeys('82178626286')

Mobile.tap(findTestObject('android.widget.EditText (6)'), 2)

Mobile.setText(findTestObject('android.widget.EditText (6)'), '085213', 2)

Mobile.tap(findTestObject('android.widget.EditText (5)'), 2)

Mobile.setText(findTestObject('android.widget.EditText (5)'), '085213', 2)

Mobile.hideKeyboard()

Mobile.delay(3)

