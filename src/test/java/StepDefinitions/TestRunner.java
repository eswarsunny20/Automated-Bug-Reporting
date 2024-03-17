package StepDefinitions;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.DeleteReports;
import utilities.EmailSender;
import utilities.RaiseJiraTicket;
import utilities.ZipTestResults;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="src/test/resources/Features/vishal.feature", //file name to be executed should go here( can be multiple as array)
	glue= {"StepDefinitions","pages"}, // where are our step definitions are present
	monochrome = true,
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
	)
public class TestRunner {
    
	@BeforeClass
	public static void start_of_the_suite() {
		System.out.println("Start of the Suite");
		DeleteReports.deleteTestReportsFolder();
		SetupClass.getJiraFlagStatus();
	}
	
	@AfterClass
	public static void zipTestReportsFolder() throws IOException {
		ZipTestResults.zipTestReportsFolder();
		System.out.println("Finished zipping results folder");
		if (SetupClass.getJiraFlag().equals("true")) {
			int count = 0;
			for (String failedTest : SetupClass.failedScenarios) {
				new RaiseJiraTicket(failedTest);
				count++;
			}
			System.err.println("System has raised "+ count +" bug/bugs");
		}
		EmailSender.Email();
	}    
    
}