@SignIn
Feature: User Sign In
  As a user
  I want to sign in
  So that I can access the all of features

  Background:
    Given I am on the Sign In page


  @TC001
  Scenario Outline: User sign in with form sign in
    When I enter email "<email>" and password "<password>"
    And I click the sign in button
    Then I should see message "<message>"
    And I should be redirected to the dashboard

    Examples:
      | email                   | password        | message                                                               |
      | kikisahnakri@test.com   | qwerty123       | Welcome, User!                                                        |
      | kikisahnakri@test.com   | invalidpass2    | Your account or password is incorrect. Reset or change your password. |
      | typoemail@test.com      | qwerty123       | Your account or password is incorrect. Reset or change your password. |
      | notRegistered@email.com | qwerty123       | User not found. Please sign up.                                       |

  @TC002
  Scenario Outline: User sign in with Twitch Account
    When I click sign up on logo Twitch
    Then I should see the application redirect to the Twitch sign up form
    And I enter email account twitch "<email>"
    And I enter password account twitch "<password>"
    And I click the sign in button
    Then I should see the application redirect to the dashboard

    Examples:
      | email             | password    |
      | valid@example.com | ValidPass1! |


  @TC003
  Scenario Outline: User sign in with Google Account
    When I click sign up on logo Google
    Then I should see the application redirect to the Google sign up form
    And I enter email account google "<email>"
    And I enter password account google "<password>"
    And I click the sign in button
    Then I should see the application redirect to the dashboard

    Examples:
      | email           | password    |
      | valid@gmail.com | ValidPass1! |


  @TC004
  Scenario Outline: User sign in with Apple Account
    When I click sign up on logo Apple
    Then I should see the application redirect to the Apple sign up form
    And I enter gmail account "<email>"
    And I enter password gmail "<password>"
    And I click the sign in button
    Then I should see the application redirect to the dashboard

    Examples:
      | email             | password    |
      | valid@gmail.com   | ValidPass1! |

  @TC005
  Scenario Outline: User sign in with Facebook Account
    When I click sign up on logo Facebook
    Then I should see the application redirect to the Facebook sign up form
    And I enter gmail account "<email>"
    And I enter password gmail "<password>"
    And I click the sign in button
    Then I should see the application redirect to the dashboard

    Examples:
      | email             | password    |
      | valid@gmail.com   | ValidPass1! |