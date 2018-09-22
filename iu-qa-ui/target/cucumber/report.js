$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/mycom/test/features_ui/AccessLinks.feature");
formatter.feature({
  "id": "clp-ui-launch-page-access-for-web-applications",
  "description": "",
  "name": "CLP_UI Launch page access for web applications",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "clp-ui-launch-page-access-for-web-applications;check-iu-log-in-access-for-valid-users",
  "tags": [
    {
      "name": "@iu_CLPAccess",
      "line": 3
    }
  ],
  "description": "",
  "name": "Check iu log-in access for valid users",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I access the common launch page Web Client",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I fill in login name \"QA_clp102\" and password \"osi\"",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I check \u003clinks\u003e for \u003capplications\u003e on Common Launch Page",
  "keyword": "And ",
  "line": 7,
  "rows": [
    {
      "cells": [
        "applications",
        "links"
      ],
      "line": 8
    },
    {
      "cells": [
        "Web Designer",
        "Web Designer"
      ],
      "line": 9
    },
    {
      "cells": [
        "PrOptimaWeb Client",
        "Web Client"
      ],
      "line": 10
    },
    {
      "cells": [
        "Portal",
        "Portal"
      ],
      "line": 11
    },
    {
      "cells": [
        "Alert Manager",
        "Alert Manager"
      ],
      "line": 12
    }
  ]
});
formatter.step({
  "name": "I logout from the User Web Client",
  "keyword": "And ",
  "line": 13
});
formatter.match({
  "location": "ManageUserAccess.i_access_the_common_launch_page_Web_Client()"
});
formatter.result({
  "duration": 15227507343,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA_clp102",
      "offset": 22
    },
    {
      "val": "osi",
      "offset": 47
    }
  ],
  "location": "ManageAuthentication.i_fill_in_login_name_and_password(String,String)"
});
formatter.result({
  "duration": 17225492456,
  "status": "passed"
});
formatter.match({
  "location": "ManageAccessLinks.i_check_Links_for_Applications_on_Common_Launch_Page(DataTable)"
});
formatter.result({
  "duration": 15069165830,
  "status": "passed"
});
formatter.match({
  "location": "ManageUserAccess.i_logout_from_the_User_Web_Client()"
});
formatter.result({
  "duration": 78418231676,
  "status": "passed"
});
formatter.uri("com/mycom/test/features_ui/Authentication.feature");
formatter.feature({
  "id": "iu-login-functionality",
  "description": "",
  "name": "iu Login Functionality",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "iu-login-functionality;check-iu-log-in-access-for-invalid-users",
  "tags": [
    {
      "name": "@iu_Authentication1",
      "line": 3
    }
  ],
  "description": "",
  "name": "Check iu log-in access for invalid users",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I access the common launch page Web Client",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I fill in login name \"invalid\" and password \"invalid\"",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "An error message is visible in the login page",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "ManageUserAccess.i_access_the_common_launch_page_Web_Client()"
});
formatter.result({
  "duration": 10524507544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 22
    },
    {
      "val": "invalid",
      "offset": 45
    }
  ],
  "location": "ManageAuthentication.i_fill_in_login_name_and_password(String,String)"
});
formatter.result({
  "duration": 4769056758,
  "status": "passed"
});
formatter.match({
  "location": "ManageAuthentication.an_error_message_is_visible_in_the_login_page()"
});
formatter.result({
  "duration": 250589677,
  "status": "passed"
});
formatter.scenario({
  "id": "iu-login-functionality;check-iu-log-in-access-for-valid-users",
  "tags": [
    {
      "name": "@iu_Authentication2",
      "line": 9
    }
  ],
  "description": "",
  "name": "Check iu log-in access for valid users",
  "keyword": "Scenario",
  "line": 10,
  "type": "scenario"
});
formatter.step({
  "name": "I access the common launch page Web Client",
  "keyword": "Given ",
  "line": 11
});
formatter.step({
  "name": "I fill in login name \"QA_clp101\" and password \"QA_clp101\"",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "The user name is visible in the main page header",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "I logout from the User Web Client",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "location": "ManageUserAccess.i_access_the_common_launch_page_Web_Client()"
});
formatter.result({
  "duration": 878019765,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA_clp101",
      "offset": 22
    },
    {
      "val": "QA_clp101",
      "offset": 47
    }
  ],
  "location": "ManageAuthentication.i_fill_in_login_name_and_password(String,String)"
});
formatter.result({
  "duration": 4150517554,
  "status": "passed"
});
formatter.match({
  "location": "ManageAuthentication.the_user_name_is_visible_in_the_main_page_header()"
});
formatter.result({
  "duration": 1333054045,
  "status": "passed"
});
formatter.match({
  "location": "ManageUserAccess.i_logout_from_the_User_Web_Client()"
});
formatter.result({
  "duration": 61994934557,
  "status": "passed"
});
});