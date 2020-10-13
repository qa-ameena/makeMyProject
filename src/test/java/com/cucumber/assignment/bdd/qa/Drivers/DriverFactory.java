package com.cucumber.assignment.bdd.qa.Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public String browser ="chrome";
public DriverFactory(){
    PageFactory.initElements(driver,this);
    }

    public void setUpUrl(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
}
    public void Url(String url){

        driver.get(url);
    }
    public void maxiBrowser(){
        driver.manage().window().maximize();
    }

    public void pageLoadTimeOut()
    {
        driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
    }

    public void implicitwait()    {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }
    public void deleteAllCookies()    {
        driver.manage().deleteAllCookies();

    }
    public void quitBrowser(){
        // driver.quit();
    }

}


