package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BidQA_HomePage {
    private WebDriver driver;

    public BidQA_HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement BidQAHome(){
        return driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/a"));
    }

    public WebElement BidQAAboutUs(){
        return driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/a"));
    }

    public WebElement BidQA_QAProfessional(){
        return driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[3]/a"));
    }

    public WebElement BidQA_ForProjectOwners(){
        return driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[4]/a"));
    }

    public WebElement BidQA_QA(){
        return  driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[5]/a"));
    }

    public WebElement BidQA_Support(){
        return driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[6]/a"));
    }

    public WebElement BidQA_Register(){
        return driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[7]/a"));
    }

    public WebElement BidQA_Login(){
        return driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[8]/a"));
    }

    public WebElement BidQA_Logo(){
        return driver.findElement(By.xpath("//*[@id=\"logo\"]"));
    }

}
