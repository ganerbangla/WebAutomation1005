package step_definitions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_classes.SetDriver;

public class GoogleFooterLinks {
	WebDriver driver;
	
	public GoogleFooterLinks(){
		driver = SetDriver.webDriver;
	}

	
	@Given("^I go to Google Home page$")
	public void i_go_to_Google_Home_page() throws Throwable {


		Thread.sleep(2000);
		driver.get("https://www.google.com");


	}

	@When("^I click on the Privacy link$")
	public void i_click_on_the_Privacy_link() throws Throwable {

		driver.findElement(By.linkText("Privacy")).click();

		Thread.sleep(4000);
	}

	@Then("^I see the Privacy page$")
	public void i_see_the_Privacy_page() throws Throwable {

		Assert.assertEquals(driver.getPageSource().contains("When you use Google services, you trust us with your information."),true);
		Thread.sleep(2000);

	}


@When("^I click on the Terms link$")
public void i_click_on_the_Terms_link() throws Throwable {


}

@Then("^I see the Terms page$")
public void i_see_the_Terms_page() throws Throwable {


}

@When("^I click on the Settings link$")
public void i_click_on_the_Settings_link() throws Throwable {


}

@Then("^I see the Settings page$")
public void i_see_the_Settings_page() throws Throwable {


}



}


