Feature: Login and search Tour
  As a user,
  I want to the Login and Search Tour plans and Save a Selected Tour

  Scenario: I want to be able to search bike tour and save selected tour
    Given I launch the site
    When I login using email 'learngermankarthi@gmail.com' and password 'Klk@129345'
    And I search for tour 'bike' in location 'Munich'
    And I apply difficulty 'Difficult' and distance 3 filters
    Then the filtered search results are displayed
    And I am able to select my tour "Hochleite - Isarhochufer ñ Isarauen Loop from Silberhornstraﬂe" an save it