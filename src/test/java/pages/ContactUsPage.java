package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import StepDefinitions.SetupClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BasePage;
import utilities.Constants;
import utilities.TestUtils;

public class ContactUsPage {
//@vamshi
	
	String projectPath = System.getProperty("user.dir");
	String propertyFile = projectPath + "/project.properties";
	TestUtils utils = new TestUtils(propertyFile);
	
	private WebDriver driver;
    private BasePage basePage;

    public ContactUsPage() {
        this.driver = SetupClass.getDriver();
        this.basePage = SetupClass.getBasePage();
    }
    
  //1st scenario
	
  	@When("user clicks contact us from header")
  	public void user_clicks_contactus_from_header() {
  		basePage.click(Constants.GET_STARTED_HOMEPAGE);
  		System.out.println("user is clicks button");
  	}
  	
  	@Then("user is navigated to contact us page")
  	public void user_is_navigated_to_contact_us_page() {
  		  String title = driver.getTitle();
  		  if(title.equals("Contact Us")) {
  		  System.out.println("Element is present");
  		  }else {
  			  Assert.fail();
  		  }
  	}
  	

@And("user is able to see name label")
	public void user_is_able_to_see_name_label() throws InterruptedException {
        basePage.validateElementPresentAssertion(Constants.GET_SEE_NAME_LABLE);  
		System.out.println("Passed");
	    
	    boolean isNameLabelTextCorrect = basePage.compareText(Constants.GET_SEE_NAME_LABLE, "Your Name *");
		  System.out.println(isNameLabelTextCorrect);
		
		
	}
	
	@And("user is able to see email label")
	public void user_is_able_to_see_email_label() throws InterruptedException {
		 basePage.validateElementPresentAssertion(Constants.GET_SEE_EMAIL_LABLE);  
		
	    
	    boolean isEmailLabelTextCorrect = basePage.compareText(Constants.GET_SEE_EMAIL_LABLE, "Your Email *");
		  System.out.println(isEmailLabelTextCorrect);
		
		
}
	
	@And("user is able to see contact number label")
	public void user_is_able_to_see_contact_number_label() throws InterruptedException {
		 basePage.validateElementPresentAssertion(Constants.GET_SEE_CONTACT_LABLE);  
			
		    
		    boolean isContactLabelTextCorrect = basePage.compareText(Constants.GET_SEE_CONTACT_LABLE, "Contact Number");
			  System.out.println(isContactLabelTextCorrect);
	}

	@And("user is able to see subject label")
	public void user_is_able_to_see_subject_label() throws InterruptedException {
		 basePage.validateElementPresentAssertion(Constants.GET_SEE_SUBJECT_LABLE);  
			
		    
		    boolean isSubjectLabelTextCorrect = basePage.compareText(Constants.GET_SEE_SUBJECT_LABLE, "Your Subject *");
			  System.out.println(isSubjectLabelTextCorrect);
	}

	@And("user is able to see message label")
	public void user_is_able_to_see_message_label() throws InterruptedException {
		basePage.validateElementPresentAssertion(Constants.GET_SEE_MESSAGE_LABLE);  
		
	    
	    boolean isMessageLabelTextCorrect = basePage.compareText(Constants.GET_SEE_MESSAGE_LABLE, "Message *");
		  System.out.println(isMessageLabelTextCorrect);
	}

	@And("user is able to see send message button")
	public void user_is_able_to_see_send_message_button() throws InterruptedException {
basePage.validateElementPresentAssertion(Constants.GET_SEE_MESSAGE_BUTTON_LABLE);  
		
	    
	    boolean isSendMessageLabelTextCorrect = basePage.compareText(Constants.GET_SEE_MESSAGE_BUTTON_LABLE, "Send Message");
		  System.out.println(isSendMessageLabelTextCorrect);
	}

  	
  	//2nd scenario methods
  	
  	@And("user is able to see name text field")
  	public void user_is_able_to_see_name_field() throws InterruptedException { 
  		
  		 basePage.validateElementPresentAssertion(Constants.GET_SEE_NAME_FIELD);
  		
  		
  	}
  	
  	@And("user is able to see email text field")
  	public void user_is_able_to_see_email_text_field() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_EMAIL_FIELD);  
  		
  	}
  	
  	@And("user is able to see contact number text field")
  	public void user_is_able_to_see_contact_number_text_field() throws InterruptedException {
  		 basePage.validateElementPresentAssertion(Constants.GET_SEE_CONTACT_FIELD);
  		
  	}

  	@And("user is able to see subject text field")
  	public void user_is_able_to_see_subject_text_field() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_SUBJECT_FIELD);
  		
  	}

  	@And("user is able to see message text field")
  	public void user_is_able_to_see_message_text_field() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_MESSAGE_FIELD);
  		
  	}
  	
  	
  //3rd scenario
  	
  	@And("user is able to see the phone number")
  	public void user_is_able_to_see_the_phone_number() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_PHONE_NUM);
  		
  		boolean isPhnNOTextCorrect = basePage.compareText(Constants.GET_SEE_PHONE_NUM, "Phone Number");
  		  System.out.println(isPhnNOTextCorrect);
  	}

  	@And("user is able to see Location")
  	public void user_is_able_to_see_Location() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_LOCATION);
  		
  		boolean isLocationTextCorrect = basePage.compareText(Constants.GET_SEE_LOCATION, "Location");
  		  System.out.println(isLocationTextCorrect);
  	}

  	@And("user is able to see email address")
  	public void user_is_able_to_see_email_address() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_EMAIL_ADDRESS);
  		
  		boolean isEmailAddressTextCorrect = basePage.compareText(Constants.GET_SEE_EMAIL_ADDRESS, "Email Address");
  		  System.out.println(isEmailAddressTextCorrect);
  	}
  	
  	

 // 4th scenario
    @And("user is able")
    public void user_is_able_to_see_google_maps_in_contactus_page() throws InterruptedException {
        
    	switchToIframe();
        
       boolean validateElementPresent =  basePage.verifyElementPresent(Constants.GET_SEE_GMAPS);
        
        backToNormal();
        
    }
  	
  	
  	
  	//5th scenario
  	
  	@And("user is able to see facebook icon in contact us page")
  	public void user_is_able_to_see_facebook_icon_in_contactus_page() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_FACEBOOK_ICON);  
  		
  	}
  	
  	@And("user is able to see twitter icon in contact us page")
  	public void user_is_able_to_see_twitter_icon_in_contactus_page() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_TWITTER_ICON);
  		
  	}

  	@And("user is able to see insta icon in contact us page")
  	public void user_is_able_to_see_insta_icon_in_contactus_page() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_INSTA_ICON);
  			
  		}

  	@And("user is able to see linkedin icon in contact us page")
  	public void user_is_able_to_see_linkedin_icon_in_contactus_page() throws InterruptedException {
  		basePage.validateElementPresentAssertion(Constants.GET_SEE_LINKEDIN_ICON);
  		
  		}
  	
  	
  	public void switchToIframe() {
        driver.switchTo().frame(0); // Assuming the iframe is the first one on the page
    }

    public void backToNormal() {
        driver.switchTo().defaultContent();
    }
}

  	
	

