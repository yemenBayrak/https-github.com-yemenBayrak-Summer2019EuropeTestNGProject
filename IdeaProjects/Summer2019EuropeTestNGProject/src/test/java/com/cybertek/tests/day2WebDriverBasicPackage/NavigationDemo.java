package com.cybertek.tests.day2WebDriverBasicPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main (String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        driver.navigate().to("https://www.facebook.com");
        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
