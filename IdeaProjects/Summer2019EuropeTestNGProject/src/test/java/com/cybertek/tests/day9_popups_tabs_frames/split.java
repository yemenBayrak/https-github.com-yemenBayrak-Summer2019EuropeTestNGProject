package com.cybertek.tests.day9_popups_tabs_frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class split {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
        driver.get("https://www.google.com.tr/");
        WebElement btn1=driver.findElement(By.name("btnI"));
        btn1.click();
    }
}
