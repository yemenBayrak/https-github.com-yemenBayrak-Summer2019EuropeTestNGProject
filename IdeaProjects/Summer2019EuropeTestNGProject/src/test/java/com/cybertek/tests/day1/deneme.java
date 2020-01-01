package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cybertekschool.com");
        String title= driver.getTitle();
        System.out.println("Title= "+title);
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl="+currentUrl);
        String pageSourse=driver.getPageSource();
        System.out.println("pageSourse= "+pageSourse);


    }
}
