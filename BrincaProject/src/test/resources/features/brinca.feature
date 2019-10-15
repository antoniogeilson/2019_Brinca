
Feature: Brinca website

  @brinca
  Scenario: Header Content
    Given I am on brinca Website
    When I check header content
    Then I can see header content

	@brinca
	Scenario: Quem Somos Nos
	Given I am on brinca Website
	When  I click on quem somos nos 
	Then 	I can see quem somos page

	@brinca
	Scenario: Eventos
	Given I am on brinca Website
	When  I click on eventos 
	Then 	I can see eventos page

