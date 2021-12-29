Feature: revise Cucumber

@Background
@Regression
Scenario Outline: revise cucumber 1

Given to check the hard coded parameter "hardcoded example"
When to check the scenario outline with example "<prac1>"
And to check the datatable as list
|prac with list|
Then to check datatable as set
|MapPara|
|prac with map|

Examples:
|prac1|prac2|
|ex11|ex12|
|ex21|ex22|

@Regression
Scenario:
Given Given test scenario 2
When When test scenario 2
Then Then test scenario 2