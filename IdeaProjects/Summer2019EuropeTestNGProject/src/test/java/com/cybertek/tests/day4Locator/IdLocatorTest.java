package com.cybertek.tests.day4Locator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cybertekschool.com/multiple_buttons");
        WebElement dontClickButton = driver.findElement(By.id("disapparing_button"));
        dontClickButton.click();
        driver.quit();
    }
}
