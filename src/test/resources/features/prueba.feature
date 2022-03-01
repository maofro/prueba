#autor:Manuel alejandro ordoñez castro
@stories
Feature: utest
  As a new user
  @scenario1
  Scenario: create a new user
    Given than brandon create a new user with his info
      |firstname|lastname|email|mounth|day|year|
      |Manuel Alejandro|Ordoñez Castro|maofro@hotmail.com|March|29|1990|
    When he search a form to register data
      |city|zip|country|computer|version|lenguaje|brand|model|SO|password|confirpass|
      |Tuluá|763022|Colombia|windows|10 |spanish|apple|iPhone 13 Pro Max|iOS 15.1|M@nuel123456789*|M@nuel123456789*|
    Then create a new user
