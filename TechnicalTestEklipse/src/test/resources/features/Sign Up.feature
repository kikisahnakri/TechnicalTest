@signUp
Feature: User Sign Up
  As a user
  I want to sign up
  So that I can access the system

  Background:
    Given I am on the Sign Up page

  @TC001
  Scenario Outline: User sign up with form
    When I enter username "<username>"
    And I enter email "<email>"
    And I enter password "<password>"
    And I confirm password "<confirmPassword>"
    And I click the register button
    Then I should see a message saying "<message>"

    Examples:
      | username            | email                 | password    | confirmPassword | message                          |
      | kiki                | kiki@test.com         | ValidPass1! | ValidPass1!     | Registration successful          |
      | RegisteredAccount   | Registered@gmail.com  | ValidPass1! | ValidPass1!     | The email has already been taken.|
      | validUser2          | invalid@email.com     | ValidPass1! | ValidPass1!     | Invalid email address            |
      | validUser3          | valid@example.com     | ValidPass1! | DifferentPass2! | Passwords do not match           |
      |                     | valid@example.com     | ValidPass1! | ValidPass1!     | Username is required             |
      | validUser4          |                       | ValidPass1! | ValidPass1!     | Email is required                |
      | validUser5          | valid@example.com     |             |                 | Password is required             |
