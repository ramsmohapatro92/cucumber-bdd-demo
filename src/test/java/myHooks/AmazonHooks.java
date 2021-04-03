package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AmazonHooks {

	@Before
	public void setup() {
		System.out.println("launch amazon application");
	}

	@After
	public void tearDown() {
		System.out.println("Close the browser");
	}

	@BeforeStep
	public void beforestep() {
		System.out.println("To be ran before every step");
	}

}
