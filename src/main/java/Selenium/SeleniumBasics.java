package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //To navigate to the given URL
        driver.get("https://www.sreenidhirajakrishnan.com/practice");
        //To get the title of the page
        String pageTitle = driver.getTitle();
        //To get the current URL
        String navigatedURL = driver.getCurrentUrl();
        Thread.sleep(3000);
        System.out.println("The page title is " + pageTitle + "and the navigated URL is " + navigatedURL);
        driver.close();
    }
}
