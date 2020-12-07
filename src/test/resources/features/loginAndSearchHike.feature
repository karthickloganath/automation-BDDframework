Feature: Login and search Tours
  As a user,
  I want to the Login and Search Tour Plans

	Rule: The results are displyed for selected Tours and filter values
	Background: 
		Given I launch the site
		
  Example: I want to be able to search hiking tour
  # Please Provide a valid Username and Password for Komoot.com with which you have already Signed Up.
    When I login using email '<<<<<Please Enter a Valid Username for Komoot.com>>>>>' and password '<<<<Please Enter Valid Password>>>>>'
    And I search for tour 'hike' in location 'Munich'
    And I apply difficulty 'Easy' and distance 5 filters
    Then the filtered search results are displayed