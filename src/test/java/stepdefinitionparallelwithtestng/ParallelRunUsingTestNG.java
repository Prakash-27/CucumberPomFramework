package stepdefinitionparallelwithtestng;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  "timeline:test-output-thread\\",
				  "rerun:src\\test\\java\\stepdefinitionparallelwithtestng\\failedRerun.txt"
		         },
		//tags = "not @Skip",
		monochrome = true,
		glue = {"stepdefinitionparallelwithtestng"},
		features = {"src\\test\\resources\\parallel\\LoginPage.feature"}
		)

public class ParallelRunUsingTestNG extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}

//To Run as Parallel Mode then the Project file path is copy and paste it in cmd
//C:\Users\Prakash>cd C:\Users\Prakash\eclipse-workspace\Cucumber_POM_Framework
//C:\Users\Prakash\eclipse-workspace\Cucumber_POM_Framework>mvn verify --> Enter


//If you want to Skip some Scenario using @Skip by running in the Cmd using maven following Command should use
//C:\Users\Prakash>cd C:\Users\Prakash\eclipse-workspace\Cucumber_POM_Framework
//C:\Users\Prakash\eclipse-workspace\Cucumber_POM_Framework>mvn test -DCucumber.options="--tags '@Login and not @Skip'"  --> Enter