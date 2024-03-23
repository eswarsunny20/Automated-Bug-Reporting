package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import StepDefinitions.SetupClass;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BasePage;
import utilities.Constants;
import utilities.TestUtils;
import static io.restassured.RestAssured.given;

public class HomePage {

	
	String projectPath = System.getProperty("user.dir");
	String propertyFile = projectPath + "/project.properties";
	TestUtils utils = new TestUtils(propertyFile);
	
	private Scenario scenario;
	private WebDriver driver;
    private BasePage basePage;

    public HomePage() {
    	this.driver = SetupClass.getDriver();
        this.basePage = SetupClass.getBasePage();
        this.scenario = SetupClass.getScenario();
    }
    
    @Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		scenario.log("Trail Trail Trail");

	}

	@And("user is on google search")
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
		Assert.assertEquals("Comparing Text","Pass","Fail");
	}

	@Then("End of the test")
	public void user_is_navigated_to_search_results_page() {
		System.out.println("End of the test");
		
	}
	
	@And("validate api")
    public void sample() {
       
        String username = utils.getProperty("Username");
        String password = utils.getProperty("Password");
        String baseUri = utils.getProperty("BaseURI");
        String credentials = org.apache.commons.codec.binary.Base64.encodeBase64String((username + ":" + password).getBytes());

        given()
            .baseUri(baseUri)
            .header("Authorization", "Basic " + credentials)
            .header("Accept", "application/json")
        .when()
            .get("issue/KAN-1")
        .then()
            .log().all()
            .assertThat().statusCode(200);
    }
}
