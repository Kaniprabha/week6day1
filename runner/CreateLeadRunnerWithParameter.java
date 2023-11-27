package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/CreateLeadWithParameter.feature",
                 glue = "stepDefinition",
                 monochrome = true,
                 publish = true)

public class CreateLeadRunnerWithParameter extends BaseClass{

}
