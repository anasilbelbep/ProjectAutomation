package com.example.pages;

import com.example.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends TestBase {


    @FindBy(xpath = "//div/ul/li/a[@role='button']/span[contains(text(),'SEARCH ')]")
    WebElement searchCruiseBtn;

    @FindBy(css = "svg.cp-banner__icon-close--com > path")
    WebElement cookies;

    @FindBy(xpath = "//div/a/img[@class='cgh-header__logo']")
    WebElement logoImg;

    @FindBy(xpath = "//div[@class='vifp-blue-background']")
    WebElement ImgSingUp;

    @FindBy(xpath = "//div[@class='vifp-sweeps-background']")
    WebElement background;

    @FindBy(xpath = "//body[@id='MainBody']/div[2]/div/div[10]")
    WebElement Button;




    public HomePage(){

        PageFactory.initElements(driver,this);
    }



    public void closeImage()
    {
        WebElement ele = driver.findElement(By.xpath("//div[@class='vifp-close']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        cookies.click();
    }



    public boolean validateLogo()
    {
        return logoImg.isDisplayed();

    }

    public void searchCruise()
    {

        searchCruiseBtn.click();


    }





}
