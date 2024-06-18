@Registration
Feature:Registration capability

  Scenario Outline: Successful registration
    Given I am on the registration page
    When I enter the firstname <FirstName>
    And  I enter the lastname <LastName>
    And  I enter the email <Eamil>
    And I select gender as <Gender>
    And I enter the mobile number <Mobile>
    And I select date of birth as <DOB>
    And I select hobby as <Hobby>
    And I upload picture with <PicName>
    And I click on register button
    Then User should register successfully

    Examples:
      | FirstName | LastName | Eamil               | Gender | Mobile     | DOB         | Hobby | PicName    |
      | Jay | Phopre | testemail@gamil.com | Male  | 9865322154 | 26 Aug 1991 | Sports | image.jpg |