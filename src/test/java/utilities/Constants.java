package utilities;

public class Constants {
	
	
	public static final String GET_STARTED_HOMEPAGE = "//span[contains(text(),'Get Started')]";
	public static final String Home_logo = "//div[@class='navbar-header navbar-header-custom']/a/img";
	public static final String phonelogo = "//div[@class='attr-nav align-items-xl-center ms-xl-auto main-font']/ul/li[1]/a/i";
	public static final String number_label = "//div[@class='attr-nav align-items-xl-center ms-xl-auto main-font']/ul/li[2]/a/span";
	public static final String NAME_TEXT_FIELD = "id=name";

	//1st scenario    
	
	public static final String GET_SEE_NAME_LABLE ="(//label[@for='name'])[1]";
	public static final String GET_SEE_EMAIL_LABLE ="//label[@for='email']";
	public static final String GET_SEE_SUBJECT_LABLE ="(//label[@for='subject'])[1]";
	public static final String GET_SEE_CONTACT_LABLE ="//label[normalize-space()='Contact Number']";
	public static final String GET_SEE_MESSAGE_LABLE ="(//label[@for='message'])[1]";
	public static final String GET_SEE_MESSAGE_BUTTON_LABLE ="(//span[normalize-space()='Send Message'])[1]";
	
	//2nd scenario
	public static final String GET_SEE_NAME_FIELD ="//*[@id='name']";
	public static final String GET_SEE_EMAIL_FIELD ="(//input[@id='email'])[1]";
	public static final String GET_SEE_SUBJECT_FIELD ="(//input[@id='subject'])[1]";
	public static final String GET_SEE_CONTACT_FIELD =" (//input[@id='phone'])[1]";
	public static final String GET_SEE_MESSAGE_FIELD ="(//textarea[@id='message'])[1]";
	
	//3rd  scenario
	public static final String GET_SEE_PHONE_NUM ="(//h3[normalize-space()='Phone Number'])[1]";
	public static final String GET_SEE_LOCATION ="(//h3[normalize-space()='Location'])[1]";
	public static final String GET_SEE_EMAIL_ADDRESS ="(//h3[normalize-space()='Email Address'])[1]";
	
	
	//4th scenario
	public static final String GET_SEE_GMAPS ="(//div[@class='quform-submit-inner'])[1]";
	
	//5th scenario
	
	public static final String GET_SEE_FACEBOOK_ICON ="(//a[@href='#!'])[5]";
	public static final String GET_SEE_TWITTER_ICON ="(//i[@class='fab fa-twitter'])[2]";
	public static final String GET_SEE_INSTA_ICON ="(//a[@href='#!'])[7]";
	public static final String GET_SEE_LINKEDIN_ICON ="(//a[@href='#!'])[8]";
		
		
	
  public static final String GET_ABOUT_US = "//*[@id='nav']/li[2]/a";
	
	public static final String GET_SCROLL_MARK = "/html/body/a";
	
	public static final String GET_HOME_PAGE = "/html/body/div[1]/section[1]/div[1]/div/div/ul/li[1]/a";
	
	public static final String CUSTOMER_EXPERIENCE_CONTENT_AU_PAGE = "/html/body/div[1]/section[2]/div/div/div[1]/div/div[2]/div[1]/div[2]/p";
	
	public static final String CUSTOMER_IMAGES ="/html/body/div[1]/section[2]/div/div/div[1]/div/div[2]/div[1]/div[1]/i";

	public static final String HOME_ABOUT_US = "/html/body/div[1]/section[1]/div[1]/div/div/ul/li[1]/a";
	
	public static final String IMAGE_BESIDE_CONTENT = "/html/body/div[1]/section[2]/div/div/div[1]/div/div[2]/div[1]/div[1]/i";
	
	public static final String WORKING_PROCESS_SECTION_XPATH = "/html/body/div[1]/section[4]/div/div[1]/h2";
	
	public static final String IMAGE_1_XPATH = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[1]/div/div/img";
	
	public static final String IMAGE_2_XPATH = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[2]/div/div/img";
	
	public static final String IMAGE_3_XPATH = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[3]/div/div/img";
	
	public static final String CONTENT_BELOW_IMAGE_1 ="/html/body/div[1]/section[4]/div/div[2]/div[2]/div[1]/div/p";
	
	public static final String CONTENT_BELOW_IMAGE_2 = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[2]/div/p";

    public static final String CONTENT_BELOW_IMAGE_3 = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[3]/div/p";

  
  public static final String Home_button ="//*[@id=\"nav\"]/li[1]/a";
	public static final String SERVIVE_DD = "//*[@id='nav']/li[3]/a";
	public static final String About_Company = "//h3[contains(text(),'About')]";
	public static final String Empowering_label = "//div[@class='container']/div/div/h4";
	public static final String Facebook_logo = "(//i[@class='fab fa-facebook-f'])";
	public static final String Twitter_logo = "(//i[@class='fab fa-twitter'])";
	public static final String Youtube_logo = "(//i[@class='fab fa-youtube'])";
	public static final String Linkedin_logo = "(//i[@class='fab fa-linkedin-in'])";
	public static final String Contacts_footer = "//div[@class='container']/div/div[2]/div/h3";
	public static final String Adress_footer = "//div[@class='container']/div/div[2]/div/ul/li[1]/strong";
	public static final String Adress_body_footer = "//div[@class='container']/div/div[2]/div/ul/li[1]/span";
	public static final String Email_footer = "//div[@class='container']/div/div[2]/div/ul/li[2]/strong";
	public static final String Email_body_footer = "//div[@class='container']/div/div[2]/div/ul/li[2]/span";
	public static final String Phone_footer = "//div[@class='container']/div/div[2]/div/ul/li[3]/strong";
	public static final String Phone_body_footer = "//div[@class='container']/div/div[2]/div/ul/li[3]/span";
	public static final String Newsletter_label = "//div[@class='container']/div/div[3]/div/h3";
	public static final String Newsletter_body = "//div[@class='container']/div/div[3]/div/p";
	public static final String Subscribe_footer = "//div[@class='container']/div/div[3]/div/form/div/div/div/div/div/input";
	public static final String submit_logo_footer = "//div[@class='container']/div/div[3]/div/form/div/div/div[2]/div/button";
	public static final String final_footer = "//div[@class='py-4 border-top border-color-light-white']/div/div/div/p";
	public static final String main_home_label = "(//a[@href='contact.html'])[2]/../h1";
	public static final String Empower_scale_label = "(//div[@class='container'])[2]/div/div/div/h2/span";
	public static final String BG_image = "(//a[@href='contact.html'])[2]/../../../../../div";
	public static final String Image1 = "(//div[@class='container'])[2]/div/div/div/div/div/div/div/img";
	public static final String Image2 = "(//div[@class='container'])[2]/div/div/div/div/div/div[2]/div/img";
	public static final String Our_Technology = "//section[@class='about-style-02 pt-18 pt-lg-10']/div[@class='container']/h2/span";
	public static final String video_btn_logo = "(//div[@class='container'])[3]/div/div[2]/div/div/div/a/i[@class='fa fa-play']";
	public static final String video_btn = "(//div[@class='container'])[3]/div/div[2]/div/div/div/a";

	public static final String Testing_logo = "//div[@class='container']/div/div/div/div/div/div/img[@src='img/icons/18.png']";
	public static final String Testing_label = "//div[@class='container']/div/div/div/div/div/div[2]/h3/a";
	public static final String We_focus_label1= "//div[@class='container']/div/div/div/div/div/div[2]/p";
	public static final String fullstack_logo = "//div[@class='container']/div/div/div[2]/div/div/div/img[@src='img/icons/19.png']";
	public static final String fullstack_label = "//div[@class='container']/div/div/div[2]/div/div/div[2]/h3/a";
	public static final String We_focus_label2= "//div[@class='container']/div/div/div[2]/div/div/div[2]/p";
	public static final String Devops_logo = "//div[@class='container']/div/div/div[3]/div/div/div/img[@src='img/icons/20.png']";
	public static final String Devops_label = "//div[@class='container']/div/div/div[3]/div/div/div[2]/h3/a";
	public static final String We_focus_label3= "//div[@class='container']/div/div/div[3]/div/div/div[2]/p";
}



