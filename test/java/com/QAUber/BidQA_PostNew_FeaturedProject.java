package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BidQA_PostNew_FeaturedProject {

    @Test
    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        BidQA_PageResources page = new BidQA_PageResources(driver);
        BidQA_DataLoginPage dataLoginPage = new BidQA_DataLoginPage();

        // Load test BidQA site

        driver.get("http://test.bidqa.com/");
        Thread.sleep(3000);
        System.out.println("Loading site");

        //Login link
        page.getBidQAHome().BidQA_Login().click();
        Thread.sleep(3000);

        page.getBidQALogin().BidQA_Login_UserName().clear();
        page.getBidQALogin().BidQA_Login_UserName().sendKeys(dataLoginPage.strUserName);
        page.getBidQALogin().BidQA_Login_Password().clear();
        page.getBidQALogin().BidQA_Login_Password().sendKeys(dataLoginPage.strPassWord);
        page.getBidQALogin().BidQA_Login_SignUp().click();

        Assert.assertEquals(dataLoginPage.strWelcomeMessage.toUpperCase(), page.getBidQALogin().BidQA_Login_WelcomeMessage().getText().toUpperCase());

        page.getBidQAPostNew().BidQAPostNew_Link().click();
        page.getBidQAPostNew().BidQA_PostNew_Title().clear();
        page.getBidQAPostNew().BidQA_PostNew_Title().sendKeys(dataLoginPage.strTitlePostNew);
        page.getBidQAPostNew().BidQA_PostNew_Desc().clear();
        page.getBidQAPostNew().BidQA_PostNew_Desc().sendKeys(dataLoginPage.strDescriptionPostNew);
        page.getBidQAPostNew().BidQA_PostNew_Categories().click();
        page.getBidQAPostNew().BidQA_PostNew_Skills().click();
        page.getBidQAPostNew().BidQa_PostNew_ProjectEnding().click();
        page.getBidQAPostNew().BidQa_PostNew_DatePicker().click();

        Select drpCountry = new Select(page.getBidQAPostNew().BidQA_PostNew_Country());
        drpCountry.selectByVisibleText(dataLoginPage.strCountry);

        Thread.sleep(3000);

        Select drpStates = new Select(page.getBidQAPostNew().BidQA_PostNew_States());
        drpStates.selectByVisibleText(dataLoginPage.strState);

        Thread.sleep(3000);

        page.getBidQAPostNew().BidQA_PostNew_City().clear();
        page.getBidQAPostNew().BidQA_PostNew_City().sendKeys(dataLoginPage.strCity);



        page.getBidQAPostNew().BidQA_PostNew_Address().clear();
        page.getBidQAPostNew().BidQA_PostNew_Address().sendKeys(dataLoginPage.strAddress);

        page.getBidQAPostNew().BidQA_PostNew_NextStep().click();


        Assert.assertEquals(dataLoginPage.strPostNewTitle, page.getBidQAPostNew().BidQA_PostNew_PageTitle().getText().trim());


        // Second page for Post New Project
        page.getBidQAPostNew().BidQA_PostNew_FeaturedProject().click();
        page.getBidQAPostNew().BidQA_PostNew_NextStep2().click();
        page.getBidQAPostNew().BidQA_PostNew_NextStep3().click();

        String strFeaturedProject = page.getBidQAPostNew().BidQA_PostNew_GetTextForFeaturedProject().getText().trim();
        String strPayFeaturedProject =  page.getBidQAPostNew().BidQA_PostNew_PayForFeaturedProject().getText().trim();


        Assert.assertEquals(dataLoginPage.strFeaturedProjectMsg,strFeaturedProject);
        Assert.assertEquals(dataLoginPage.strProjectAmt,strPayFeaturedProject);


        // Close the Browser
        driver.close();
        driver.quit();

    }
}