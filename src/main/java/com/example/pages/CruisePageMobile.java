package com.example.pages;

import com.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CruisePageMobile extends TestBase {

    @FindBy(xpath = "//div/label[@for='sbms-Sail To']/i[@class='sbms-component__arrow fa fa-caret-up ng-hide']")
    WebElement sailToBtn;

    @FindBy(xpath = "//option[@label='The Bahamas']")
    WebElement sailToBtnBahamas;

    @FindBy(xpath = "//select[@id='sbms-Dates']")
    WebElement dateBtn;

    @FindBy(xpath = "//option[@label='May 2021']")
    WebElement dateBtnMonth;

    @FindBy(id = "//select[@id='sbms-Dates']")
    WebElement dateBtnDay;

    




    public CruisePageMobile()
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
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
