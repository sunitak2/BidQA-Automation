package com.QAUber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BidQA_Register_Test {
    @Test

    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();
        BidQA_PageResources page = new BidQA_PageResources(driver);

        // Load test BidQA site

        driver.get("http://www.test.bidqa.com");
        Thread.sleep(3000);
        System.out.println("Loading site");


        page.getBidQAHome().BidQA_Register().click();



        System.out.println("All navigation links clicked. Test passed!");
    }
    }
