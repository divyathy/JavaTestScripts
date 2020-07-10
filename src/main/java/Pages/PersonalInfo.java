package Pages;

import Common.Utilities;
import org.openqa.selenium.By;

public class PersonalInfo extends Utilities{


    private static By firstName= By.xpath("//*[@id=\"first-name\"]");
    private static By lastName= By.xpath("//*[@id=\"last-name\"]");
    private static By email= By.xpath("//*[@id=\"email\"]");
    private static By phoneNumber= By.xpath("//*[@id=\"asuonline_phone_number\"]");
    private static By countryCode= By.xpath("//*[@id=\"phone-number-group\"]/div/div[1]/div[1]");
    private static By submitButton= By.xpath("//*[@id=\"asuo-rfi\"]/div/div[2]/div/div/button");

    public static void enterFirstName(String text) { Utilities.sendText(firstName, text); }
    public static void enterLastName(String text) { Utilities.sendText(lastName, text); }
    public static void enterEmail(String text) { Utilities.sendText(email, text); }
    public static void selectCountryCode(String text) { Utilities.selectByVisisbleText(countryCode, text); }
    public static void enterPhoneNumber(String text) { Utilities.sendText(phoneNumber, text); }
    public static void clickOnSubmit() { Utilities.clickElement(submitButton); }
    public static void waitUntilException(By xpath){ Utilities.clickElement(firstName);
    }

}
