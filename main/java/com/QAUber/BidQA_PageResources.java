package com.QAUber;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sunita on 08/05/2017
 */
public class BidQA_PageResources {

    private BidQA_HomePage bidQAHome;
    private BidQA_LoginPage bidQALogin;
    private BidQa_PostNewProject bidQAPostNew;
    private BidQA_Registeration bidQARegisteration;

    public BidQA_PageResources(WebDriver driver) {

        bidQAHome = new BidQA_HomePage(driver);
        bidQALogin = new BidQA_LoginPage(driver);
        bidQAPostNew = new BidQa_PostNewProject(driver);
        bidQARegisteration = new BidQA_Registeration(driver);

    }

    public BidQA_HomePage getBidQAHome() {

        return bidQAHome;
    }

    public BidQA_LoginPage getBidQALogin() {

        return bidQALogin;
    }

    public BidQa_PostNewProject getBidQAPostNew() {
        return bidQAPostNew;
    }

    public BidQA_Registeration getBidQARegisteration(){

        return bidQARegisteration;
    }

}




