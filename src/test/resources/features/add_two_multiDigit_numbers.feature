Feature: Andres adds two multi-digit numbers

  Scenario: When Andres adds two multi-digit numbers the correct result is returned
    When Andres clicks on two numbers to add them
    Then the result should be the expected result