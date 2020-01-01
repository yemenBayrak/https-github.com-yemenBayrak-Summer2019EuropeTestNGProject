package com.cybertek.tests.day2WebDriverBasicPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDriverandTitle {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //import class CMD+ENTER or ALT+enter or CONTROL +SPACE
        //selenium object
       // WebDriver driver = new ChromeDriver();

        //navigate to website
        driver.get("https://www.amazon.com");
        String title = driver.getTitle();
        System.out.println("Title= "+title);
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl= "+ currentUrl);
    }
}
