$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/loginAndSearchHike.feature");
formatter.feature({
  "name": "Login and search Tour",
  "description": "  As a user,\n  I want to the Login and Search Tour Plans",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I want to be able to search hiking tour",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the site",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.iLaunchSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login using email \u0027learngermankarthi@gmail.com\u0027 and password \u0027Klk@129345\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.iLoginUsingEmailAndPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for tour \u0027hike\u0027 in location \u0027Munich\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.i_Search_Tour_in_Location(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I apply difficulty \u0027Easy\u0027 and distance 5 filters",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.i_Apply_Diffculty_And_Distance_Filters(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the filtered search results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.isDisplayingOnlyFilteredSearchResults()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/searchAndSaveBikeTour.feature");
formatter.feature({
  "name": "Login and search Tour",
  "description": "  As a user,\n  I want to the Login and Search Tour plans and Save a Selected Tour",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I want to be able to search bike tour and save selected tour",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the site",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.iLaunchSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login using email \u0027learngermankarthi@gmail.com\u0027 and password \u0027Klk@129345\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.iLoginUsingEmailAndPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for tour \u0027bike\u0027 in location \u0027Munich\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.i_Search_Tour_in_Location(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I apply difficulty \u0027Difficult\u0027 and distance 3 filters",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.i_Apply_Diffculty_And_Distance_Filters(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the filtered search results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.isDisplayingOnlyFilteredSearchResults()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am able to select my tour \"Hochleite - Isarhochufer � Isarauen Loop from Silberhornstra�e\" an save it",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SearchAndSaveTour.i_Select_MyTour_And_Save(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});