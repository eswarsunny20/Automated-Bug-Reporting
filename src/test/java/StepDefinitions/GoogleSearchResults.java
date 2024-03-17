package StepDefinitions;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BasePage;
import utilities.Constants;
import utilities.DeleteReports;
import utilities.TestUtils;
import utilities.ZipTestResults;

public class GoogleSearchResults {
	 
	
	String projectPath = System.getProperty("user.dir");
	String propertyFile = projectPath + "/project.properties";
	TestUtils utils = new TestUtils(propertyFile);
	
	private WebDriver driver;
    private BasePage basePage;

    public GoogleSearchResults() {
        this.driver = SetupClass.getDriver();
        this.basePage = SetupClass.getBasePage();
    }

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
	
	}

	@And("user is on nandamurisloution website")
	public void user_is_on_google_search() {
		System.out.println("user is on google search");
		driver.navigate().to(utils.getProperty("Public_URL"));
	}

	@And("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("user enters a text in search box");
		basePage.click(Constants.GET_STARTED_HOMEPAGE);
	}

	@When("hits enter")
	public void hits_enter() {
		boolean verifyElementPresent = basePage.verifyElementPresent(Constants.NAME_TEXT_FIELD);
		System.out.println(verifyElementPresent);
		System.out.println("hits enter");
	}

	@Then("End of the test")
	public void user_is_navigated_to_search_results_page() {
		System.out.println("user is navigated to search results page");
		driver.close();
		driver.quit();
	}

}

