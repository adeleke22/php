$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BookingHotel.feature");
formatter.feature({
  "line": 1,
  "name": "PhpTravels hotel booking",
  "description": "",
  "id": "phptravels-hotel-booking",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User is able to book the hotel at PHP Travel",
  "description": "",
  "id": "phptravels-hotel-booking;user-is-able-to-book-the-hotel-at-php-travel",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Add the booking",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Provide First Name \"\u003cFirstName\u003e\" Last Name \"\u003cLastName\u003e\" Mobile \"\u003cMobile\u003e\" and Email \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Provide the check-in \"\u003cCheckIn\u003e\" and check-out \"\u003cCheckOut\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the GrandTotal",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "phptravels-hotel-booking;user-is-able-to-book-the-hotel-at-php-travel;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Mobile",
        "Email",
        "CheckIn",
        "CheckOut"
      ],
      "line": 11,
      "id": "phptravels-hotel-booking;user-is-able-to-book-the-hotel-at-php-travel;;1"
    },
    {
      "cells": [
        "TestFC",
        "TestLC",
        "8750119889",
        "TestUser@gmail.com",
        "18",
        "20"
      ],
      "line": 12,
      "id": "phptravels-hotel-booking;user-is-able-to-book-the-hotel-at-php-travel;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6058927300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User is able to book the hotel at PHP Travel",
  "description": "",
  "id": "phptravels-hotel-booking;user-is-able-to-book-the-hotel-at-php-travel;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Add the booking",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Provide First Name \"TestFC\" Last Name \"TestLC\" Mobile \"8750119889\" and Email \"TestUser@gmail.com\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Provide the check-in \"18\" and check-out \"20\"",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the GrandTotal",
  "keyword": "Then "
});
formatter.match({
  "location": "OnlineBookingScenario.UserIsOnDashboard()"
});
formatter.result({
  "duration": 383653500,
  "status": "passed"
});
formatter.match({
  "location": "OnlineBookingScenario.ClickOnAddBookingButton()"
});
formatter.result({
  "duration": 6902220300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestFC",
      "offset": 20
    },
    {
      "val": "TestLC",
      "offset": 39
    },
    {
      "val": "8750119889",
      "offset": 55
    },
    {
      "val": "TestUser@gmail.com",
      "offset": 78
    }
  ],
  "location": "OnlineBookingScenario.provideCustomerDetails(String,String,String,String)"
});
formatter.result({
  "duration": 4681133000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 22
    },
    {
      "val": "20",
      "offset": 41
    }
  ],
  "location": "OnlineBookingScenario.provide_the_check_in_and_check_out(String,String)"
});
formatter.result({
  "duration": 15733666600,
  "status": "passed"
});
formatter.match({
  "location": "OnlineBookingScenario.verify_the_GrandTotal_message()"
});
formatter.result({
  "duration": 3372954100,
  "status": "passed"
});
formatter.after({
  "duration": 632483600,
  "status": "passed"
});
formatter.uri("CarLocation.feature");
formatter.feature({
  "line": 1,
  "name": "PhpTravels car location",
  "description": "",
  "id": "phptravels-car-location",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Verify the car location",
  "description": "",
  "id": "phptravels-car-location;verify-the-car-location",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is on location screen",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Select the cityOne \"\u003ccity1\u003e\", cityTwo \"\u003ccity2\u003e\", cityThree \"\u003ccity3\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Verify that populated data is correct",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "phptravels-car-location;verify-the-car-location;",
  "rows": [
    {
      "cells": [
        "city1",
        "city2",
        "city3"
      ],
      "line": 8,
      "id": "phptravels-car-location;verify-the-car-location;;1"
    },
    {
      "cells": [
        "Dubai",
        "Acapulco",
        "Alanya"
      ],
      "line": 9,
      "id": "phptravels-car-location;verify-the-car-location;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5080317500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify the car location",
  "description": "",
  "id": "phptravels-car-location;verify-the-car-location;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is on location screen",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Select the cityOne \"Dubai\", cityTwo \"Acapulco\", cityThree \"Alanya\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Verify that populated data is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "OnlineBookingScenario.user_is_on_location_screen()"
});
formatter.result({
  "duration": 5295380400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dubai",
      "offset": 20
    },
    {
      "val": "Acapulco",
      "offset": 37
    },
    {
      "val": "Alanya",
      "offset": 59
    }
  ],
  "location": "OnlineBookingScenario.SelectThreeRandomCities(String,String,String)"
});
formatter.result({
  "duration": 2345614000,
  "status": "passed"
});
formatter.match({
  "location": "OnlineBookingScenario.verify_that_populated_data_is_correct()"
});
formatter.result({
  "duration": 5596904200,
  "status": "passed"
});
formatter.after({
  "duration": 604138600,
  "status": "passed"
});
});