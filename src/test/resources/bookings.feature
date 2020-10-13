@booking

Feature: Round trip Booking from Delhi to Bangalore
  As an end user
  I want to select round trip booking from Delhi to Banglore
  So that i can view filtered or selected trips and verify top 10 options and price on console

  Scenario: Round trip Booking from Delhi to Bangalore
    Given I am on Homepage
    When I see Flights on the Homepage and select "ROUND TRIP" option
    And Enter From "Pune, India" as departure city
    And Enter To "Hyderabad, India" as arrival city
    And Select DEPARTURE date as "anydate"
    And Select RETURN date as "week after"
    And I click on SEARCH and print total number of records of DEPARTURE and RETURN Flight on the console
#Feature: I want to book a round trip from Delhi to Bangluru.
#As a customer
#I want to select the roundtrip booking
#So I can view the different options on my console
#
#Scenario: I want to view different booking options
#Given I am on the homepage
#When I see flights on the homepage and select the "roundtrip" option
#And I select departure "From:"
#And I select arrival "To:"
#And I Select "date" today’s date
#And I select arrival date "After seven days"
#And I click on search and Print total number of records of “Departure Flight” And “Return Flight” on the console

