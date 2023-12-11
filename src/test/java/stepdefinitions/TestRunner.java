package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome=true,
		plugin= {"pretty"},
		features= "src/test/java/features",
		glue="stepdefinitions",
		
		//tags= {"@Sanity or @Regression"},or condition
		
		tags= {"@Sanity and @Regression"}
		
		//tags= {"@login"} feature level tag
		
		
		//tags= {"@Sanity and @Regression"} and condition
		 
		//tags = {"@Login and not @WIP"} run all features in login except work in progress 
		)


public class TestRunner {
	

}
