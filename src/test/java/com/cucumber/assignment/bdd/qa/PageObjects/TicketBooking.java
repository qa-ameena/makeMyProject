package com.cucumber.assignment.bdd.qa.PageObjects;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import com.cucumber.assignment.bdd.qa.Drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TicketBooking extends DriverFactory {
    @FindBy (xpath="//li[contains(text(),'Round Trip')]")
    private WebElement roundRadio;
    public void roundTrip(){

        roundRadio.click();
    }
    @FindBy(css="#fromCity")
    private WebElement fromButtonClick;
    public void fromCityButtonClick() {
        fromButtonClick.click();

    }
    @FindBy (css="#react-autowhatever-1-section-0-item-6")
    private WebElement departureFromCity;
    public void cityDeparture(){
        departureFromCity.click();

    }
    @FindBy (xpath = "//span[contains(text(),'To')]")
    private WebElement toButtonClick;
    public void toCityButtonClick(){

        toButtonClick.click();
    }
    @FindBy (css="#react-autowhatever-1-section-0-item-8")
    private WebElement arrivalToCity;
    public void cityArrival() {

        arrivalToCity.click();
    }
    @FindBy (xpath="//span[contains(text(),'DEPARTURE')]")//to click Departure button
    private WebElement fromdateButtonClick;
    public void departureDateButtonClick(){

        fromdateButtonClick.click();
    }
    @FindBy (xpath="(//div[@class='dateInnerCell'])[12]")//to select departure date
    private WebElement departuredate;
    public void departureDateSelection(){
        departuredate.click();
    }
    @FindBy (xpath = "//span[contains(text(),'RETURN')]")//to click on return button
    private WebElement toDateButtonClick;
    public void returnDateButtonClick(){
        toDateButtonClick.click();
    }

    @FindBy (xpath="(//div[@class='dateInnerCell'])[33]")//to select return date
    private WebElement returnDate;
    public void returnDateSelection(){
        returnDate.click();
    }
    @FindBy (css=".primaryBtn")
    private WebElement search;
    public void searchButton(){
        search.click();

    }@FindBy (css=".pull-left.departure")
    private WebElement flightResult;
    public void flighResultDisplay(){// To display the first flight from the list of search done
        String flightPrintResult = flightResult.getText();
        System.out.println(flightPrintResult);
    }
    @FindBy(css =".fli-list")
    private List<WebElement> flightNames;//to select all the search result elements
    public List <String> flightNamesDisplay(){
       List<String> flightNamesList = new ArrayList<>();//empty array list for  storing the text
        for (WebElement flightName:flightNames) {
            System.out.println("Number of search results per page :" +" " + flightNames.size());
            String ameena = flightName.getText();
            flightNamesList.add(ameena);
            System.out.println(flightNamesList);
                }
        return flightNamesList;



        }



    }
