Feature: Upload and Get Clips of a Video
  As a user
  I want to upload a video and get clips of it
  So that I can manage my video content effectively

  Background:
    Given I am on the Home page

  Scenario: Upload a video
    When I upload a video file
    Then I should see a confirmation message saying "Upload successful"
    And the video should be listed in the uploaded videos section

  Scenario: Get clips from an uploaded video
    Given I have uploaded a video
    When I select the option to get clips of the video
    And I specify the start and end times for the clip
    Then I should see the generated clip in the clips section
    And the clip should play correctly when I click on it

  Scenario: Uploading a non-video file
    When I upload a non-video file
    Then I should see an error message saying "Invalid file type. Please upload a video file."

  Scenario: Getting clips from a non-existent video
    When I select the option to get clips without uploading a video
    Then I should see an error message saying "No video uploaded. Please upload a video first."
