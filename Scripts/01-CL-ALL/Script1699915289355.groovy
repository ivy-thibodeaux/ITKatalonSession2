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

WebUI.navigateToUrl('https://houston.craigslist.org/')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_community'), 
    'community')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_housing'), 
    'housing')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_jobs'), 
    'jobs')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/a_services'), 
    'services')

WebUI.mouseOver(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_for sale'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/a_craigslist'), 
    'craigslist')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/a_event calendar'), 
    'event calendar')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/a_craigslist app'), 
    'craigslist app')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/a_help, faq, abuse, legal'), 
    'help, faq, abuse, legal')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_discussion forums'), 
    'discussion forums')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_gigs'), 
    'gigs')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_resumes'), 
    'resumes')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_activities'), 
    'activities')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_artists'), 
    'artists')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_childcare'), 
    'childcare')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_events'), 
    'events')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_general'), 
    'general')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_groups'), 
    'groups')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/a_localnews'), 
    'local news')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_lostfound'), 
    'lost+found')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_missed connections'), 
    'missed connections')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_musicians'), 
    'musicians')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_pets'), 
    'pets')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_politics'), 
    'politics')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_rants  raves'), 
    'rants & raves')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_rideshare'), 
    'rideshare')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_volunteers'), 
    'volunteers')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_apts  housing'), 
    'apts / housing')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_housing wanted'), 
    'housing wanted')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_office  commercial'), 
    'office / commercial')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_parking  storage'), 
    'parking / storage')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/a_real estate for sale'), 
    'real estate for sale')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_rooms  shared'), 
    'rooms / shared')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_rooms wanted'), 
    'rooms wanted')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_sublets  temporary'), 
    'sublets / temporary')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_vacation rentals'), 
    'vacation rentals')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_automotive'), 
    'automotive')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/a_beauty'), 
    'beauty')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_cellmobile'), 
    'cell/mobile')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_computer'), 
    'computer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_creative'), 
    'creative')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_cycle'), 
    'cycle')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_event'), 
    'event')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_farmgarden'), 
    'farm+garden')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_financial'), 
    'financial')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_healthwell'), 
    'health/well')

WebUI.verifyElementText(findTestObject('Object Repository/Page_craigslist houston jobs, apartments, f_d7f9af/span_household'), 
    'household')

WebUI.closeBrowser()

