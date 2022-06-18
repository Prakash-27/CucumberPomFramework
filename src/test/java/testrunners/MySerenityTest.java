package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src\\test\\resources\\parallel\\LoginPage.feature"},
		glue = {"stepdefinitionparallelwithtestng"},
		plugin = {"pretty"}
		
		)

public class MySerenityTest {

	
	
	
	
	
	
}




//C:\Users\Prakash>cd C:\Users\Prakash\eclipse-workspace\Cucumber_POM_Framework

//C:\Users\Prakash\eclipse-workspace\Cucumber_POM_Framework>mvn clean verify