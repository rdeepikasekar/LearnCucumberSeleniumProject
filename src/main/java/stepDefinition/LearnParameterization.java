package stepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LearnParameterization {
	@Given("^To learn Simple Parameterization \"(.*)\"$")
	public void LearnSimple(String para) {
		System.out.println(para);
	}
	
	@When("^To learn When Simple Parameterization$")
	public void learnSimpleParaWhen() {
		System.out.println("learnSimpleParaWhen");
	}
	@Then("^To learn Then Simple parameterization$")
	public void learnSimpleParaThen() {
		System.out.println("learnSimpleParaThen");	
	}

	@Given("^To learn Example Parameterization \"(.*)\"$")
	public void learnExampleParaGiven(String para) {
		System.out.println(para);
	}
	
	@When("^To learn When Example Parameterization$") 
	public void learnExampleParaWhen() {
		System.out.println("learnExampleParaWhen");
	}
	
	@Then("^To learn Then Example parameterization$")
	public void learnExampleParaThen() {
		System.out.println("learnExampleParaThen");
	}
	
	@Given("^Datatable Parameterization Given$")
	public void datatable_Parameterization_Given(DataTable dt){
		List<List<String>> lstDt = dt.raw();
		System.out.println("***************************************************************************");
		System.out.println(lstDt.get(0));
		System.out.println(lstDt.get(0).get(0));
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^Datatable Parameterization When$")
	public void datatable_Parameterization_When() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Datatable Parameterization Then$")
	public void datatable_Parameterization_Then(){
	    // Write code here that turns the phrase above into concrete actions
	}
}
