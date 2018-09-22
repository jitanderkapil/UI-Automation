Feature: iu Login Functionality

  ~@iu_Authentication1
  Scenario: Check iu log-in access for invalid users
    Given I access the common launch page Web Client
    When I fill in login name "invalid" and password "invalid"
    Then An error message is visible in the login page

  @iu_Authentication2
  Scenario: Check iu log-in access for valid users
    Given I access the common launch page Web Client
    #When I fill in login name "QA_clp101" and password "QA_clp101"
    When I fill in login name "jk_pt" and password "pt"
    Then The user name is visible in the main page header
    And I logout from the User Web Client
