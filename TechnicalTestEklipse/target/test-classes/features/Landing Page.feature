@RegressionLandingPage
Feature: Landing Page
  As a user
  I want to check elements for redirect pages
  So that I can use the content features effectively

  Background:
    Given I am on the home page

  @TC01 @FreeFeatures
  Scenario: Check landing page of Free Features on Gaming Stream Highlight
    When I drag the mouse to the dropdown feature
    Then I should see the list of free features in the menu
    And I click on Gaming Stream Highlight
    Then I should see the application redirect to the Gaming Stream Highlight page

  @TC02 @FreeFeatures
  Scenario: Check landing page of Free Features on Content Publisher
    When I drag the mouse to the dropdown feature
    Then I should see the list of free features in the menu
    And I click on Content Publisher
    Then I should see the application redirect to the Content Publisher page

  @TC03 @FreeFeatures
  Scenario: Check landing page of Free Features on Ai-Edit (Beta)
    When I drag the mouse to the dropdown feature
    Then I should see the list of free features in the menu
    And I click on Ai-Edit
    Then I should see the application redirect to the Ai-Edit (Beta) page

  @TC04 @FreeFeatures
  Scenario: Check landing page of Free Features on Eklipse Studio
    When I drag the mouse to the dropdown feature
    Then I should see the list of free features in the menu
    And I click on Eklipse Studio
    Then I should see the application redirect to the Eklipse Studio page

  @TC05 @FreeFeatures
  Scenario: Check landing page of Free Features on Voice Command
    When I drag the mouse to the dropdown feature
    Then I should see the list of free features in the menu
    And I click on Voice Command
    Then I should see the application redirect to the Voice Command page

  @TC06 @FreeFeatures
  Scenario: Check landing page of Free Features on Mobile App
    When I drag the mouse to the dropdown feature
    Then I should see the list of free features in the menu
    And I click on Mobile App
    Then I should see the application redirect to the Mobile App page

  @TC01 @PremiumFeatures
  Scenario: Check landing page of Premium feature on Pro Edits
    When I drag the mouse to the dropdown feature
    Then I should see the list of premium features in the menu
    And I click on Pro Edits
    Then I should see the application redirect to the premium feature of Pro Edit page

  @TC02 @PremiumFeatures
  Scenario: Check landing page of Premium feature on Kick Support
    When I drag the mouse to the dropdown feature
    Then I should see the list of premium features in the menu
    And I click on Kick Support
    Then I should see the application redirect to the premium feature of Kick Support page


  @TC01 @UseCaseFeatures
  Scenario: Check landing page of Use Case on COD Streamers
    When I drag the mouse to the dropdown Use Case
    Then I should see the list of use case features in the menu
    And I click on COD Streamers
    Then I should see the application redirect to the premium feature of COD Streamers page







