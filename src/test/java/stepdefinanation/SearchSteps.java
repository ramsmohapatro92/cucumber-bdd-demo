package stepdefinanation;

import amazonImplementation.Product;
import amazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Search search;
	Product prod;
	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Amazon page");
	}
	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println(productName+" "+price);
		prod= new Product(productName, price);
	}
	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println(productName);	
		search = new Search();
		System.out.println("searched product is :"+search.checkProduct(prod));
		
	}
	@Then("Order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer OrderId, String username) {
		System.out.println(OrderId+" ---> "+username);
	}

}
