package stepDefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class pracCucumber {

	@Given("^to check the hard coded parameter \"(.*)\"$")
	public void givenMtd(String para) {
		System.out.println("Given --> "+para);
	}

	@When("^to check the scenario outline with example \"(.*)\"$")
	public void whenMtd(String para) {
		System.out.println("When --> "+para);
	}

	@And("^to check the datatable as list$")
	public void AndMtd(DataTable dt) {
		List<List<String>> lst = dt.raw();
		System.out.println("And --> "+lst.get(0).get(0));
	}

	@Then("^to check datatable as set$")
	public void ThenMtd(DataTable dt) {
		for(Map<String,String> mp :dt.asMaps(String.class, String.class)) {
			System.out.println(mp.get("MapPara"));
		}
	}


	@Given("^Given test scenario 2$")
	public void givenSc2() {
		System.out.println("Given test scenario 2");
	}

	@When("^When test scenario 2$")
	public void WhenSc2() {
		System.out.println("When test scenario 2");
	}

	@Then("^Then test scenario 2$")
	public void thensc2() {
		System.out.println("Then test scenario 2");
	}
}