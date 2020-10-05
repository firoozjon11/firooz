$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Firooz Yazdi"
    },
    {
      "line": 2,
      "value": "#Keywords Summary : Magic Leap Quality Engineer Assignment"
    },
    {
      "line": 3,
      "value": "#Background: List of steps run before each of the scenarios"
    }
  ],
  "line": 5,
  "name": "Verify \"Magic Leap One CREATOR EDITION” exists and fill out contact form",
  "description": "",
  "id": "verify-\"magic-leap-one-creator-edition”-exists-and-fill-out-contact-form",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Verify feature element exists and fill out contact form",
  "description": "",
  "id": "verify-\"magic-leap-one-creator-edition”-exists-and-fill-out-contact-form;verify-feature-element-exists-and-fill-out-contact-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user is on Magic Leap homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user fills out contact form and clicks on Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the message Thanks See ya soon is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "refresh homepage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user looks for Calling all developers",
  "keyword": "And "
});
formatter.match({
  "location": "MagicLeapHP.user_is_on_magicleap_homepage()"
});
formatter.result({
  "duration": 19328878069,
  "status": "passed"
});
formatter.match({
  "location": "MagicLeapHP.user_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 1830605305,
  "status": "passed"
});
formatter.match({
  "location": "MagicLeapHP.msg_is_displyed()"
});
formatter.result({
  "duration": 684047362,
  "status": "passed"
});
formatter.match({
  "location": "MagicLeapHP.refresh_homepage()"
});
formatter.result({
  "duration": 2780213915,
  "status": "passed"
});
formatter.match({
  "location": "MagicLeapHP.user_looks_for_Calling_all_developers()"
});
formatter.result({
  "duration": 1323537031,
  "status": "passed"
});
});