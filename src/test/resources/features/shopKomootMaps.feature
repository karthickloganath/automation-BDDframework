Feature: Login and search Komoot Maps plans
  As a user,
  I want to the Login and Search for Komoot Maps plan and its price

	Rule: Price should be displayed for selected Region Bundle
	Background: 
		Given I launch the site
		
 	Example: Shop Komoot Maps plan Bundle and verify the Price
 	# Please Provide a valid Username and Password for Komoot.com with which you have already Signed Up.
    When I login using email '<<<<<Please Enter a Valid Username for Komoot.com>>>>>' and password '<<<<Please Enter Valid Password>>>>>'
    And I shop for komoot maps plan
    Then the komoot maps plan bundle is displayed
    And I verify the bundle name 'Region Bundle' and its price 8.99