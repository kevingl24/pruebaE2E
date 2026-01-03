# language: en
Feature: Successful submission of the Contact Us form

  Background:
    Given the user navigates to the application URL
    And the page title is visible

  Scenario: Submit Contact Us form with valid data
    When the user accesses the "Contact Us" form
    And fills in the required fields Name, Email, Subject, and Message
    And uploads a file using the Upload File option
    And submits the form
    And accepts the browser alert
    Then the success message "Success! Your details have been submitted successfully." is displayed
    And the user returns to the Home page
