package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BidQA_LoginPage {
    private WebDriver driver;

    public BidQA_LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement BidQA_Login_UserName(){
        return driver.findElement(By.xpath("//*[@id=\"log\"]"));}


    public WebElement BidQA_Login_Password(){
        return driver.findElement(By.xpath("//*[@id=\"login_password\"]"));
    }

    public WebElement BidQA_Login_SignUp(){
        return driver.findElement(By.xpath("//*[@id=\"submits\"]"));
    }

    public WebElement BidQA_Login_WelcomeMessage(){
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[4]"));
    }

    public WebElement BidQA_Login_PopUpWindow(){
        return driver.findElement(By.xpath("//*[@id=\"help_center\"]/div/div/span[3]"));
    }

    public WebElement BidQA_Logout(){

        return driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[8]/a"));
    }


}
