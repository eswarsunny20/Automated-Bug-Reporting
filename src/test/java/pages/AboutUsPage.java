package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinitions.SetupClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BasePage;
import utilities.Constants;
import utilities.TestUtils;

public class AboutUsPage {

//	@Harshitha
	
	String projectPath = System.getProperty("user.dir");
	String propertyFile = projectPath + "/project.properties";
	TestUtils utils = new TestUtils(propertyFile);
	
	private WebDriver driver;
    private BasePage basePage;

    public AboutUsPage() {
        this.driver = SetupClass.getDriver();
        this.basePage = SetupClass.getBasePage();
    }
//    @Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("browser is open");
//	
//	}

	@When("User is on Home page")
	public void user_is_on_home_page() {
		System.out.println("user is on home page");
		driver.navigate().to(utils.getProperty("Public_URL"));
	}

	@And("user clicks on About us in the header")
	public void user_clicks_on_about_us_in_header() {
		System.out.println("user clicks on About us in the header");
		boolean verifyElementPresent = basePage.verifyElementPresent(Constants.GET_ABOUT_US);
		System.out.println(verifyElementPresent);
		basePage.click(Constants.GET_ABOUT_US);
	}

	@Then("user navigates to About Us page")
	public void user_navigates() {
		
		String title = driver.getTitle();
		if(title.equals("About Us")){
			System.out.print("Element is present");
		}
		else {
			Assert.fail();
		}
	}

//	@Then("End of the test")
//	public void user_is_navigated() {
//		System.out.println("user is navigated to About Us page");
//		driver.close();
//		driver.quit();
//	}

@And("user is at the bottom of the page")
public void user_is_at_bottom_of_page() {
	System.out.println("user is at the bottom of the page ");
	
}
@And("user clicks on scroll up mark")
	public void click() {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    try {
        // Wait for a short duration to ensure the page is fully scrolled down
        Thread.sleep(5000); // 2 seconds (adjust as needed)
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        basePage.click(Constants.GET_SCROLL_MARK );
     
    }
	

@Then("user goes to the top of the page")
public void user_is_at_top_of_page() {
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollTo(0, 0)");

    // Wait for a short duration to ensure the page is fully scrolled up
    try {
        Thread.sleep(2000); // 2 seconds (adjust as needed)
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Verify if the page has scrolled to the top
    Number currentScrollPosition = (Number) jsExecutor.executeScript("return window.scrollY;");
    if (currentScrollPosition.longValue() == 0) {
        System.out.println("Page has scrolled to the top successfully.");
    } else {
        System.out.println("Page is not scrolled to the top.");
    }
}


@And("user scrolls to Customer Experience section")
public void user_scrolls_to_customer() throws InterruptedException {
    String locator = Constants.CUSTOMER_EXPERIENCE_CONTENT_AU_PAGE;

    WebElement element = driver.findElement(By.xpath(locator));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    Thread.sleep(2000);
}


@Then("validate customer experience content")
public void validate_customer_experience_content() {
    String xpath = Constants.CUSTOMER_EXPERIENCE_CONTENT_AU_PAGE;

    // Scroll to the element using JavaScriptExecutor
    WebElement element = driver.findElement(By.xpath(xpath));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    // Wait for a short duration to ensure the page is fully scrolled to the element
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Validate element presence using custom assertion
    try {
        basePage.validateElementPresentAssertion(xpath);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Compare text if the element is present
    boolean textMatch = basePage.compareText(xpath, "At Nandamuri Solutions, we are on a relentless mission to propel businesses forward in the digital age. By harnessing the power of cutting-edge technologies and delivering unparalleled customer service, we empower our clients to excel in an ever-evolving tech landscape.");

    if (textMatch) {
        System.out.println("Element is present and text matches the expected content.");
    } else {
        Assert.fail("Text does not match the expected content.");
    }
}


@And("validate user is able to see the image beside the content")
public void validate_image_beside_content() {
    String imageXpath = Constants.IMAGE_BESIDE_CONTENT; // replace with the actual XPath for the image

    // Validate that the image is present
    if (basePage.verifyElementPresent(imageXpath)) {
        System.out.println("Image is present beside the content.");
    } else {
        Assert.fail("Image is not present beside the content.");
    }
}



@And("user is Viewing Working process section")
public void user_is_viewing_working_process_section() throws InterruptedException {
    String xpathWorkingProcessSection = Constants.WORKING_PROCESS_SECTION_XPATH; // replace with the actual XPath locator

    // Scroll to the Working Process section
    basePage.scrollToElement(xpathWorkingProcessSection);
}

@Then("user should be able to see the related three images")
public void user_should_see_related_three_images() {
    String xpathImage1 = Constants.IMAGE_1_XPATH; // replace with the actual XPath locator for the first image
    String xpathImage2 = Constants.IMAGE_2_XPATH; // replace with the actual XPath locator for the second image
    String xpathImage3 = Constants.IMAGE_3_XPATH; // replace with the actual XPath locator for the third image

    // Check if the three images are present
    boolean image1Present = basePage.verifyElementPresent(xpathImage1);
    boolean image2Present = basePage.verifyElementPresent(xpathImage2);
    boolean image3Present = basePage.verifyElementPresent(xpathImage3);

    Assert.assertTrue("Image 1 is not present.", image1Present);
    Assert.assertTrue("Image 2 is not present.", image2Present);
    Assert.assertTrue("Image 3 is not present.", image3Present);
}

@And("User should be able to see content below the images")
public void user_should_see_content_below_images() {
    String xpathContentBelowImage1 = Constants.CONTENT_BELOW_IMAGE_1; // replace with the actual XPath locator for content below image 1
    String xpathContentBelowImage2 = Constants.CONTENT_BELOW_IMAGE_2; // replace with the actual XPath locator for content below image 2
    String xpathContentBelowImage3 = Constants.CONTENT_BELOW_IMAGE_3; // replace with the actual XPath locator for content below image 3

    // Check if the content below each image is present
    boolean contentBelowImage1Present = basePage.verifyElementPresent(xpathContentBelowImage1);
    boolean contentBelowImage2Present = basePage.verifyElementPresent(xpathContentBelowImage2);
    boolean contentBelowImage3Present = basePage.verifyElementPresent(xpathContentBelowImage3);

    Assert.assertTrue("Content below image 1 is not present.", contentBelowImage1Present);
    Assert.assertTrue("Content below image 2 is not present.", contentBelowImage2Present);
    Assert.assertTrue("Content below image 3 is not present.", contentBelowImage3Present);
}


@And("user clicks on Home which is on About us background image")
public void user_clicks_on_home_on_about_us() {
	boolean verifyElementPresent = basePage.verifyElementPresent(Constants.HOME_ABOUT_US);
	System.out.println(verifyElementPresent);
	basePage.click(Constants.HOME_ABOUT_US);
}

@Then("user should navigate to Home page")
public void user_navigates_from_aboutus_to_home_page() {
	
	String title = driver.getTitle();
	if(title.equals("Nandamuri Solutions")){
		System.out.print("Element is present");
	}
	else {
		Assert.fail();
	}
}
}




