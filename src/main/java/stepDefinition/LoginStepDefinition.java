package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	@Given("^learn bg$")
	public void learnBG() {
		System.out.println("learn bg learn bg learn bg learn bg learn bg learn bg learn bg learn bg ");
	}
	
	@Given("^User is already on login page$")
	public void testGiven() {
		System.out.println("Given");
	}
	
	@When("^Title of login page is \"(.*)\"$")
	public void title_of_login_page_is_Free_CRM(String PageName){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(PageName);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then1");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then2");
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then3");
	}

	
}
