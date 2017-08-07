package com.QAUber;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.*;

public class BidQA_Home_Test {
    @Test
    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();
        BidQA_PageResources page = new BidQA_PageResources(driver);

        // Load test BidQA site

        driver.get("http://test.bidqa.com/");
        Thread.sleep(3000);
        System.out.println("Loading site");

        // Home link

       /* page.getBidQAHome().BidQAHome().click();
        Thread.sleep (3000);
        System.out.println("Found'Home'");*/

        //About Us link
        page.getBidQAHome().BidQAAboutUs().click();
        Thread.sleep(3000);
        Assert.assertEquals("About Us",driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/div[1]")).getText());
        System.out.println("Found 'About Us'");

        //For QA Professional link
        page.getBidQAHome().BidQA_QAProfessional().click();
        Thread.sleep(3000);
        Assert.assertEquals("For QA Professionals",driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div[1]")).getText());
        System.out.println("Found 'QA Professional'");

        // For Project Owners link
        page.getBidQAHome().BidQA_ForProjectOwners().click();
        Thread.sleep(3000);
        Assert.assertEquals("For Project Owners",driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div[1]")).getText());
        System.out.println("Found 'For Project Owner'");

        // Q&A link
        page.getBidQAHome().BidQA_QA().click();
        Thread.sleep(3000);
        Assert.assertEquals("Q&A",driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div[1]")).getText());
        System.out.println("Found 'Q&A' ");

        //Support link
        page.getBidQAHome().BidQA_Support().click();
        Thread.sleep(3000);
        Assert.assertEquals("Support",driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div[1]")).getText());
        System.out.println("Found 'Support' ");

        //Register link
        page.getBidQAHome().BidQA_Register().click();
        Thread.sleep(3000);
        Assert.assertEquals("Register - BidQA",driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div")).getText());
        System.out.println("Found 'Register' ");

        //Login link
        page.getBidQAHome().BidQA_Login().click();
        Thread.sleep(3000);
        Assert.assertEquals("Login - BidQA",driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div")).getText());
        System.out.println("Found 'Login' ");

        //complete
        System.out.println("All navigation links clicked. Test passed!");

        //clean up
        driver.close();
        driver.quit();
    }
}





