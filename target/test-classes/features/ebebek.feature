@test
Feature: Project_qa
  Scenario: project_qa
    Given go to web sites "https://www.e-bebek.com/"
    When search kasik mamasi and verify
    When add to cart the feature
    When click the see the cart
    When click complete the shopping
    Then verify the login page


