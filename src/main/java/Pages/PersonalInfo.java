package Pages;

import Common.Utilities;
import org.openqa.selenium.By;

public class PersonalInfo extends Utilities{


    private static By firstName= By.xpath("//*[@id=\"first-name\"]");
    private static By lastName= By.xpath("//*[@id=\"last-name\"]");
    private static By email= By.xpath("//*[@id=\"email\"]");
    private static By phoneNumber= By.xpath("//*[@id=\"asuonline_phone_number\"]");
    private static By countryCode= By.xpath("//*[@id=\"asuonline_country_selector\"]");
    private static By selectCountry= By.xpath("//*[@id=\"phone-number-group\"]/div/div[1]/div[1]/div/div[3]/div[231]/div[2]");
    private static By submitButton= By.xpath("//*[@id=\"asuo-rfi\"]/div/div[2]/div/div/button");
    private static By cookie= By.xpath("/html/body/div[1]/div/a");

    public static void enterFirstName(String text) { Utilities.sendText(firstName, text); }
    public static void enterLastName(String text) { Utilities.sendText(lastName, text); }
    public static void enterEmail(String text) { Utilities.sendText(email, text); }
    public static void clickCountryCode() { Utilities.clickElement(countryCode); }
    public static void selectCountryCode(){Utilities.clickElement(selectCountry);}
    public static void enterPhoneNumber(String text) { Utilities.sendText(phoneNumber, text); }
    public static void clickOnSubmit() { Utilities.clickElementByJS(submitButton); }
    public static void waitUntilException(By xpath){ Utilities.clickElement(firstName); }
    public static void clickOnCookie(){ Utilities.clickElement(cookie); }

}
