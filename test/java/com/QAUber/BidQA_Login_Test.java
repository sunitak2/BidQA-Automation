package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BidQA_Login_Test {


    @Test
    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();
        BidQA_PageResources page = new BidQA_PageResources(driver);

        // Load test BidQA site

        driver.get("http://test.bidqa.com/");
        Thread.sleep(3000);
        System.out.println("Loading site");

        //Login link
        page.getBidQAHome().BidQA_Login().click();
        Thread.sleep(3000);
        //Clear user name text box
        driver.findElement(By.xpath("//*[@id=\"log\"]")).clear();
        //Enter user name in the text box
        driver.findElement(By.xpath("//*[@id=\"log\"]")).sendKeys("login");
        //Clear password text box.
        driver.findElement(By.xpath("//*[@id=\"login_password\"]")).clear();
        //Enter password in the password text box
        driver.findElement(By.xpath("//*[@id=\"login_password\"]")).sendKeys("password");
        //Click submit button
        driver.findElement(By.xpath("//*[@id=\"submits\"]")).click();
        //Verify welcome message after loggin into the account
        Assert.assertEquals("Welcome Sunita",driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[4]")).getText());
        System.out.println("Found 'Login Successfully' ");


    }
}
