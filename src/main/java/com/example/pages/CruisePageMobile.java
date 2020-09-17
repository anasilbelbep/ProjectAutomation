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

    @FindBy(css = "div.lockup__container:nth-child(1) div.ccs-host.ccs-host--landing-page.ng-scope:nth-child(5) ccl-cruise-search.ng-isolate-scope div.ccs-container:nth-child(4) ccl-view-result-container.ccs-search-results.ng-scope.ng-isolate-scope div.vrcn-wrapper.vrcn-wrapper--centered ccl-view-result-list.ng-scope.ng-isolate-scope article.vrl-result-item.vrl-list-view-tile.ng-scope:nth-child(1) ccl-view-result-list-item.ng-scope.ng-isolate-scope div.vrl-list-item div.vrl-item div.vrl-item__actions ul.vrl-item__actions-wrapper li.vrl-item__action.vrl-item__action--learn-more-mobile:nth-child(4) > a.vrl-item__learn-more")
    WebElement learnMoreBtn;

    @FindBy(xpath = "body.ccl-mobile.sape-search:nth-child(2) div.sape-search:nth-child(11) div.cruise-search-widget-2015.page-itinerary.ng-scope div.container.ng-scope div.itinerary-menu:nth-child(1) ccl-itinerary-header.ng-isolate-scope div.component.component-sticky-menu div.mobile div.csm-header-row-2 booking-button:nth-child(2) div.component.component-booking-button.js-booking-button.component-booking-button-book-now.ng-scope.red.arrow span.cta.ccl-negative-outline span.outermost-wrapper > span.bottom-text-wrapper:nth-child(4)")
    WebElement bookNowBtn;




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
            //dateBtnDaySelection.click();
            learnMoreBtn.click();
            Thread.sleep(3000);
            bookNowBtn.click();
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
