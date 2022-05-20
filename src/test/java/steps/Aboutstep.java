package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.Homepage;

public class Aboutstep {
	public WebDriver driver;
	public Homepage hp;
	
	
	@Given("user open chrome browser")
	public void user_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirnay\\eclipse-workspace\\BBCcucumber2\\Driver\\chromedriver.exe");
		hp= new Homepage(driver);
		driver= new ChromeDriver();
	}

	@When("user use the URL")
	public void user_use_the_URL() {
		driver.get("https://www.urbanladder.com/");
	}

	@Then("user click about us option")
	public void user_click_about_us_option() {
		hp= new Homepage(driver);
	    hp.clickaboutpage();
	}

	@And("user verify the page title")
	public void user_verify_the_page_title() {
		if(driver.getTitle()=="Urban Ladder | About Us - Urban Ladder") {
			Assert.assertTrue(true);
			System.out.print("Test passed");
		}
		else {
			System.out.println("Test failed");
		}	}

	@Then("close chrome browser")
	public void close_chrome_browser() {
		driver.close();
	    driver.quit();
	}




}
