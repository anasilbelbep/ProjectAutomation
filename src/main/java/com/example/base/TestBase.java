package com.example.base;

import com.example.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {


    public static WebDriver driver;
    public static Properties prop;
    public static boolean isMobile = false;

    public TestBase()
    {

        try{
            prop= new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\paolu\\IdeaProjects\\automation_test\\src\\main\\java\\com\\example\\config\\config.properties");
            prop.load(ip);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void initialization(String browserName)
    {
       // String browserName = prop.getProperty("browser");

       /* switch (browserName)
        {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","C:\\Users\\paolu\\IdeaProjects\\Drivers\\Chrome\\chromedriver.exe");
                driver= new ChromeDriver();
                break;
            case "FF":
                System.setProperty("webdriver.gecko.driver","C:\\Users\\paolu\\IdeaProjects\\Drivers\\Firefox\\geckodriver.exe");
                driver= new FirefoxDriver();
                break;
        }
        */
        if (browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\paolu\\IdeaProjects\\Drivers\\Chrome\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if(browserName.equals("chromeMobile"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\paolu\\IdeaProjects\\Drivers\\Chrome\\chromedriver.exe");
            Map<String, String> mobileEmulation = new HashMap<>();

            mobileEmulation.put("deviceName", "Nexus 5");


            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

            driver = new ChromeDriver(chromeOptions);
            isMobile =true;

        }
        else if(browserName.equals("FF"))
        {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\paolu\\IdeaProjects\\Drivers\\Firefox\\geckodriver.exe");
            driver= new FirefoxDriver();
        }
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS );
driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT,TimeUnit.SECONDS);

driver.get(prop.getProperty("url"));
    }

}
