package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;

public class CallWebdriverFactory {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
    }
}
