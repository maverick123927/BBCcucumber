package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.Homepage;

import pageObject.Contactpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class contactsstep {
	
	public WebDriver driver;
	public Homepage hp;
	public Contactpage cp;
	@Given("user open browser")
	public void user_open_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirnay\\eclipse-workspace\\BBCcucumber2\\Driver\\chromedriver.exe");
		hp= new Homepage(driver);
		driver= new ChromeDriver();    
	}

	@When("user enter url  {string} in browser")
	public void user_enter_url_in_browser(String url) {
		driver.get(url);
		}

	@Then("user click on contact us page")
	public void user_click_on_contact_us_page() {
		hp= new Homepage(driver);
		hp.clickcontactpage();
	}

	@And("user verify the contact page title")
	public void user_verify_the_contact_page_title() {
		if(driver.getTitle()=="Contact Us | urbanladder.com") {
			Assert.assertTrue(true);
			System.out.print("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
	}
	

	@And("user quit the chrome browser")
	public void user_quit_the_chrome_browser() {
	 		driver.close();
			driver.quit();
	}




}
