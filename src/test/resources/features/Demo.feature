Feature: As a potential client i want to interact with the mobile application
  Background:
    Given The app is loaded correctly
  @Demo
  Scenario Outline: The user starts the application, registers a new user, changes the language, log out of the app and log in to the app.

    When The user logs in the application with: <email>, <password>
    Then Home page is displayed


    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |
