package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Utility;

import java.time.Duration;

public class BaseTest{

    public static WebDriver driver;

    public static String baseUrl= "https://demo.nopcommerce.com/";

    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();
        // Launch the Url
        driver.get(baseUrl);
        // maximise the window
        driver.manage().window().maximize();
        // implicit Timeout

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void closeBrowser(){
        driver.quit();
    }
}


