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
		monochrome = true,
		glue = {"stepdefinitionparallelwithtestng"},
		features = {"@src\\test\\java\\stepdefinitionparallelwithtestng\\failedRerun.txt"}
		)

public class FailedRun extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
}
