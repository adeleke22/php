Feature: PhpTravels hotel booking 
 
 Scenario Outline: User is able to book the hotel at PHP Travel 
    Given User is on dashboard
    When Add the booking
    And Provide First Name "<FirstName>" Last Name "<LastName>" Mobile "<Mobile>" and Email "<Email>"
    And Provide the check-in "<CheckIn>" and check-out "<CheckOut>"
	  Then Verify the GrandTotal
 
Examples: 
| FirstName | LastName    |  Mobile  	   |  Email             | 	CheckIn | CheckOut |
| TestFC    | TestLC      |  8750119889  |  TestUser@gmail.com|   18			|  20			 |



      
      
      