package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/Account.feature",
                 glue = "stepDefinition",
                 monochrome = true,
                 publish = true)

public class AccountRunner extends BaseClass{
	

}
