package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

    public void locatorsPractice() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //To navigate to the given URL
        driver.get("https://www.sreenidhirajakrishnan.com/practice");
        driver.findElement(By.name("username")).sendKeys("AjayRyhan");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ajay.practice@gmail.com");
        driver.findElement(By.cssSelector("input[data-testid='phone-input']")).sendKeys("9990004441");
        driver.findElement(By.cssSelector("#textarea-input"))
                .sendKeys("Whether you are a young professional or an experienced leader, we have the right program for you.");
        //driver.findElement(By.xpath("//button[@class='btn-primary practice-submit']")).click(); //Method 1
        driver.findElement(By.xpath("//button[text()='Submit']")).click(); //Method 2

    }

}
