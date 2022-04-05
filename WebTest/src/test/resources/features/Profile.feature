@Profile
@sequence

Feature: Profile Page

  Background: Login
    Given User open the Qasir page
    When Do Login

  Scenario: Change Profile
    Given Login Successfully
    And Already in Profile Page
    When Edit Profile
    Then The Profile Successfully Edited