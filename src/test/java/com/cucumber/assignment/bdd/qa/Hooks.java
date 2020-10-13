package com.cucumber.assignment.bdd.qa;

import com.cucumber.assignment.bdd.qa.Drivers.DriverFactory;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void startUp() throws InterruptedException {
        driverFactory.setUpUrl();
      driverFactory.Url("https://www.makemytrip.com/flights/");
      driverFactory.maxiBrowser();
//  driverFactory.handlePopWindow();

        driverFactory.implicitwait();

        //  driverFactory.closeBrowser();
    }
}

//  @After
