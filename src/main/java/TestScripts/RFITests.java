package TestScripts;

import Common.ASUDataProvider;
import Common.ExcelData;
import Common.Utilities;
import Pages.PersonalInfo;
import Pages.ProgramCategory;
import Pages.ThankYouPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RFITests {

    String baseURI= "https://asuonline.asu.edu/";
    private static By firstName= By.xpath("//*[@id=\"first-name\"]");
    WebDriver driver;

    @Test(dataProvider = "getTestData", dataProviderClass = ASUDataProvider.class)
    public void testASUData(String DegreeType, String AreaOfInterest, String ProgramType, String FirstName, String LastName, String Email, String CountryCode, String PhoneNumber) throws InterruptedException {
        Utilities.initializeChromeDriver(baseURI);
        Thread.sleep(1000);
        ProgramCategory.clickOnRequestInfo();
        ProgramCategory.selectDegreeType(DegreeType);
        Thread.sleep(1000);
        ProgramCategory.selectAreaOfInterest(AreaOfInterest);
        Thread.sleep(1000);
        ProgramCategory.selectProgramType(ProgramType);
        Thread.sleep(2000);
        ProgramCategory.clickOnContinu();
        PersonalInfo.waitUntilException(firstName);
        PersonalInfo.enterFirstName(FirstName);
        Thread.sleep(1000);
        PersonalInfo.enterLastName(LastName);
        Thread.sleep(1000);
        PersonalInfo.enterEmail(Email);
        Thread.sleep(1000);
        PersonalInfo.selectCountryCode(CountryCode);
        Thread.sleep(1000);
        PersonalInfo.enterPhoneNumber(PhoneNumber);
        Thread.sleep(2000);
        PersonalInfo.clickOnSubmit();
        ThankYouPage.thankYouInfo();
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][]= ExcelData.getTestData("Sheet1");
        return data;
    }

}



