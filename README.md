# Test Automation

Simulation to book a cruise 

# Key configurations

path to configure browser drivers

\src\main\java\com\example\base

```java
 if (browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","");
            driver=new ChromeDriver();
        }
        else if(browserName.equals("chromeMobile"))
        {
            System.setProperty("webdriver.chrome.driver","");
            Map<String, String> mobileEmulation = new HashMap<>();

            mobileEmulation.put("deviceName", "Nexus 5");


            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

            driver = new ChromeDriver(chromeOptions);
            isMobile =true;

        }
        else if(browserName.equals("FF"))
        {
            System.setProperty("webdriver.gecko.driver","");
            driver= new FirefoxDriver();
        }
```

Configure test and arguments

/testng.xml

```xml

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name = "Suite">

    <test name="ChromeTest">
        <parameter name="browser" value="chrome"/>
        <classes>
            <class name="com.example.testcases.HomePageTest">
            </class>
        </classes>
    </test>

    <test name="FirefoxeTest">
        <parameter name="browser" value="FF"/>
        <classes>
            <class name="com.example.testcases.HomePageTest">
            </class>
        </classes>
    </test>

    <test name="MobileTest">
        <parameter name="browser" value="chromeMobile" />
        <classes>
            <class name="com.example.testcases.HomePageTest">
            </class>
        </classes>
    </test>

</suite>

```

## Contributing
Pull requests are welcome. For changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
