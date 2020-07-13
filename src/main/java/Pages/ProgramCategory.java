package Pages;


import Common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgramCategory extends Utilities {

    private static By requestInfo = By.xpath("/html/body/div[2]/main/div[1]/div/div/div/nav/ul/a[2]");
    private static By selectByDegree = By.xpath("//*[@id=\"degree-type\"]");
    private static By selectByInterestArea = By.xpath("//*[@id=\"interest-area\"]");
    private static By selectByProgram = By.xpath("//*[@id=\"program\"]");
    private static By continueButton = By.xpath("//*[contains(text(),'Continue')]");


    public static void clickOnRequestInfo() {
        Utilities.clickElement(requestInfo);
    }

    public static void selectDegreeType(String text) {
        Utilities.selectByVisisbleText(selectByDegree, text);
    }

    public static void selectAreaOfInterest(String text) { Utilities.selectByVisisbleText(selectByInterestArea, text); }

    public static void selectProgramType(String text) { Utilities.selectByVisisbleText(selectByProgram, text); }

    public static void clickOnContinuByJS() { Utilities.clickElementByJS(continueButton); }
}

