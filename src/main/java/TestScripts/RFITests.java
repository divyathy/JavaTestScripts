package TestScripts;

import Common.ASUDataProvider;
import Common.ExcelData;
import Common.Utilities;
import Pages.PersonalInfo;
import Pages.ProgramCategory;
import Pages.ThankYouPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RFITests {

    String baseURI= "https://asuonline.asu.edu/";

    @Test(dataProvider = "getTestData", dataProviderClass = ASUDataProvider.class)
    public void testASUData(String DegreeType, String AreaOfInterest, String ProgramType, String FirstName, String LastName, String Email, String CountryCode, String PhoneNumber) throws InterruptedException {
        Utilities.initializeChromeDriver(baseURI);
        ProgramCategory.clickOnRequestInfo();
        ProgramCategory.selectDegreeType(DegreeType);
        ProgramCategory.selectAreaOfInterest(AreaOfInterest);
        ProgramCategory.selectProgramType(ProgramType);
        PersonalInfo.clickOnCookie();
        ProgramCategory.clickOnContinuByJS();
        PersonalInfo.enterFirstName(FirstName);
        PersonalInfo.enterLastName(LastName);
        PersonalInfo.enterEmail(Email);
        PersonalInfo.clickCountryCode();
        PersonalInfo.selectCountryCode();
        PersonalInfo.enterPhoneNumber(PhoneNumber);
        PersonalInfo.clickOnSubmit();
        Thread.sleep(3000);
        ThankYouPage.thankYouInfo();

    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][]= ExcelData.getTestData("Sheet1");
        return data;
    }

}



