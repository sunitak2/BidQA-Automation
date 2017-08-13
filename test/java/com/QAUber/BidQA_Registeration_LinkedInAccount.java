package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BidQA_Registeration_LinkedInAccount {

    @Test
    public void test1() throws Exception {

        WebDriver driver = new ChromeDriver();
        BidQA_PageResources page = new BidQA_PageResources(driver);
        BidQA_DataLoginPage dataLoginPage = new BidQA_DataLoginPage();

        // Load test BidQA site

        driver.get("http://test.bidqa.com/");
        Thread.sleep(3000);
        System.out.println("Loading site");

        //Click on Register link
        page.getBidQAHome().BidQA_Register().click();
        Thread.sleep(3000);

        Assert.assertEquals(dataLoginPage.strRegTitle,page.getBidQARegisteration().BidQA_Registeration_Title().getText().trim());
        System.out.println("Found 'Register' ");

        // Click on 'Sign Up with LinkedIn'
        page.getBidQARegisteration().BidQA_SignUPLinkedIn().click();

       // Verify that user is on right Linedin page

        Assert.assertEquals(page.getBidQARegisteration().BidQA_Logo().getAttribute("title"), "bidqa.com");
        Assert.assertEquals(page.getBidQARegisteration().BidQA_LinkedInLogo().getText(),"LinkedIn");

        driver.close();
        driver.quit();



    }
}
