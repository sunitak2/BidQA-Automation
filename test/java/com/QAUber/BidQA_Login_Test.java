package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BidQA_Login_Test {


      public String strActualResult;

      BidQA_DataLoginPage dataLoginPage = new BidQA_DataLoginPage();

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


        //Enter login credentials
        page.getBidQALogin().BidQA_Login_UserName().clear();
        page.getBidQALogin().BidQA_Login_UserName().sendKeys(dataLoginPage.strUserName);
        page.getBidQALogin().BidQA_Login_Password().clear();
        page.getBidQALogin().BidQA_Login_Password().sendKeys(dataLoginPage.strPassWord);
        page.getBidQALogin().BidQA_Login_SignUp().click();



        System.out.println("Login Successfully");
        Thread.sleep(3000);

        /* This code works only if user is logged in as a QA. It the code has to be commented
         when user is logged in as aproject owner. */

       /*  page.getBidQALogin().BidQA_Login_PopUpWindow().click();
        Thread.sleep(3000); */


        strActualResult = page.getBidQALogin().BidQA_Login_WelcomeMessage().getText().toUpperCase();

        System.out.println(strActualResult);

        Assert.assertEquals(dataLoginPage.strWelcomeMessage.toUpperCase(),strActualResult );

        ////Click on Logout
        page.getBidQALogin().BidQA_Logout().click();



            driver.close();
            driver.quit();



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
