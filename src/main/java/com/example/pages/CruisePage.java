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
           
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
