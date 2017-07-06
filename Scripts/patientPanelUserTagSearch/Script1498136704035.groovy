import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def info = [('url') : '', ('username') : '', ('password') : '']

//def data=TestDataFactory.findTestData("Data Files/FirstTestData")
//info.url=data.getValue(1, 1)
//info.username=data.getValue(2, 1)
//info.password=data.getValue(3, 1)
//def url=info.url
//def password=info.password
//def username=info.username
//open browser
WebUI.openBrowser(url)

//login
WebUI.setText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/input_UserID'), username)

WebUI.setText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/input_Password'), 
    password)

WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/span_Lets find some bugs'))

WebUI.waitForElementVisible(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/div_appEnrollment_menu'), 
    10)



//patientpanel
WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/span_md-select-icon'))

Thread.sleep(3000)

WebUI.click(findTestObject('FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/md-option_select_option_8', [('hello') : 10
            , ('iyhf') : 10]))

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/patient panel/patientpanelFilter'))

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/patient panel/patientPanelFilterMa'))

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/patientpanelFilterClose'))

Thread.sleep(3000)

String ele = WebUI.getText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/patient panel/patientpanelMaText'))

if (ele.equalsIgnoreCase('AA')) {
    println('the tag ma is present for ma Filter')
} else {
    println('the tag ma is not present for ma Filter')
}

varA = WebUI.verifyElementPresent(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/patient panel/patientpanelMaText'), 
    10)

if (varA == true) {
    println('Dashboard is displayed')
} else {
    println('Dashboard is not displayed')
}

//logout
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/logoutClick'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/logoutYes'))
//Thread.sleep(3000)
//WebUI.closeBrowser()
DisplayName()

def DisplayName() {
    WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/logoutClick'))

    Thread.sleep(3000)

    WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/logoutYes'))

    Thread.sleep(3000)

    WebUI.closeBrowser()
}

