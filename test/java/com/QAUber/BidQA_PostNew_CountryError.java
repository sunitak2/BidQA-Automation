package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BidQA_PostNew_CountryError {

    @Test
    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        BidQA_PageResources page = new BidQA_PageResources(driver);
        QA_Data data = new QA_Data();

        // Load test BidQA site

        driver.get("http://test.bidqa.com/");
        Thread.sleep(3000);
        System.out.println("Loading site");

        //Login link
        page.getBidQAHome().BidQA_Login().click();
        Thread.sleep(3000);

        page.getBidQALogin().BidQA_Login_UserName().clear();
        page.getBidQALogin().BidQA_Login_UserName().sendKeys(data.strUserName);
        page.getBidQALogin().BidQA_Login_Password().clear();
        page.getBidQALogin().BidQA_Login_Password().sendKeys(data.strPassWord);
        page.getBidQALogin().BidQA_Login_SignUp().click();

        // Verify thta Welcome message shows
        Assert.assertEquals(data.strWelcomeMessage.toUpperCase(), page.getBidQALogin().BidQA_Login_WelcomeMessage().getText().toUpperCase());

        page.getBidQAPostNew().BidQAPostNew_Link().click();
        page.getBidQAPostNew().BidQA_PostNew_Title().clear();
        page.getBidQAPostNew().BidQA_PostNew_Title().sendKeys(data.strTitlePostNew);
        page.getBidQAPostNew().BidQA_PostNew_Desc().clear();
        page.getBidQAPostNew().BidQA_PostNew_Desc().sendKeys(data.strDescriptionPostNew);

        List<WebElement> eCategories= driver.findElements(By.name("project_cat_cat_multi[]"));

        if (data.iCategoryIndex >= 0 ) {


            eCategories.get(data.iCategoryIndex).click();


        }

        List<WebElement> eSkills= driver.findElements(By.name("project_skill_cat_multi[]"));

        if (data.iSkillsIndex >= 0 ) {


            eSkills.get(data.iSkillsIndex).click();


        }

        page.getBidQAPostNew().BidQa_PostNew_ProjectEnding().click();
        page.getBidQAPostNew().BidQa_PostNew_DatePicker().click();

        Thread.sleep(3000);
        page.getBidQAPostNew().BidQA_PostNew_Address().clear();
        page.getBidQAPostNew().BidQA_PostNew_Address().sendKeys(data.strAddress);

        page.getBidQAPostNew().BidQA_PostNew_NextStep().click();

        Assert.assertEquals(page.getBidQAPostNew().BidQA_Error_Country().getText(),data.strErrorCountry);
        System.out.println(page.getBidQAPostNew().BidQA_Error_Country().getText());
        System.out.println("Test Passed");

        page.getBidQALogin().BidQA_Logout().click();
        driver.close();
        driver.quit();

    }

}
