package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\AppFeatures"},
		glue = {"stepdefinitions", "AppHooks"},
		plugin = {"pretty",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  "timeline:test-output-thread\\"
		         }
		
		)

public class MyTest {

	
	
}

//To Run as Parallel Mode then the Project file path is copy and paste it in cmd
//C:\Users\Prakash>cd C:\Users\Prakash\eclipse-workspace\Cucumber_POM_Framework
//C:\Users\Prakash\eclipse-workspace\Cucumber_POM_Framework>mvn verify

//timeline:test-output-thread\\ --> this time line will give the cucumber time line so this is runned by cmd mvn verify