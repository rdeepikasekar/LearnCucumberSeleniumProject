package stepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LearnAll3Parameters {
	@Given("^all 3 scenarions scenario Given \"(.*)\"$")
	public void LearnAll3ScenariosGiven(String para) {
		System.out.println("LearnAll3ScenariosGiven "+para);
	}
	
	@When("^all 3 scenarions scenario When \"(.*)\"$")
	public void LearnAll3ScenariosWhen(String para) {
		System.out.println("LearnAll3ScenariosWhen "+para );
	}
	
	@Then("^all 3 scenarions scenario Then$")
	public void LearnAll3ScenariosThen(DataTable dt) {
		List<List<String>> lst = dt.raw();
		System.out.println("LearnAll3ScenariosThen "+lst.get(0));
	}
}
