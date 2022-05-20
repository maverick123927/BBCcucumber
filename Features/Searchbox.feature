Feature: Searchbox 

Scenario Outline: successfully test  search box with valid data 

	Given user launch the browser 
	When open the url
	Then user enter <word> in the searchbox
	And click the search Button
	
	Then user close the chrome browser 
	
	Examples:
	|word|
	|table|
	|chair|
	|study table|
	|office chair|
	|sofa chair|
	|coffee table|
	|table wood|
	|table woodbase|
	|tableware|
	|bedroom|