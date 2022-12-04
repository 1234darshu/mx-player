package defination_mxplayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definationfile {
	WebDriver driver;

	@Given("I should go to the browser")
	public void i_should_go_to_the_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    }
	
	@And("Enter url")
	public void enter_url() {
		 driver.get("https://www.mxplayer.in/");
	     	}


	@Then("close the browser")
	public void close_the_browser(io.cucumber.datatable.DataTable dataTable) {
		driver.close();
	}




}

	



	