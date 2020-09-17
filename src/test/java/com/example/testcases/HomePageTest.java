package com.example.testcases;


import com.example.base.TestBase;
import com.example.pages.CruisePage;
import com.example.pages.CruisePageMobile;
import com.example.pages.HomePage;
import com.example.pages.HomePageMobile;
import javafx.scene.layout.Priority;
import org.apache.tools.ant.taskdefs.Sleep;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;
import javafx.scene.layout.Priority;
import org.apache.tools.ant.taskdefs.Sleep;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;


public class HomePageTest extends TestBase {
   HomePage homePage;
    CruisePage cruisePage;
    HomePageMobile homePageMobile;
    CruisePageMobile cruisePageMobile;


    public HomePageTest()
    {
        super();
    }

   @BeforeTest
   @Parameters("browser")
    public void setUp(String browser)
    {
        initialization(browser);
       if(isMobile){
           homePageMobile = new HomePageMobile();
           cruisePageMobile = new CruisePageMobile();

       }else{
           homePage = new HomePage();
           cruisePage = new CruisePage();
       }
    }
	
	
  @Test
  public void SearchCruise()
  {

      if(isMobile){
          homePageMobile.closeImage();
          boolean flag = homePageMobile.validateLogo();
          Assert.assertTrue(flag);
          homePageMobile.searchCruise();
          cruisePageMobile.selectTrip();
      }else {
          homePage.closeImage();
          boolean flag = homePage.validateLogo();
          Assert.assertTrue(flag);
          homePage.searchCruise();
          cruisePage.selectTrip();
      }
  }



}
