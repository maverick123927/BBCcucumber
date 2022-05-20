package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Homepage;
public class Searchstep {
	public WebDriver driver;
	public Homepage hp;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirnay\\eclipse-workspace\\BBCcucumber2\\Driver\\chromedriver.exe");
		hp= new Homepage(driver);
		driver= new ChromeDriver();
	}

	@When("open the url")
	public void open_the_url() {
		driver.get( "https://www.urbanladder.com/");
	}

	@Then("^user enter (.*) in the searchbox$")
	public void user_enter_in_the_searchbox(String item) {
		hp= new Homepage(driver);
	    hp.searchbar(item);
	}

	@And("click the search Button")
	public void click_the_search_Button() {
		hp= new Homepage(driver);
	    hp.clicksearchbtn();
	}
	
	@Then("user close the chrome browser")
	public void user_close_the_chrome_browser() {
		driver.close();
		driver.quit();
	}

}
