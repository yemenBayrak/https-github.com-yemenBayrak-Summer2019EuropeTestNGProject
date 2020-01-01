package com.cybertek.tests.day3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    public static void main(String[] Args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("email@gmail.com");
        String expectedEmail = "test@gmail.com";
        emailInput.sendKeys(expectedEmail);
        String actualEmail = emailInput.getAttribute("value");
        if ((expectedEmail.equals(actualEmail))){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("expectedEmail ="+expectedEmail);
            System.out.println("actualEmail ="+actualEmail);
        }
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        String expectedMessage ="Your e-mail's been sent!";
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        //System.out.println(messageElement);
        String actualMessage = messageElement.getText();
        System.out.println(actualMessage);
        if (expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println(expectedMessage);
            System.out.println(actualMessage);
        }
            Thread.sleep(3000);
            driver.quit();

    }}
