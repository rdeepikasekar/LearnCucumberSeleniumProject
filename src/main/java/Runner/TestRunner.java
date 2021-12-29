package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\asus\\OneDrive\\Desktop\\Canada Interview Preparation\\LearnCucumberSeleniumProject\\src\\main\\java\\Features\\pracCucumber.feature"
		,glue={"stepDefinition"}
		,format={"pretty","html:test-outout","json:json_output/jsonoutput.json","junit:junitxml_output/xmloutput.xml"}
		,monochrome = true
		,strict = true
		,dryRun = false
		,tags = ("@Regression")
		
		)
public class TestRunner {
	
}
