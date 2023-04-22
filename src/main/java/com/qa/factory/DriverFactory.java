package com.qa.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public WebDriver driver;
    public  static ThreadLocal<WebDriver> tlDriver =new ThreadLocal<>();

    /*This method will initialize the ThreadLocal WebDriver*/
    public WebDriver init_driver(String browser){
        System.out.println("browser value is: "+ browser);
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        }
        else {
            System.out.println("Please pass correct driver");
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }
    /*this is used to get the driver with ThreadLocal
    * */
    public static synchronized WebDriver getDriver(){
        return tlDriver.get();
    }

}
