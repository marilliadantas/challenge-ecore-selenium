@login
Feature: Login

  @login-baseflow
  Scenario: TC001 - Login (Positive)
      Given the main page loaded
      When the following field Username: "demouser"
      And the following field Password: "abc123"
      And the click the button Login
      Then the application show the page Invoice List

  @resetBrowser
  @login-exceptions
  Scenario Outline: TC002 - Login (Negative)
      Given the main page loaded
      When the following field Username: <Username>
      And the following field Password: <Password>
      And the click the button Login
      Then the application shows the message: "Wrong username or password."

      Examples:
              | Username   | Password   |
              | "Demouser" | "abc123"   |
              | "demouser_"| "xyz"      |
              | "demouser" | "nananana" |
              | "demouser" | "abc123"   |