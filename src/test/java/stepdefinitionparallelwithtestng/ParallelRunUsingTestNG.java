package stepdefinitionparallelwithtestng;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\parallel"},
		glue = {"stepdefinitionparallelwithtestng"},
		plugin = {"pretty",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  "timeline:test-output-thread\\"
		         },
		monochrome = true
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
//C:\Users\Prakash\eclipse-workspace\Cucumber_POM_Framework>mvn verify	