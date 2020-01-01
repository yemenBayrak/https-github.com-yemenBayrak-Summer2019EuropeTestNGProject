package com.cybertek.tests.day4Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorPractice {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webDriver.chrome.driver","chromedriver" );
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com");
         WebElement btn1= driver.findElement(By.id("gsr"));
        // String accualText=btn1.getAttribute(class="hp vasq big");
     //  btn1.click();
        //Thread.sleep(5000);
       // driver.close();
    }
}
