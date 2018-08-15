Feature: FE - Verify Login functionality

Scenario: Verify that user could login with valid user name and pass
      Given User give url
      And   User give valid user name and pass
      And   User click Login button
      Then  User is able to login

