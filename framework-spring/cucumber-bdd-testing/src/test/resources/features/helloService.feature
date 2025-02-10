Feature: Hello Service
  As a user
  I want to receive a greeting message
  So that I can verify different language responses

  Scenario Outline: Get Hello message in different languages via a no service approach
    Given I have a <language> HelloService - noAutowired
    When I request a hello message - noAutowired
    Then I should receive "<expectedMessage>" - noAutowired

    Examples:
      | language | expectedMessage |
      | English  | Hello, World!   |
      | Spanish  | ¡Hola, Mundo!   |
      | French   | Bonjour, Monde! |

  Scenario Outline: Get Hello message in different languages via a service approach
    Given I have a "<language>" HelloService - Autowired
    When I request a hello message - Autowired
    Then I should receive "<expectedMessage>" - Autowired

    Examples:
      | language | expectedMessage |
      | English  | Hello, World!   |
      | Spanish  | ¡Hola, Mundo!   |
      | French   | Bonjour, Monde! |