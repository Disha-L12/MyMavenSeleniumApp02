package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
        options.addArguments("--headless=new");       // modern headless mode
        options.addArguments("--no-sandbox");         // required in Jenkins/Linux
        options.addArguments("--disable-dev-shm-usage"); // prevents crashes
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080"); // optional but useful
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
