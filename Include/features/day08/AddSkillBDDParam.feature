@tag
Feature: Add Skill

  @tag1
  Scenario Outline: User Sucesfully Add Skill
    Given User navigates to Login Page with <username> and <password>
    When User navigates to Add Skill Page
    And User inputs skill details such as <skill> and <note>
    Then User clicks save button
    
    Examples:
    |username|password|skill  |note             |
    |Admin   |admin123|Skill D|This is a Skill D|
    |Admin   |admin123|Skill E|This is a Skill E|
    