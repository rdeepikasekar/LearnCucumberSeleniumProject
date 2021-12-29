Feature: Learn Parameterization

@Smoke
Scenario: Simple Parameterization
Given To learn Simple Parameterization "GivenPara"
When To learn When Simple Parameterization
Then To learn Then Simple parameterization

@Regression
Scenario Outline: Example Parameterization
Given To learn Example Parameterization "<Para>"
When To learn When Example Parameterization
Then To learn Then Example parameterization
Examples:
	|Para|
	|Para1|
	|Para2|
	
@Smoke
Scenario: Learn Datatable parameterization
Given Datatable Parameterization Given
|Datatable Row 0 Column 0| Datatable Row 0 Column 1|
|Datatable Row 1 Column 0| Datatable Row 1 Column 1|

When Datatable Parameterization When
Then Datatable Parameterization Then

