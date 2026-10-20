package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

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
        driver.findElement(By.cssSelector("button[type='reset']")).click();
    }

    public void rahulShettyCode() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);//
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }

}
