#Author: dmaya@choucairtesting.com

Feature: Add Business unit
  As a web user
  I want to use StarSharp app
  to create a business unit y setup a meeting
#Feature: Add Transaction

  Scenario: Add Business unit
    Given Alexis is logged into the application
      |admin|serenity|
    When  He enters the required information for the new business Unit
      |TestAlexis01|Administration|
    Then  He should see a new Unit in the Unit list
      |TestAlexis01|
    And He should be able to create a meeting with the created unit
      |OnboardingMeeting|1206|