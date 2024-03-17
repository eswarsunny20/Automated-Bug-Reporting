	
	package pages;

	import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDefinitions.SetupClass;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import utilities.BasePage;
	import utilities.Constants;
	import utilities.TestUtils;

	public class ServicesPage {
	//@Vishal
		String projectPath = System.getProperty("user.dir");
		String propertyFile = projectPath + "/project.properties";
		TestUtils utils = new TestUtils(propertyFile);
		
		private WebDriver driver;
	    private BasePage basePage;

	    public ServicesPage() {
	        this.driver = SetupClass.getDriver();
	        this.basePage = SetupClass.getBasePage();
	    }
	    
	    // test case 1
	    
	    @And("user is on nandamuri website home page")
		public void user_is_on_google_search() {
			System.out.println("user is on home Page");
			driver.navigate().to(utils.getProperty("Public_URL"));
		}
	    @And("user is able to see the logo image")
	    public void logo_check() {
	    	if(basePage.verifyElementPresent(Constants.Home_logo)) {
	    		System.out.println("Home Logo is Present");
	    	}
	    	else {
	    		Assert.fail();
	    	}
	    		
	    }
	    @And("user is able to see Home button")
	    public void home_button_check() throws InterruptedException {
	    	basePage.validateElementPresentAssertion(Constants.Home_button);
	    	basePage.compareText(Constants.Home_button, "Home");
//	    	if(basePage.verifyElementPresent(Constants.Home_button) && basePage.compareText(Constants.Home_button, "Home")) {
//	    		return true;
//	    	}
//	    	else
//	    		return false;
	    }
	    @When("user clicks Home")
	    public void clicks_home() {
	    	basePage.click(Constants.Home_button);
			
			System.out.println("clicks Home");
		}
	  
	    @Then("user navigates to About us page")
	    public void navigates_aboutus() {
	    	String currentUrl = driver.getCurrentUrl();
	        
	        // Define the expected URL for the home page
	        String expectedUrl = utils.getProperty("Public_URL"); // Replace with the actual expected URL
	        
	        // Compare the current URL with the expected URL
	        assertEquals("User did not navigate to the correct URL after clicking Home", expectedUrl, currentUrl);
	        
	        System.out.println("User navigated to the correct URL: " + currentUrl);
	    	//System.out.println("Navigated to About us");
	    }
	   
	    @And("user is able to see services button")
	    public void Service_DD_check() throws InterruptedException {
	    	basePage.validateElementPresentAssertion(Constants.Home_button);
	    	
	    	basePage.compareText(Constants.SERVIVE_DD, "Services");
	    	
	    }
	    
	     
	    @And("user Expands  Services dropdown")
		public void hover_service() throws InterruptedException {
	    	
	    	basePage.validateElementPresentAssertion(Constants.SERVIVE_DD);
	    	
	    	
			basePage.hoverOverElement(driver, Constants.SERVIVE_DD);
			System.out.println("Expands Service");
		}
	   
	    @When("Clicks on Testing service")
		public void select_Testing_Service_in_services_dropdown_box() {
			System.out.println("user enters a text in search box");
	        
			basePage.hoverOverElement(driver, Constants.SERVIVE_DD);
			basePage.selectlistElement("Testing Service");
		}
		@When("Clicks on ML service")
		public void select_ML_Service_in_services_dropdown_box() {
			System.out.println("Clicks on ML service");
	        
			basePage.hoverOverElement(driver, Constants.SERVIVE_DD);
			basePage.selectlistElement("Machne Learning Service");
		}
		@When("Clicks on Fullstack service")
		public void select_Fullstack_Service_in_services_dropdown_box() {
			System.out.println("user enters a text in search box");
	        
			basePage.hoverOverElement(driver, Constants.SERVIVE_DD);
			basePage.selectlistElement("Full Stack Service");
		}
		@When("Clicks on Azure service")
		public void select_Azure_Service_in_services_dropdown_box() {
			System.out.println("user enters a text in search box");
	        
			basePage.hoverOverElement(driver, Constants.SERVIVE_DD);
			basePage.selectlistElement("Azure Service");
		}
		@When("Clicks on Devops service")
		public void select_Devops_in_services_dropdown_box() {
			System.out.println("user enters a text in search box");
	        
			basePage.hoverOverElement(driver, Constants.SERVIVE_DD);
			basePage.selectlistElement("DevOps Service");
		}
		@When("Clicks on Data Engineering service")
		public void select_Data_Engineering_Service_in_services_dropdown_box() {
			System.out.println("user enters a text in search box");
	        
			basePage.hoverOverElement(driver, Constants.SERVIVE_DD);
			basePage.selectlistElement("Data Engineering Service");
		}
		@Then("user navigates back to nandamuri website home page")
		public void user_navigates_back_to_nandamuri_website_home_page() {
			
			driver.navigate().to(utils.getProperty("Public_URL"));
			String currentTitle = driver.getTitle();
		    
		    // Define the expected URL for the home page
		    String expectedTitle = "Nandamuri Solutions"; // Replace with the actual expected URL
		    
		    // Compare the current URL with the expected URL
		    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
		    
		    System.out.println("User navigated to the correct URL: " + currentTitle);
		}
		
		 @Then("user navigates to Azure service page")
			public void user_navigates_to_Azure_service_page() {
				System.out.println("user navigates to Azure service page");
				String currentTitle = driver.getTitle();
			    
			    // Define the expected URL for the home page
			    String expectedTitle = "Azure Services"; // Replace with the actual expected URL
			    
			    // Compare the current URL with the expected URL
			    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
			    
			    System.out.println("User navigated to the correct URL: " + currentTitle);
				
			}
		 @Then("user navigates to ML service page")
			public void user_navigates_to_ML_service_page() {
				System.out.println("user navigates to ML service page");
String currentTitle = driver.getTitle();
			    
			    // Define the expected URL for the home page
			    String expectedTitle = "Machine Learning Services"; // Replace with the actual expected URL
			    
			    // Compare the current URL with the expected URL
			    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
			    
			    System.out.println("User navigated to the correct URL: " + currentTitle);
				
			} 
		 @Then("user navigates to Data Engineering service page")
			public void user_navigates_to_DE_service_page() {
				System.out.println("user navigates to Data Engineering service page");
String currentTitle = driver.getTitle();
			    
			    // Define the expected URL for the home page
			    String expectedTitle = "Data Engineering Services"; // Replace with the actual expected URL
			    
			    // Compare the current URL with the expected URL
			    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
			    
			    System.out.println("User navigated to the correct URL: " + currentTitle);
				
			} 
		 @Then("user navigates to Testing service page")
			public void user_navigates_to_Testing_service_page() {
				System.out.println("user navigates to Testing service page ");
String currentTitle = driver.getTitle();
			    
			    // Define the expected URL for the home page
			    String expectedTitle = "Testing Services"; // Replace with the actual expected URL
			    
			    // Compare the current URL with the expected URL
			    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
			    
			    System.out.println("User navigated to the correct URL: " + currentTitle);
				
			} 
		 @Then("user navigates to Fullstack service page")
			public void user_navigates_to_Fullstack_service_page() {
				System.out.println("user navigates to Fullstack service page");
String currentTitle = driver.getTitle();
			    
			    // Define the expected URL for the home page
			    String expectedTitle = "Full Stack Services"; // Replace with the actual expected URL
			    
			    // Compare the current URL with the expected URL
			    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
			    
			    System.out.println("User navigated to the correct URL: " + currentTitle);
				
			} 
		 @Then("user navigates to Devops service page")
			public void user_navigates_to_Devops_service_page() {
				System.out.println("user navigates to Devops service page ");
String currentTitle = driver.getTitle();
			    
			    // Define the expected URL for the home page
			    String expectedTitle = "DevOps Services"; // Replace with the actual expected URL
			    
			    // Compare the current URL with the expected URL
			    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
			    
			    System.out.println("User navigated to the correct URL: " + currentTitle);
				
			} 
		 @And("user is able to see whatsapp logo")
		    public void whatsapp_logo_check() throws InterruptedException {
			 basePage.validateElementPresentAssertion(Constants.phonelogo);
			
		 }
		    	
		  @And("user is able to see contact number")
		    public void contact_check() throws InterruptedException {
		    	basePage.validateElementPresentAssertion(Constants.phonelogo);
		    	basePage.compareText(Constants.number_label, "1 (647) 313-6820");
		    	
		    }
		    //test case 2
		  @And("user is able to see the We offer you the best IT practise and services label")
		    public void main_label() throws InterruptedException {
		    	basePage.validateElementPresentAssertion(Constants.main_home_label);

		    	basePage.scrollToElement(Constants.main_home_label);
		    		basePage.compareText(Constants.main_home_label, "We offer you the best IT practise and services");
		    		System.out.println("Main label is visible");		    	
		    	
		    }
		  
		  @And("user is able to see Empower, Scale, Succeed: Unleashing IT Services for Your Agency Benefit label")
		    public void Empower_label() throws InterruptedException {
			  Thread.sleep(2000);
			  basePage.scrollToElement(Constants.Empower_scale_label);
			 basePage.validateElementPresentAssertion(Constants.Empower_scale_label);
		    	
		     basePage.compareText(Constants.Empower_scale_label,"Unleashing IT Services for Your Agency's Benefit");
		    		System.out.println("empower label is visible");
		    	
		    	
		    }
		  @And("user is able to see the backgroundImage")
		    public void background_image() throws InterruptedException {
			  basePage.validateElementPresentAssertion(Constants.BG_image);
			  System.out.print("BG image visible");
			 
		    	

		        
		  }
		  @And("user is able to see the Image1 and image2")
		    public void image1_and2() throws InterruptedException {
			  Thread.sleep(2000);
			  basePage.scrollToElement(Constants.Image1);
			  basePage.validateElementPresentAssertion(Constants.Image1);
			  basePage.validateElementPresentAssertion(Constants.Image2) ;
			  System.out.print(" images visible");
			  
			  
			  
		    	
		    }	
		  
		  @And("user is able to see Our Technology label")
		    public void Our_Technology_label() throws InterruptedException {
			  basePage.scrollToElement(Constants.Our_Technology);
			  basePage.validateElementPresentAssertion(Constants.Our_Technology);
			  basePage.compareText(Constants.Our_Technology, "Technology");
		    	
		    }
		  //test case 3
		  @And("user is able to see Testing service logo")
		    public void Testing_logo_check() throws InterruptedException {
			  Thread.sleep(2000);
			  basePage.scrollToElement(Constants.Testing_logo);
			  basePage.validateElementPresentAssertion(Constants.Testing_logo);
		    	
		    		System.out.println("testing logo visible");
		    	
		    }
		  @And("user is able to see Testing Label")
		    public void Testing_label() throws InterruptedException {
		    	
			  basePage.scrollToElement(Constants.Testing_label);
		    	basePage.validateElementPresentAssertion(Constants.Testing_label);
		    		basePage.compareText(Constants.Testing_label, "Testing");
		    		System.out.println("testing lebel visible");
		    	
		    }
		  @When("Clicks on Testing")
			public void Testing_service_click() {
				System.out.println("Testing_service_click");
		        
				basePage.click(Constants.Testing_label);
			}
		  @Then("Navigates to Testing service page")
			public void navigates_to_Testing_service_page() {
			  System.out.println("user navigates to Testing service page ");
			  String currentTitle = driver.getTitle();
			  			    
			  			    // Define the expected URL for the home page
			  			    String expectedTitle = "Testing Services"; // Replace with the actual expected URL
			  			    
			  			    // Compare the current URL with the expected URL
			  			    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
			  			    
			  			    System.out.println("User navigated to the correct URL: " + currentTitle);
				
			}
		  @And("user is able to see We focus on the best practices for it solutions and services label")
		    public void We_Practice_label() throws InterruptedException {
			  basePage.scrollToElement(Constants.We_focus_label1);
		    	basePage.validateElementPresentAssertion(Constants.We_focus_label1);
		    		basePage.compareText(Constants.We_focus_label1, "We focus on the best practices for it solutions and services");
		    	
		    }
		  
		  
		  @And("user is able to see Full Stack service logo")
		    public void Fullstack_logo_check() throws InterruptedException {
			  Thread.sleep(2000);
			  basePage.scrollToElement(Constants.fullstack_logo);
			  basePage.validateElementPresentAssertion(Constants.fullstack_logo);
		    		System.out.println("fullstack logo visible");
		    	
		    }
		    
		  @And("user is able to see Full Stack Label")
		    public void Fullstack_label() throws InterruptedException {
			  basePage.scrollToElement(Constants.fullstack_label);
			 basePage.validateElementPresentAssertion(Constants.fullstack_label) ;
		    		basePage.compareText(Constants.fullstack_label, "Full Stack");
		    		System.out.println("fullstack lebel visible");
		    	
		    }
		  @When("Clicks on Full Stack")
			public void Fullstack_service_click() {
				System.out.println("fullstack_service_click");
		        
				basePage.click(Constants.fullstack_label);
			}
		  @Then("Navigates to Full Stack service page")
			public void navigates_to_fullstack_service_page() {
			  System.out.println("user navigates to Fullstack service page");
			  String currentTitle = driver.getTitle();
			  			    
			  			    // Define the expected URL for the home page
			  			    String expectedTitle = "Full Stack Services"; // Replace with the actual expected URL
			  			    
			  			    // Compare the current URL with the expected URL
			  			    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
			  			    
			  			    System.out.println("User navigated to the correct URL: " + currentTitle);
				
			}
		  
		  @And("user is able to see DevOps service logo")
		    public void DevOps_logo_check() throws InterruptedException {
			  Thread.sleep(2000);
			  basePage.scrollToElement(Constants.Devops_logo);

			  basePage.validateElementPresentAssertion(Constants.Devops_logo);
			  
		    		System.out.println("devops logo visible");
		    	
		    }
		  @And("user is able to see DevOps Label")
		    public void DevOps_label() throws InterruptedException {
			  basePage.scrollToElement(Constants.Devops_label);

			  basePage.validateElementPresentAssertion(Constants.Devops_label) ;
		    		basePage.compareText(Constants.Devops_label, "Devops");
		    		System.out.println("devops lebel visible");
		    	
		    }
		  @When("Clicks on DevOps")
			public void DevOps_service_click() throws InterruptedException {
				System.out.println("Devops_service_click");
		        Thread.sleep(2000);
				basePage.click(Constants.Devops_logo);
			}
		  @Then("Navigates to DevOps service page")
			public void navigates_to_DevOps_service_page() {
				System.out.println("user navigates to Azure service page");
				 String currentTitle = driver.getTitle();
	  			    
	  			    // Define the expected URL for the home page
	  			    String expectedTitle = "DevOps Services"; // Replace with the actual expected URL
	  			    
	  			    // Compare the current URL with the expected URL
	  			    assertEquals("User did not navigate to the correct URL ", expectedTitle, currentTitle);
	  			    
	  			    System.out.println("User navigated to the correct URL: " + currentTitle);
				
			}
		  

		  @And("user is able to see the video button logo")
		    public void Videobutton_logo_check() throws InterruptedException {
			  
			  //Thread.sleep(4000);
			  basePage.scrollToElement(Constants.video_btn_logo);
			  Thread.sleep(2000);
			  basePage.validateElementPresentAssertion(Constants.video_btn_logo);
			  

		    }
		  @When("clicks on video button logo")
			public void video_button_click() throws InterruptedException {
				System.out.println("video_button_click");
				Thread.sleep(2000);
				basePage.click(Constants.video_btn) ;
					
				
			}
		  @Then("it Opens a Pop-up with a youtube Video")
			public void open_youtube_video() throws InterruptedException {
			  Thread.sleep(3000);
				System.out.println("it Opened a Pop-up with a youtube Video");
				
			}
		  //test case5
		  @And("user is able to see About Company label")
		    public void About_Company_label() throws InterruptedException {

			 Thread.sleep(5000);
			  basePage.scrollToElement(Constants.About_Company);

		    	basePage.validateElementPresentAssertion(Constants.About_Company) ;
		    		 basePage.compareText(Constants.About_Company, "About Company");
		    		System.out.println("about company visible");
		    		
		    	
		    }
		  @And("user is able to see Empowering the future of tech with our cutting-edge IT services, paving the way for innovation and success label")
		    public void Empowering_label() throws InterruptedException {
			  basePage.scrollToElement(Constants.Empowering_label);

		    	basePage.validateElementPresentAssertion(Constants.Empowering_label);
		    	 basePage.compareText(Constants.Empowering_label, "Empowering the future of tech with our cutting-edge IT services, paving the way for innovation and success");
		    		
		    } @And("user is able to see Facebook logo")
		    public void Facebook_logo() throws InterruptedException {
		    	 basePage.scrollToElement(Constants.Empowering_label);
		    	basePage.validateElementPresentAssertion(Constants.Facebook_logo);
		    	
		    	
		    } @And("user is able to see Twitter logo")
		    public void Twitter_logo() throws InterruptedException {
		    	basePage.validateElementPresentAssertion(Constants.Twitter_logo);
		    	
		    } @And("user is able to see Youtube logo")
		    public void Youtube_logo() throws InterruptedException {
		    	basePage.validateElementPresentAssertion(Constants.Youtube_logo);
		    	
		    } @And("user is able to see Linkedin logo")
		    public void Linkedin_logo() throws InterruptedException {
		    	basePage.validateElementPresentAssertion(Constants.Linkedin_logo);
		    	
		    } @And("user is able to see Contacts label")
		    public void Contacts_label() throws InterruptedException {
		    	 basePage.scrollToElement(Constants.Contacts_footer);
		    	basePage.validateElementPresentAssertion(Constants.Contacts_footer);
		    	basePage.compareText(Constants.Contacts_footer, "Contacts");
		    	
		    } 
		    @And("user is able to see Adress label")
		    public void Adress_label() throws InterruptedException {
//		    	
		    	basePage.validateElementPresentAssertion(Constants.Adress_footer);
		    	 basePage.compareText(Constants.Adress_footer, "Adress:");
		    	
		    } @And("user is able to see 3080 Yonge Street suite 6060 Toronto M4N 3N1 CANADA Ontario, Canada label")
		    public void Adress_body() throws InterruptedException {

		    	basePage.validateElementPresentAssertion(Constants.Adress_body_footer);
		    	 basePage.compareText(Constants.Adress_body_footer, "3080 Yonge Street suite 6060 Toronto M4N 3N1 CANADA Ontario, Canada");
		    		
		    } @And("user is able to see Email label")
		    public void Email_label() throws InterruptedException {
		    	
		    	basePage.validateElementPresentAssertion(Constants.Email_footer) ;
		    	basePage.compareText(Constants.Email_footer, "Email:");
		    		
		    }
		    @And("user is able to see raman@nandamurisolutionsinc.ca label")
		    public void Email_body_label() throws InterruptedException {
		    	
		    	basePage.validateElementPresentAssertion(Constants.Email_body_footer) ;
		    	basePage.compareText(Constants.Email_body_footer, "raman@nandamurisolutionsinc.ca");
		    	
		    }
		    
		    
		    
		    
		    @And("user is able to see Phone label")
		    public void Phone_label() throws InterruptedException {
		    	
		    	basePage.validateElementPresentAssertion(Constants.Phone_footer) ;
		    			basePage.compareText(Constants.Phone_footer, "Phone:");
		    		
		    }
		    @And("user is able to see phone body label")
		    public void Phone_body_label() throws InterruptedException {
		    	
		    	basePage.validateElementPresentAssertion(Constants.Phone_body_footer);
		    	basePage.compareText(Constants.Phone_body_footer, "1 (647) 313-6820");
		    	
		    }
		    @And("user is able to see Newsletter label")
		    public void Newsletter_label() throws InterruptedException {
		    	
		    	basePage.validateElementPresentAssertion(Constants.Newsletter_label);
		    	basePage.compareText(Constants.Newsletter_label, "Newsletter");
		    	
		    }
		    @And("user is able to see Subscribe to our newsletter to receive updates on the latest news! label")
		    public void Newsletter_body_label() throws InterruptedException {
		   
		    	basePage.validateElementPresentAssertion(Constants.Newsletter_body) ;
		    	basePage.compareText(Constants.Newsletter_body, "Subscribe to our newsletter to receive updates on the latest news!");
		    	
		    }
		    @And("user is able to see subscribe with us text field")
		    public void subscribe_textfiled() throws InterruptedException {
		    	basePage.validateElementPresentAssertion(Constants.Subscribe_footer) ;
		    	
		    }
		    @And("user is able to see submit button logo")
		    public void submit_logo() throws InterruptedException {
		    	basePage.validateElementPresentAssertion(Constants.submit_logo_footer);
		    		
		    }
		    @And("user is able to see © 2024 Nandamuri Solutions |  Powered by Lazarus Info tech label")
		    public void Final_footer_label() throws InterruptedException {
		    	
		    	basePage.validateElementPresentAssertion(Constants.final_footer);

		    		
		    }
		    
		  
		 
	}


