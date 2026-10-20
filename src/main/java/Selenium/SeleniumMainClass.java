package Selenium;

public class SeleniumMainClass {

    public static void main(String[] args) throws InterruptedException {

        SeleniumBasics basics = new SeleniumBasics();
        basics.introduction();
        Locators locators = new Locators();
        locators.locatorsPractice();
        locators.rahulShettyCode();
        BrowserNavigations navigations = new BrowserNavigations();
        navigations.navigation();

    }
}
