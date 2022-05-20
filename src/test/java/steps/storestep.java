package steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Homepage;
import pageObject.Storepage;
import org.openqa.selenium.chrome.ChromeDriver;

public class storestep {
	
	
	public WebDriver driver;
	public Homepage hp;
	public Storepage sp;
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirnay\\eclipse-workspace\\BBCcucumber2\\Driver\\chromedriver.exe");
		hp= new Homepage(driver);
		driver= new ChromeDriver();
	}

	@When("user enter url in chrome browser")
	public void user_enter_url_in_chrome_browser() {
		driver.get( "https://www.urbanladder.com/");
	}

	@Then("user click store option")
	public void user_click_store_option() {
		hp= new Homepage(driver);
		hp.clickstorepage();
	}

	@And("user verify the storepage title")
	public void user_verify_the_storepage_title() {
		if(driver.getTitle()=="India's Favorite Office & Home Furniture Store") {
			Assert.assertTrue(true);
			System.out.print("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
	}

	@And("verify storepage elements")
	public void verify_storepage_elements() {
		sp=new Storepage(driver);
	    boolean li=sp.verifyviewbtn();
	    if(li==true) {
	    	System.out.println("test Pass");
	    }
	    else {
	    	System.out.println("test failed");
	    }	
	}

	@Then("user off the browser")
	public void user_off_the_browser() {
		driver.close();
		driver.quit();
	}

}
