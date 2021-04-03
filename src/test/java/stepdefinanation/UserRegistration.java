package stepdefinanation;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserRegistration {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.out.println(" User is on registration page");
	}

	@When("User enters following user credentials")
	public void user_enters_following_user_credentials(DataTable dataTable) {
		List<List<String>> userlist = dataTable.asLists();
		for (List<String> e : userlist) {
			System.out.println(e);
		}
	}

	//| Name | skill     | email  | mobilenum | city |
	@When("User enters following user credentials as Map")
	public void user_enters_following_user_credentials_as_map(DataTable dataTable) {
		List<Map<String, String>> userlist =dataTable.asMaps();
		
		for(Map<String, String> e:userlist )
		{
			System.out.println(e.get("Name"));
			System.out.println(e.get("skill"));
			System.out.println(e.get("email"));
			System.out.println(e.get("mobilenum"));
			System.out.println(e.get("city"));
			
		}
		
	}




}
