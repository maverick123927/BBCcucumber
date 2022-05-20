Feature: Emailbox

Scenario Outline: Successfully test emailbox with valid data

	Given user start browser 
	When user enter url
	Then user enter the id <id>
    And click the subscribe button
    Then user close the browser
    
    Examples:
    |id|
    |jio123@gmail.com|
    |rohit0807@gmail.com|
    |sealnirnay@gmail.com|
    |masmalo@gmail.com|
    |subhojit125@gmail.com|	