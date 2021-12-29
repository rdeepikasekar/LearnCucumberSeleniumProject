package stepDefinition;

import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class LearnJava {
	@Given("^Find all the occurence of a in the string$")
	public void getAllOccureListainStr(DataTable dt) {
		List<List<String>> lst = dt.raw();
		String str = lst.get(0).get(0);
		System.out.println(str);
		
		Integer newIndex = 0;
		while(newIndex >= 0) {
			newIndex = str.indexOf("a",newIndex);
			System.out.println(newIndex);
			if(newIndex == -1) {
				continue;
			}
			
			newIndex = newIndex + 1;
			
		}
	}
}
