package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigations {

    public void navigation(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sreenidhirajakrishnan.com/practice");
        driver.navigate().to("https://rahulshettyacademy.com/");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
