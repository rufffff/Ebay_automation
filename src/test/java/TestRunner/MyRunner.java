package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

		features = "./src/test/java/Features",
		glue = "StepDefinition",
		dryRun = false,
		plugin= {"pretty","html:target/AdvanceReport/demowebshop.html","json:target/cucumber1/cucumber.json"})

public class MyRunner extends AbstractTestNGCucumberTests{


}





////
















