Feature: Customer an search any car

As a customer 
I want to be ble to search for any car
So that i can buy a car of my choice.

Scenario: Customer can successfully search for a cr


Given I am on the Motors Homepage
And I enter my postcode
And I select a make Honda
When I click on search
Then results of my search are displayed
