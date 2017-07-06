

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.media.rtp.rtcp.Report

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

//def info = ['url': '','username': '','password': '']
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
println greet
//patientpanel
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/span_md-select-icon'))
//
//Thread.sleep(3000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/md-option_select_option_8'))
//
//Thread.sleep(3000)
//
//WebUI.setText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/input_MyPatientListSearchInput'), 
//    '4')
//
//Thread.sleep(3000)
//
//String ele = WebUI.getText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/span_ID 120575'))
//
//System.out.print(ele)
//
//Thread.sleep(3000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/md-icon_mpl-search-box-clear'))
//
//Thread.sleep(5000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/right arrow'))
//
//Thread.sleep(3000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/patientPanelOpen'))
//
//Thread.sleep(3000)
//
//not_run: WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/vertical ellipsis'))
//
//Thread.sleep(3000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/md-icon_ng-scope (1)'))
//
//Thread.sleep(3000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/patientpanelFilterClose'))

//Thread.sleep(3000)
//
//WebUI.setText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/carebookFnSearch'), 
//    'matest')
//
//Thread.sleep(3000)
//
//WebUI.setText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/carebookLnSearch'), 
//    'matest')
//
//Thread.sleep(3000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/carebookSearchIcon'))
//
//Thread.sleep(3000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/careBookPatientClick'))
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/careBookPatientClick'))
//
//Thread.sleep(8000)
//
//WebUI.switchToFrame(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/CareBook_Frame'), 
//    5)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/careplanOptionsDropdown'))
//
//Thread.sleep(2000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/careplanOptionsDropdown'))
//
//Thread.sleep(2000)
////WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/carebookDropDown'))
//Thread.sleep(2000)

//WebUI.selectOptionByValue(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/carebookDropDown'), 'Auto-Populated', false)
//Thread.sleep(2000)
//WebUI.setText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/carebookIssues'), 
//    'test')
//
//Thread.sleep(2000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/carebookDate'))
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/carebookDate15'))
//
//Thread.sleep(3000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/carebookCareteamButton'))
//
//Thread.sleep(3000)
//
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/CarebookCareplanSummaryDropdown'))
//WebUI.switchToDefaultContent()
//String temp = WebUI.getText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/patientPanelFirstPatient'))
//println "$temp"
//println "$temp" == 'matest, matest'
Thread.sleep(3000)


'Login Page'
varA = WebUI.verifyElementPresent(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/right arrow'),5)

if (varA== true){
   println('Dashboard is displayed')
   Thread.sleep(3000)
   WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/preferenceDropDown'))
   Thread.sleep(3000)
   WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/preferenceUp'))
   Thread.sleep(3000)
} else {
println('Dashboard is not displayed')
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/logoutClick'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/logoutYes'))
//Thread.sleep(3000)
  
}
//if (WebUI.verifyElementPresent(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/taskManagerIcon')) == true) {
//	println "the task manager icon is present and verified successfully"
//	println "the task manager icon is present and verified successfully"
//	println "the task manager icon is present and verified successfully"
//	} else {
//	println "the task manager icon is not present and verified successfully"
//	println "the task manager icon is not present and verified successfully"
//	println "the task manager icon is not present and verified successfully"
//	}
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/taskManagerIcon'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/takManagerNewTask'))
//Thread.sleep(3000)
//WebUI.setText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/TaskManagerNewTaskName'), "test")
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/taskmanagerNewTaskDate'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/taskManagerNewTaskDate11'))
//Thread.sleep(3000)
//WebUI.setText(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/taskManagerDescription'), "test")
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/taskmanagerNewTaskClose'))
//Thread.sleep(3000)


//preference

//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/preferenceDropDown'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/preferenceSetting'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/preferenceDate'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/preferenceDateOne'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/preferencePrefix'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/preferencePrefixSelect'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/preferenceClose'))
//Thread.sleep(3000)

//pop manager
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/popmanagerIcon'))
//Thread.sleep(3000);
////WebUI.switchToWindowIndex(1)
//WebUI.switchToWindowTitle('Pentaho User Console')
//Thread.sleep(10000)
////WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/popmanagerCreateNew'))
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/popmanagerHomeDropdown'))
//Thread.sleep(4000)
////WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/popmanagerBrowseFiles'))
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/popmanagerBrowseFiles'))
//Thread.sleep(8000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/popmanagerPublicExpand'))
//Thread.sleep(5000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/popmanagerPublicExpand'))
//Thread.sleep(5000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/popmanagerReload'))
//Thread.sleep(10000)
//WebUI.switchToDefaultContent()
//WebUI.closeBrowser()
//
//
//Report
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/reportIcon'))
//Thread.sleep(4000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/reportDownloadReport'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/reportTimePeriod'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/reportTimePeriodSelect'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/reportClose'))

//logout
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/logoutClick'))
//Thread.sleep(3000)
//WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/Page_Health Home Dashboard (1)/logoutYes'))
//Thread.sleep(3000)
//WebUI.closeBrowser()


//home
WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/home/homeCCP'))
Thread.sleep(3000)
WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/home/homePatientIssues'))
Thread.sleep(3000)
WebUI.click(findTestObject('Object Repository/FirstScriptUsingToolOr/home/homeUnkown'))



WebUI.callTestCase(findTestCase('baseTest/LoginLogoutTestcase'), [:], FailureHandling.STOP_ON_FAILURE)
