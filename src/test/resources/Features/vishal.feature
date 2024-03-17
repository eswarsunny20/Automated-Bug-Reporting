#Author: Vishal
@tag
Feature: Vishal test Cases
  Sample Test cases writter for Services Page

  @tag1
   Scenario: Validate header of nandamurisolutions
    Given browser is open
    When user is on nandamuri website home page
    And user is able to see the logo image
    And user is able to see Home button
    When user clicks Home
    Then user navigates back to nandamuri website home page
  

     And user is able to see services button
     And user Expands  Services dropdown 
    When Clicks on ML service  
    Then user navigates to ML service page 
    Then user navigates back to nandamuri website home page

    And user Expands  Services dropdown 
    When Clicks on Data Engineering service  
    Then user navigates to Data Engineering service page 
    Then user navigates back to nandamuri website home page
   
    
    And user Expands  Services dropdown 
    When Clicks on Testing service  
    Then user navigates to Testing service page 
    Then user navigates back to nandamuri website home page
    
    
    And user Expands  Services dropdown 
    When Clicks on Fullstack service  
    Then user navigates to Fullstack service page 
    Then user navigates back to nandamuri website home page
    
    
    And user Expands  Services dropdown 
    When Clicks on Devops service  
    Then user navigates to Devops service page 
    Then user navigates back to nandamuri website home page
   
   
    And user is able to see whatsapp logo
    And user is able to see contact number 
    Then End of the test
    
    
    @tag2
   Scenario: Validate homge page label of nandamurisolutions.ca
   Given browser is open
   When user is on nandamuri website home page
   And user is able to see the We offer you the best IT practise and services label
   And user is able to see Empower, Scale, Succeed: Unleashing IT Services for Your Agency Benefit label
   And user is able to see the backgroundImage
   And user is able to see the Image1 and image2
   And user is able to see Our Technology label
   Then End of the test

 @tag3
   Scenario: Validate Testing, full stack  DevOps Div elements of Home page
   Given browser is open
   When user is on nandamuri website home page
   And user is able to see Testing service logo
   And user is able to see Testing Label
   When Clicks on Testing
   Then Navigates to Testing service page
   And user navigates back to nandamuri website home page
   And user is able to see We focus on the best practices for it solutions and services label
   
    And user is able to see Full Stack service logo
   And user is able to see Full Stack Label
   When Clicks on Full Stack
   Then Navigates to Full Stack service page
   And user navigates back to nandamuri website home page
   And user is able to see We focus on the best practices for it solutions and services label
   
    And user is able to see DevOps service logo
   And user is able to see DevOps Label
   When Clicks on DevOps
   Then Navigates to DevOps service page
   And user navigates back to nandamuri website home page
   And user is able to see We focus on the best practices for it solutions and services label
   Then End of the test
   
   
   @tag4
   Scenario: Validate the Video button on Home page of nandamurisolutions.ca
   Given browser is open
   When user is on nandamuri website home page 
   And user is able to see the video button logo
   When clicks on video button logo
   Then it Opens a Pop-up with a youtube Video
   Then End of the test
   
   @tag5
   Scenario: Validate the Footer elements of nandamurisolutions.ca
   Given browser is open
   And user is on nandamuri website home page 
   And user is able to see About Company label
   And user is able to see Empowering the future of tech with our cutting-edge IT services, paving the way for innovation and success label
   And user is able to see Facebook logo 
   And user is able to see Twitter logo 
   And user is able to see Youtube logo 
   And user is able to see Linkedin logo 
   And user is able to see Contacts label
   And user is able to see Adress label
   And user is able to see 3080 Yonge Street suite 6060 Toronto M4N 3N1 CANADA Ontario, Canada label
   And user is able to see Email label
   And user is able to see raman@nandamurisolutionsinc.ca label
   And user is able to see Phone label
   And user is able to see phone body label
   And user is able to see Newsletter label
   And user is able to see Subscribe to our newsletter to receive updates on the latest news! label
   And user is able to see subscribe with us text field 
   And user is able to see submit button logo
   And user is able to see © 2024 Nandamuri Solutions |  Powered by Lazarus Info tech label
   Then End of the test
   
