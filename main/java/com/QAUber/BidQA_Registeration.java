package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BidQA_Registeration {

    private WebDriver driver;

    public BidQA_Registeration(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement BidQA_RegUserName(){

        return driver.findElement(By.xpath("//*[@id=\"user_login\"]"));}

    public WebElement BidQA_RegEmail(){

        return driver.findElement(By.xpath("//*[@id=\"user_email\"]"));}



    public WebElement BidQA_Registeration_User(){

        return driver.findElement(By.xpath("//*[@id=\"registerform\"]/p[7]/a[1]"));}

    public WebElement BidQA_Registeration_Title(){

        return driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div"));}


    public WebElement BidQA_SignUPFacebook(){

        return driver.findElement(By.xpath("//*[@id=\"registerform\"]/p[7]/a[1]"));}


    public WebElement BidQA_SignUPLinkedIn(){

        return driver.findElement(By.xpath("//*[@id=\"registerform\"]/p[7]/a[2]"));}


    public WebElement BidQA_Logo(){

        return driver.findElement(By.xpath("//*[@id=\"body\"]/div/div[2]/div[1]/div[3]/img"));}

    public WebElement BidQA_LinkedInLogo(){

        return driver.findElement(By.xpath("//*[@id=\"body\"]/div/form/div[2]/div"));}


    public WebElement BidQA_FacebookSignIn(){

        return driver.findElement(By.xpath("//*[@id=\"header_block\"]/span"));}
}
