package com.QAUber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BidQA_Register_Test {
    @Test

    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();
        BidQA_PageResources page = new BidQA_PageResources(driver);
        QA_Data data = new QA_Data();

        // Load test BidQA site

        driver.get(data.strWebSiteName);
        Thread.sleep(3000);
        System.out.println("Loading site");


        page.getBidQAHome().BidQA_Register().click();

        Assert.assertEquals(page.getBidQARegisteration().BidQA_Registeration_Title().getText(), data.strRegTitle);
        System.out.println("Test passed");

        driver.close();
        driver.quit();

    }
    }
