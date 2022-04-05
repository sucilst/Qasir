@Login
@sequence

Feature: Login

  Scenario: Login Success (Using Email)
    Given User open the Qasir page
    When Do Login
    Then Login Successfully