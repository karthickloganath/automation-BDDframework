Feature: Login , search and Save a selected Tour
  As a user,
  I want to the Login and Search Tour plans and Save a Selected Tour

	Rule: Price should be displayed for selected Region Bundle
	Background: 
		Given I launch the site

  Example: I want to be able to search bike tour and save selected tour
  # Please Provide a valid Username and Password for Komoot.com with which you have already Signed Up.
    When I login using email <<<<<Enter Email id >>>>> and password <<<<< Enter Password >>>>>
    And I search for tour 'bike' in location 'Munich'
    And I apply difficulty 'Difficult' and distance 3 filters
    Then the filtered search results are displayed
    And I am able to select my tour "Isartalbahnweg - Isarauen Loop from Harras" and save it