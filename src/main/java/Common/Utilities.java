package Common;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utilities {

    static WebDriver driver=null;
    public static boolean elementIsEnabled = new Boolean(false);

      public static void initializeChromeDriver(String url){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriverNew.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void  initializeIE(){
        System.setProperty("webdriver.IE.driver", "");
        driver=new ChromeDriver();

    }

    public static void closeDriver(){
        driver.close();
    }

    public static void quitDriver(){
        driver.quit();
    }


    public static void clickElement(By xpath){
        if(isPresent(xpath)==true) {
            WebElement element = driver.findElement(xpath);
            element.click();
        }
    }

    public static void clickElementByJS(By xpath){
        WebElement ele = driver.findElement(xpath);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public static void sendText(By xpath,String key){
        if(isPresent(xpath)==true) {
            WebElement element = driver.findElement(xpath);
            element.sendKeys(new CharSequence[]{key});
        }
    }

    public static String getText(By xpath){
        if(isPresent(xpath)==true) {
            WebElement element = driver.findElement(xpath);
            String text = element.getText();
            return text;
        }
        return "";
    }

    public static Boolean isPresent(By xpath){
        try{
            WebElement element = driver.findElement(xpath);
            return element.isDisplayed();
        }catch(Exception var){
            System.out.println("error in finding element"+var);
            return false;
        }
    }

    public static void selectByVisisbleText(By xpath,String text) {
        Select degreeDropDown = new Select(driver.findElement(xpath));
        degreeDropDown.selectByVisibleText(text);
    }


public static boolean waitCondition(String xpath){

    WebDriverWait wait = new WebDriverWait( driver, 10 );
    try {
        if( wait.until( ExpectedConditions.visibilityOfElementLocated( By.xpath( xpath ) ) ) != null ) {
            return true;
        } else {
            return false;
        }
    } catch( TimeoutException e ) {
        e.printStackTrace();
        return false;
        }
    }
}
