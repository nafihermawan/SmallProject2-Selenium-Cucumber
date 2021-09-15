$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Create new account",
  "description": "",
  "id": "create-new-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CreateAccount"
    }
  ]
});
formatter.before({
  "duration": 7118130638,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User create account",
  "description": "",
  "id": "create-new-account;user-create-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@NegativeCase"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User open Web Page and click SignIn",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"user1@mailnesia.com\" as email address and click button Create Account",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The User see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountStep.openHomePage()"
});
formatter.result({
  "duration": 3711421475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user1@mailnesia.com",
      "offset": 12
    }
  ],
  "location": "CreateAccountStep.inputEmail(String)"
});
formatter.result({
  "duration": 548381769,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStep.invalidLogin()"
});
formatter.result({
  "duration": 374561014,
  "status": "passed"
});
formatter.after({
  "duration": 295768,
  "status": "passed"
});
formatter.before({
  "duration": 8803164898,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User create account",
  "description": "",
  "id": "create-new-account;user-create-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User open Web Page and click SignIn",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User input \"user221@mailnesia.com\" as email address and click button Create Account",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User input \"userdua\" as first name, User input \"dua\" as last name and \"sekolahqa\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User select \"5\" as day, \"1\" as january and \"2000\" as year",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User already created",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountStep.openHomePage()"
});
formatter.result({
  "duration": 2901509906,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user221@mailnesia.com",
      "offset": 12
    }
  ],
  "location": "CreateAccountStep.inputEmail(String)"
});
formatter.result({
  "duration": 320117411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "userdua",
      "offset": 12
    },
    {
      "val": "dua",
      "offset": 48
    },
    {
      "val": "sekolahqa",
      "offset": 71
    }
  ],
  "location": "CreateAccountStep.inputName(String,String,String)"
});
formatter.result({
  "duration": 2544883877,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 13
    },
    {
      "val": "1",
      "offset": 25
    },
    {
      "val": "2000",
      "offset": 44
    }
  ],
  "location": "CreateAccountStep.setDateOfBirth(String,String,String)"
});
formatter.result({
  "duration": 1346055377,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 42453,
  "status": "passed"
});
});