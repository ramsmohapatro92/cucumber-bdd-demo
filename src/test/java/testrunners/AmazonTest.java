package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features= {"src\\test\\resources\\appfeatures"},
				glue= {"stepdefinanation","myHooks"},
				plugin = {"pretty","json:target/MyReport/report.json","html:target/MyReport/report.html"},
				//tags= "@Smoke",
				monochrome=true,
				publish = true,
				dryRun=true				
		)

public class AmazonTest {

}
