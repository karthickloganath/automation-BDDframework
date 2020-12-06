Feature: Login and search Tour
  As a user,
  I want to the Login and Search Tour Plans

  Scenario: I want to be able to search bike tour
    Given I launch the site
    When I login using email 'learngermankarthi@gmail.com' and password 'Klk@129345'
    And I search for tour 'hike' in location 'Munich'
    And I apply difficulty 'Easy' and distance 5 filters
    Then the filtered search results are displayed


