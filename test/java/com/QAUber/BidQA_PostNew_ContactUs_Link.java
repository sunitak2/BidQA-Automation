package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BidQA_PostNew_ContactUs_Link {

    public String strActualResult;


    @Test
    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();
        BidQA_PageResources page = new BidQA_PageResources(driver);
        QA_Data data = new QA_Data();

        // Load test BidQA site

        driver.get(data.strWebSiteName);
        Thread.sleep(3000);
        System.out.println("Loading site");

        //Login link
        page.getBidQAHome().BidQA_Login().click();
        Thread.sleep(3000);


        //Enter login credentials
        page.getBidQALogin().BidQA_Login_UserName().clear();
        page.getBidQALogin().BidQA_Login_UserName().sendKeys(data.strUserName);
        page.getBidQALogin().BidQA_Login_Password().clear();
        page.getBidQALogin().BidQA_Login_Password().sendKeys(data.strPassWord);
        page.getBidQALogin().BidQA_Login_SignUp().click();

        strActualResult = page.getBidQALogin().BidQA_Login_WelcomeMessage().getText().toUpperCase();

        Assert.assertEquals(data.strWelcomeMessage.toUpperCase(),strActualResult );

        //Click on Post new project
        page.getBidQAPostNew().BidQAPostNew_Link().click();

        Thread.sleep(3000);

        //Click on 'Don't see your country, Contact US!'

        page.getBidQAPostNew().BidQA_PostNew_DoNotSeeCountry().submit();



        driver.findElement(By.xpath("//*[@id=\"wpcf7-f146-p10-o1\"]/p[1]")).getText();

        Thread.sleep(3000);

        System.out.println(page.getBidQAPostNew().BidQA_PostNew_DoNotSeeCountry().getText());


        page.getBidQALogin().BidQA_Logout().click();



        // Close the Browser
        driver.close();
        driver.quit();

    }
}
