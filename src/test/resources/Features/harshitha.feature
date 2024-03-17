
@tag
Feature: Feature to test google
  I want to use this template for my feature file

  #@smokeTest
  #Scenario: Validate google search
    #Given browser is open
    #And user is on google search
    #And user enters a text in search box
    #When hits enter
    #And validate api
    #Then End of the test
    
#@tag1
#Scenario: Validate About Us page
    #Given browser is open
    #When User is on Home page
    #And user clicks on About us in the header 
    #Then user navigates to About Us page
    #Then End of the test
    #
#@tag2
#Scenario: Validate Scrool Up mark
    #Given browser is open
    #When User is on Home page
    #And user clicks on About us in the header
    #Then user navigates to About Us page
    #And user is at the bottom of the page 
    #And user clicks on scroll up mark 
    #Then user goes to the top of the page
    #Then End of the test
    #
#@tag3
#Scenario: Validate About Us page
    #Given browser is open
    #When User is on Home page
    #And user clicks on About us in the header 
   #Then user navigates to About Us page
    #And user scrolls to Customer Experience section
    #Then validate customer experience content 
    #And validate user is able to see the image beside the content
    #Then End of the test
    
@tag4
Scenario: Validate About Us page
    Given browser is open
    When User is on Home page
    And user clicks on About us in the header 
    Then user navigates to About Us page
    And user is Viewing Working process section
    Then user should be able to see the related three images
    And User should be able to see content below the images
    Then End of the test
    
#@tag5
#Scenario: Validate About Us page
    #Given browser is open
    #When User is on Home page
    #And user clicks on About us in the header 
    #Then user navigates to About Us page
    #And user clicks on Home which is on About us background image
    #Then user should navigate to Home page
    #Then End of the test
