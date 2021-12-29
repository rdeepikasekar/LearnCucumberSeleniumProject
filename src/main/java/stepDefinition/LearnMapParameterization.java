package stepDefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LearnMapParameterization {

	@Given("^LearnMapParameterization Given$")
	public void LearnMapParameterizationGiven(DataTable dt) {
		List<List<String>> Lst = dt.raw();
		System.out.println("LearnMapParameterization Given "+Lst.get(0));
	}

	@When("^LearnMapParameterization When$")
	public void LearnMapParameterizationWhen(DataTable dt) {
		for(Map<String,String> mp: dt.asMaps(String.class,String.class)) {
			System.out.println("LearnMapParameterization When "+mp.get("WhenPara1")+" "+mp.get("WhenPara2"));
		}
	}

	@Then("^LearnMapParameterization Then$")
	public void LearnMapParameterizationThen() {
		System.out.println("LearnMapParameterization Then");
	}
}
