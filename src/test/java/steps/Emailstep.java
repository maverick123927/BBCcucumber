package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Homepage;
public class Emailstep {
	public WebDriver driver;
	public Homepage hp;
	@Given("user start browser")
	public void user_start_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirnay\\eclipse-workspace\\BBCcucumber2\\Driver\\chromedriver.exe");
		hp= new Homepage(driver);
		driver= new ChromeDriver();
	}

	@When("user enter url")
	public void user_enter_url() {
		driver.get( "https://www.urbanladder.com/");
		}

	@Then("^user enter the id (.*)$")
	public void user_enter_the_id(String id) {
		hp= new Homepage(driver);
		hp.Emailtxtbar(id);	}

	@Then("click the subscribe button")
	public void click_the_subscribe_button() {
		hp= new Homepage(driver);
		hp.clickEmailSubmit();
		}

	@Then("user close the browser")
	public void user_close_the_browser() {
		driver.close();
		driver.quit();
	}

}
