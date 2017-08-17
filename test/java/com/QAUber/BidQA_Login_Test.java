package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BidQA_Login_Test {


      public String strActualResult;

      QA_Data data = new QA_Data();

    @Test
    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();
        BidQA_PageResources page = new BidQA_PageResources(driver);

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


        /* This code works only if user is logged in as a QA. It the code has to be commented
         when user is logged in as aproject owner. */

       /*  page.getBidQALogin().BidQA_Login_PopUpWindow().click();
        Thread.sleep(3000); */


        strActualResult = page.getBidQALogin().BidQA_Login_WelcomeMessage().getText().toUpperCase();

        System.out.println(strActualResult);

        Assert.assertEquals(data.strWelcomeMessage.toUpperCase(),strActualResult );
        System.out.println("Login Successfully");
        Thread.sleep(3000);

        ////Click on Logout
        page.getBidQALogin().BidQA_Logout().click();



        driver.close();
        driver.quit();



    }
}
