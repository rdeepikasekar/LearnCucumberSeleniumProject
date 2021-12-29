package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinition {
	@Before("@Regression")
	public void aBeforeHooks2() {
		System.out.println("*********************BeforeHooks 2 ********************");
	}
	
	@After()
	public void aAfterHooks2() {
		System.out.println("*********************AfterHooks 2 ********************");
	}
	
	@Before()
	public void BeforeHooks() {
		System.out.println("*********************BeforeHooks 1 ********************");
	}
	
	@After()
	public void bAfterHooks() {
		System.out.println("*********************AfterHooks 1 ********************");
	}
	
	
	
	@Given("^in home page$")
	public void HomePageGiven() {
		System.out.println("Home Page Given");
	}
	
	@When("^Navigate$")
	public void HomePageNavigate() {
		System.out.println("Home Page When");
	}
	
	@Then("^Expected page displayed expected$")
	public void HomePageThen() {
		System.out.println("HomePageThen");
	}
}
