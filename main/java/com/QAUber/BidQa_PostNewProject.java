package com.QAUber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class BidQa_PostNewProject {

    private WebDriver driver;

    public BidQa_PostNewProject(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement BidQAPostNew_Link(){

        return driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[5]/a"));}

    public WebElement BidQA_PostNew_Title(){
        ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[3]/p/input")));
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[3]/p/input"));
    }

    public WebElement BidQA_PostNew_Desc(){
        ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[4]/p/textarea")));
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[4]/p/textarea"));
    }

    public WebElement BidQA_PostNew_Categories(){

       // ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[6]/div/label[3]/input")));
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[6]/div/label[3]/input"));
    }

    public WebElement BidQA_PostNew_Tags(){
        ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[7]/p/input")));
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[7]/p/input"));
    }

    public WebElement BidQA_PostNew_Skills(){
        //((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[9]/div[1]/label[3]/input")));
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[9]/div[1]/label[3]/input"));
    }

    public WebElement BidQA_PostNew_ProjectBudget(){
       // ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[11]/p")));
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[11]/p"));
    }


    public WebElement BidQa_PostNew_ProjectEnding(){

        //((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"ending\"]")));
        return driver.findElement(By.xpath("//*[@id=\"ending\"]"));
    }

    public WebElement BidQa_PostNew_DatePicker(){

        return driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a"));
    }

    public WebElement BidQA_PostNew_Country(){

        //((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"content\"]/div/div")));
        return driver.findElement(By.id("do_input_new"));
    }

    public WebElement BidQA_PostNew_States(){

        return driver.findElement(By.xpath("//*[@id=\"sub_locs\"]/select"));
    }

    public WebElement BidQA_PostNew_City(){

        return driver.findElement(By.xpath("//*[@id=\"sub_locs2\"]/input"));
    }

    public WebElement BidQA_PostNew_Address(){

        ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[15]/p/input")));
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[15]/p/input"));
    }

    public WebElement BidQA_PostNew_AttachImages(){
        ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"myDropzoneElement2\"]")));
        return driver.findElement(By.xpath("//*[@id=\"myDropzoneElement2\"]"));
    }

    public WebElement BidQA_PostNew_AttachFiles(){

        ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"myDropzoneElement\"]")));
        return driver.findElement(By.xpath("//*[@id=\"myDropzoneElement\"]"));
    }

    //Go to next page ( second page) for post new project

    public WebElement BidQA_PostNew_NextStep(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/ul/li[20]/p/input"));
    }

    public WebElement BidQA_PostNew_PageTitle(){

        return driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[1]/div[1]"));
    }

    public WebElement BidQA_PostNew_DoNotSeeCountry(){

        ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*[@id=\"li-location\"]/div[4]/h2")));
        return driver.findElement(By.xpath("//*[@id=\"li-location\"]/div[4]/h2"));
    }


    ////// Checkboxes on Post New Second page

    public WebElement BidQA_PostNew_FeaturedProject(){


        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/ul/form/table/tbody/tr[1]/td[1]/input"));
    }


    public WebElement BidQA_PostNew_SealedBid(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/ul/form/table/tbody/tr[2]/td[2]/input"));
    }

    public WebElement BidQA_PostNew_HideProjects(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/ul/form/table/tbody/tr[3]/td[2]/input"));
    }


    //Click on next step (third page)

    public WebElement BidQA_PostNew_NextStep2(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/ul/form/li/p/input"));

    }

    public WebElement BidQA_PostNew_NextStep3(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div[3]/a[2]"));

    }


    public WebElement BidQA_PostNew_GetTextForHideProject(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/table/tbody/tr[2]/td[1]"));

    }

    public WebElement BidQA_PostNew_PayForHideProject(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/table/tbody/tr[2]/td[2]"));

    }

    public WebElement BidQA_PostNew_GetTextForFeaturedProject(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/table/tbody/tr[2]/td[1]"));

    }
    public WebElement BidQA_PostNew_PayForFeaturedProject(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/table/tbody/tr[2]/td[2]"));

    }

    //Error Messages Element

    public WebElement BidQA_Error_Title(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[3]/form/ul/li[3]/p[1]"));
    }

    public WebElement BidQA_Error_Desc(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[3]/form/ul/li[4]/p[1]"));
    }

    public WebElement BidQA_Error_Category(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[3]/form/ul/li[6]/p[1]"));
    }

    public WebElement BidQA_Error_Skills(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[3]/form/ul/li[9]/p"));
    }
    public WebElement BidQA_Error_Country(){

        return driver.findElement(By.xpath("//*[@id=\"li-location\"]/p"));
    }

    public WebElement BidQA_Error_Address(){

        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[3]/form/ul/li[15]/p[1]"));
    }


}
