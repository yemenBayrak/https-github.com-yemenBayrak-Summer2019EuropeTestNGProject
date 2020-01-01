package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
        driver.quit();

    }
}
