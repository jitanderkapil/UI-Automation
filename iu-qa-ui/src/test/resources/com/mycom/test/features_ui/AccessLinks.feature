Feature: CLP_UI Launch page access for web applications

  @iu_CLPAccess
  Scenario: Check iu log-in access for valid users
    Given I access the common launch page Web Client
    When I fill in login name "QA_clp102" and password "osi"
    And I check <links> for <applications> on Common Launch Page
      | applications       | links         |
      | Web Designer       | Web Designer  |
      | PrOptimaWeb Client | Web Client    |
      | Portal             | Portal        |
      | Alert Manager      | Alert Manager |
    And I logout from the User Web Client
