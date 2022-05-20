Feature: store page

Scenario: Successfully check store function

	Given user launch chrome browser
	When user enter url in chrome browser 
	Then user click store option
	And user verify the storepage title
	And verify storepage elements
	Then user off the browser
	