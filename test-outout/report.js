$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/asus/OneDrive/Desktop/Canada Interview Preparation/LearnCucumberSeleniumProject/src/main/java/Features/pracCucumber.feature");
formatter.feature({
  "line": 1,
  "name": "revise Cucumber",
  "description": "",
  "id": "revise-cucumber",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "revise cucumber 1",
  "description": "",
  "id": "revise-cucumber;revise-cucumber-1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "to check the hard coded parameter \"hardcoded example\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "to check the scenario outline with example \"\u003cprac1\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "to check the datatable as list",
  "rows": [
    {
      "cells": [
        "prac with list"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "to check datatable as set",
  "rows": [
    {
      "cells": [
        "MapPara"
      ],
      "line": 11
    },
    {
      "cells": [
        "prac with map"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "revise-cucumber;revise-cucumber-1;",
  "rows": [
    {
      "cells": [
        "prac1",
        "prac2"
      ],
      "line": 15,
      "id": "revise-cucumber;revise-cucumber-1;;1"
    },
    {
      "cells": [
        "ex11",
        "ex12"
      ],
      "line": 16,
      "id": "revise-cucumber;revise-cucumber-1;;2"
    },
    {
      "cells": [
        "ex21",
        "ex22"
      ],
      "line": 17,
      "id": "revise-cucumber;revise-cucumber-1;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1020800,
  "status": "passed"
});
formatter.before({
  "duration": 346000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "revise cucumber 1",
  "description": "",
  "id": "revise-cucumber;revise-cucumber-1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "to check the hard coded parameter \"hardcoded example\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "to check the scenario outline with example \"ex11\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "to check the datatable as list",
  "rows": [
    {
      "cells": [
        "prac with list"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "to check datatable as set",
  "rows": [
    {
      "cells": [
        "MapPara"
      ],
      "line": 11
    },
    {
      "cells": [
        "prac with map"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "hardcoded example",
      "offset": 35
    }
  ],
  "location": "pracCucumber.givenMtd(String)"
});
formatter.result({
  "duration": 547136199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ex11",
      "offset": 44
    }
  ],
  "location": "pracCucumber.whenMtd(String)"
});
formatter.result({
  "duration": 111900,
  "status": "passed"
});
formatter.match({
  "location": "pracCucumber.AndMtd(DataTable)"
});
formatter.result({
  "duration": 1096899,
  "status": "passed"
});
formatter.match({
  "location": "pracCucumber.ThenMtd(DataTable)"
});
formatter.result({
  "duration": 311399,
  "status": "passed"
});
formatter.after({
  "duration": 378400,
  "status": "passed"
});
formatter.after({
  "duration": 62901,
  "status": "passed"
});
formatter.before({
  "duration": 72000,
  "status": "passed"
});
formatter.before({
  "duration": 79500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "revise cucumber 1",
  "description": "",
  "id": "revise-cucumber;revise-cucumber-1;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "to check the hard coded parameter \"hardcoded example\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "to check the scenario outline with example \"ex21\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "to check the datatable as list",
  "rows": [
    {
      "cells": [
        "prac with list"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "to check datatable as set",
  "rows": [
    {
      "cells": [
        "MapPara"
      ],
      "line": 11
    },
    {
      "cells": [
        "prac with map"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "hardcoded example",
      "offset": 35
    }
  ],
  "location": "pracCucumber.givenMtd(String)"
});
formatter.result({
  "duration": 124500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ex21",
      "offset": 44
    }
  ],
  "location": "pracCucumber.whenMtd(String)"
});
formatter.result({
  "duration": 86201,
  "status": "passed"
});
formatter.match({
  "location": "pracCucumber.AndMtd(DataTable)"
});
formatter.result({
  "duration": 75600,
  "status": "passed"
});
formatter.match({
  "location": "pracCucumber.ThenMtd(DataTable)"
});
formatter.result({
  "duration": 98099,
  "status": "passed"
});
formatter.after({
  "duration": 52301,
  "status": "passed"
});
formatter.after({
  "duration": 68600,
  "status": "passed"
});
formatter.before({
  "duration": 80201,
  "status": "passed"
});
formatter.before({
  "duration": 119600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "revise-cucumber;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Given test scenario 2",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "When test scenario 2",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Then test scenario 2",
  "keyword": "Then "
});
formatter.match({
  "location": "pracCucumber.givenSc2()"
});
formatter.result({
  "duration": 90900,
  "status": "passed"
});
formatter.match({
  "location": "pracCucumber.WhenSc2()"
});
formatter.result({
  "duration": 63099,
  "status": "passed"
});
formatter.match({
  "location": "pracCucumber.thensc2()"
});
formatter.result({
  "duration": 61800,
  "status": "passed"
});
formatter.after({
  "duration": 70400,
  "status": "passed"
});
formatter.after({
  "duration": 53800,
  "status": "passed"
});
});