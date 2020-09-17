package com.example.testcases;


import javafx.scene.layout.Priority;
import org.apache.tools.ant.taskdefs.Sleep;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;


public class HomePageTest extends TestBase {
   


    public HomePageTest()
    {
        super();
    }

   @BeforeTest
   @Parameters("browser")
    public void setUp(String browser)
    {
        initialization(browser);      
    }



}
