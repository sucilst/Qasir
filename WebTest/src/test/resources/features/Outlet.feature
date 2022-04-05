@Outlet
@sequence

Feature: Menu Outlet

  Background: Login
    Given User open the Qasir page
    When Do Login

    Scenario: Menu Outlet
      Given Login Successfully
      When Click Menu Outlet
      Then Page Outlet successfully loaded

