@PositiveCase @Dev
Feature: Hotel Reservation
  I want to make a hotel reservation

  @tag1
  Scenario: 
    Given User on the home page
    When User input "Yogyakarta" as hotel location, select Prime Hotel, User select check in date and select check out date
    And User input "3" as Qyt, click book now button, click procces to checkout
    And User see rooms and summary room click procces, user input "User2@mailnesia.com" as password and "sekolahqa", User see Guest information and click procced, User select pay by bank wire as payment   
    And User see order summary page
    Then User see confirmation page 