package com.example.pages;

import com.example.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CruisePage extends TestBase {

    @FindBy(id = "cdc-destinations")
    WebElement sailToBtn;

    @FindBy(xpath = "//div/ul/li/button[@aria-label='The Bahamas ']")
    WebElement sailToBtnBahamas;

    @FindBy(xpath = "//div/ul/li/a[@id='cdc-dates']")
    WebElement dateBtn;

    @FindBy(xpath = "//div/ul/li/button[@aria-label='May 2021 ']")
    WebElement dateBtnMonth;

    @FindBy(xpath = "//div/ul/li/a[@id='cdc-durations']")
    WebElement dateBtnDay;

    @FindBy(xpath = "//div/ul/li/button[@aria-label='6 - 9 Days ']")
    WebElement dateBtnDaySelection;

    @FindBy(xpath = "//article[1]//ccl-view-result-grid-item[1]//div[1]//div[1]//ccl-view-result-grid-footer[1]//div[1]//div[2]//a[1]")
    WebElement learnMoreBtn;

    @FindBy(xpath = "//booking-button[@class='ng-scope ng-isolate-scope']//span[@class='bottom-text ng-binding'][contains(text(),'Book Now')]")
    WebElement bookNowBtn;




    public CruisePage()
    {
        PageFactory.initElements(driver,this);

    }

    public void selectTrip()  {
        try {
            Thread.sleep(3000);

            sailToBtn.click();
            sailToBtnBahamas.click();
            dateBtn.click();
            dateBtnMonth.click();
            dateBtnDay.click();
            dateBtnDaySelection.click();
            learnMoreBtn.click();
            Thread.sleep(3000);
            bookNowBtn.click();
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
