package Pages;

import Common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ThankYouPage  {

    static WebDriver driver;
    private static By thankYouMessage= By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/h1");

    public static void thankYouInfo() { Utilities.getText(thankYouMessage);
        Assert.assertTrue(driver.findElement(thankYouMessage).isDisplayed(),"Thank you for your interest in ASU Online");
    }

}
