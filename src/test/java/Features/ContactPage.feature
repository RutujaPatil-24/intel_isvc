Feature: R4C Case Creation

  As a user
  I want to be able to create a new R4C case
  So that I can track and manage the case effectively

  Scenario: Verify the Case creation for Service Type as 
  Stock Rotation & Return Reason as Standard Stock Rotation with Freight type as CRF using PO Search
  
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
    When User Click on Contact menu
    And Select Contact from list
    And Click on the New R4C case creation button
    Then User can view New R4C Case popup
    And Select service type as "Stock Rotation & Return"
    And Click on the create button
    When User enter Sold to and other details
    And Click on the Next button After Sold To
    And Select Purchase/Sales Order button and Enter PO Number "4511564934"
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    When Enter Return Quantity
    And Click on the Get credit price
    And Click on the Next button After credit Price
    And Enter Credit price
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
   
Scenario: Verify the Case creation for Stock Rotation & Return Reason as 
Standard Stock Rotation with Freight type as IMF using SO Search  

   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login  
   When User Click on Contact menu
    And Select Contact from list
    And Click on the New R4C case creation button
    Then User can view New R4C Case popup
    And Select service type as "Stock Rotation & Return"
    And Click on the create button
    When User enter Sold to and other details "74928797"
    When User selects Freight Type as IMF
    And  User selects Collection Address & Collection Contact
    And User checks the Return Location
    When  User clicks on the Next button in Request Header details
    And User searches with SO Number "7386736486"
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    When Enter Return Quantity
    And Click on the Get credit price
    And Click on the Next button After credit Price
    And Enter Credit price
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
   
    
    
    