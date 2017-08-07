package com.QAUber;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sunita on 08/05/2017
 */
public class BidQA_PageResources {

    private BidQA_HomePage bidQAHome;

    public BidQA_PageResources(WebDriver driver) {

        bidQAHome = new BidQA_HomePage(driver);

    }

    public BidQA_HomePage getBidQAHome() {

        return bidQAHome;
    }
}




