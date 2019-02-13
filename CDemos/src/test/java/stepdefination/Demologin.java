package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Demologin {
	WebDriver Mh11;
	@Given("^Open browser and pass the application URL$")
	public void open_browser_and_pass_the_application_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");
		   Mh11 = new ChromeDriver();
		   Mh11.get("http://newtours.demoaut.com/");
		
		   
	}

	@When("^Enter the Valid UserID and Passowrd$")
	public void enter_the_Valid_UserID_and_Passowrd() throws Throwable {
		Mh11.findElement(By.name("userName")).sendKeys("admin");
		Mh11.findElement(By.name("password")).sendKeys("password");
	  Mh11.findElement(By.name("login")).click();
	}

	@Then("^Signout option should be visited in the next page$")
	public void signout_option_should_be_visited_in_the_next_page() throws Throwable {
	String tittle= Mh11.getTitle();
	Assert.assertEquals(tittle, "Sign-on: Mercury Tours");
	
	   
	}

	
}
