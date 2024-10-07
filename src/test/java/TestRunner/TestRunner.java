package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(features = "C:\\Users\\rutuj\\git\\Intel_ISVC_R4C\\src\\test\\java\\Features\\StockRotation_CaseCreation.feature",

			glue = "StepDefination",
			tags = "@Regression1",
			monochrome = true, 
			dryRun = false, 
			plugin = { "pretty",
		
					"html:target/cucumber-reports.html", "junit:target/cucumber.xml", "rerun:target/faildrerun.txt",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
	public class CucumberTest extends AbstractTestNGCucumberTests {

	}

}
