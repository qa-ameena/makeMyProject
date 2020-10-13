package com.cucumber.assignment.bdd.qa.StepDefinitions;
import com.cucumber.assignment.bdd.qa.PageObjects.TicketBooking;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TicketBookingStepDefinition {
    TicketBooking ticketBooking = new TicketBooking();

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I see Flights on the Homepage and select \"([^\"]*)\" option$")
    public void iSeeFlightsOnTheHomepageAndSelectOption(String arg0) throws Throwable {
        ticketBooking.roundTrip();
    }

    @And("^Enter From \"([^\"]*)\" as departure city$")
    public void enterFromAsDepartureCity(String arg0) throws Throwable {
        ticketBooking.fromCityButtonClick();
        ticketBooking.cityDeparture();

    }

    @And("^Enter To \"([^\"]*)\" as arrival city$")
    public void enterToAsArrivalCity(String arg0) throws Throwable {
        ticketBooking.toCityButtonClick();
        ticketBooking.cityArrival();
    }

    @And("^Select DEPARTURE date as \"([^\"]*)\"$")
    public void selectDEPARTUREDateAs(String arg0) throws Throwable {
        ticketBooking.departureDateButtonClick();
        ticketBooking.departureDateSelection();

    }

    @And("^Select RETURN date as \"([^\"]*)\"$")
    public void selectRETURNDateAs(String arg0) throws Throwable {
        ticketBooking.returnDateButtonClick();
        ticketBooking.returnDateSelection();
    }

    @And("^I click on SEARCH and print total number of records of DEPARTURE and RETURN Flight on the console$")
    public void iClickOnSEARCHAndPrintTotalNumberOfRecordsOfDEPARTUREAndRETURNFlightOnTheConsole() {
        ticketBooking.searchButton();
        ticketBooking.flighResultDisplay();
        ticketBooking.flightNamesDisplay();


    }
}