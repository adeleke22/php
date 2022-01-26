Feature: PhpTravels car location 
  Scenario Outline: Verify the car location
    Given User is on location screen
    When Select the cityOne "<city1>", cityTwo "<city2>", cityThree "<city3>"
    Then Verify that populated data is correct

Examples: 
| city1 | city2 | city3  |
| Dubai |Acapulco | Alanya|

