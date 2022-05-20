package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aboutpage {
	WebDriver ldriver;
	
	public Aboutpage(WebDriver rdriver){
		ldriver= rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id='page_content']/div[1]/div/p[1]")
	@CacheLookup
	WebElement h2about;
	
	public String checkheading() {
		String line=h2about.getText();
		return line;
	}
}
	

