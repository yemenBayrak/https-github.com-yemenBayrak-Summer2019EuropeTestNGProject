package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {
    public static void main(String[] args){ //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //navigate to website
        driver.get("https://www.amazon.com/s?k=selenium&ref=nb_sb_noss_1");

    }
}
