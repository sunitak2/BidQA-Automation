package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BidQA_Registeration_FacebookAccount {




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
        Assert.assertEquals(dataLoginPage.strRegTitle, page.getBidQARegisteration().BidQA_Registeration_Title().getText().trim());
        System.out.println("Found 'Register' ");

        // Click on 'Sign Up with Facebook'

        page.getBidQARegisteration().BidQA_SignUPFacebook().click();

        //Verify that user is on facebook log in page
        Assert.assertEquals(page.getBidQARegisteration().BidQA_FacebookSignIn().getText(),"Log into Facebook");

        driver.close();
        driver.quit();
    }
}
