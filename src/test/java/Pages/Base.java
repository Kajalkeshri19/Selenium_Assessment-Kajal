package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Base {

    public WebDriver initializeDriver() throws IOException {
        System.setProperty("webdriver.chrome.driver","/home/knoldus/Test_Automation_Project/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
