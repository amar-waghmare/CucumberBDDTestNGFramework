package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features="src/test/java/features"
				,glue ="stepsInOneShot"
				,monochrome=true
				,plugin = {"pretty"}
//				,dryRun=true
				)
public class TestNGTestRunner extends AbstractTestNGCucumberTests
{
	
				
}

