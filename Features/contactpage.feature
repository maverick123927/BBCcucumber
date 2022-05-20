Feature: contact us page 

Scenario: verify the contact page

	Given user open browser
	When user enter url  "https://www.urbanladder.com/" in browser
	Then user click on contact us page
	And user verify the contact page title
	 
	And user quit the chrome browser
	
	