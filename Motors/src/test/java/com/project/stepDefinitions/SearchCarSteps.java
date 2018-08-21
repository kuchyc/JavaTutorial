

package com.project.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarSteps {

	private WebDriver driver;
	String BaseURL = "https://www.motors.co.uk/";

	@Given("^I am on the Motors Homepage$")
	public void i_am_on_the_Motors_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Thread.sleep(3000);
		driver.navigate().to(BaseURL);

	}

	@Given("^I enter my postcode$")
	public void i_enter_my_postocode() throws Throwable {
		WebElement postcode = driver.findElement(By.name("PostCode"));
		postcode.sendKeys("AL71EL");

	}

	@Given("^I select a make Honda$")
	public void i_select_a_make_Honda() throws Throwable {
		Select select = new Select(driver.findElement(By.name("Make")));
		select.selectByValue("Jaguar");
		Thread.sleep(3000);
	}

	@When("^I click on search$")
	public void i_click_on_search() throws Throwable {
		WebElement searchBtn = driver.findElement(By.className("sp__btn"));
		searchBtn.click();
	}

	@Then("^results of my search are displayed$")
	public void results_of_my_search_are_displyed() throws Throwable {
		Thread.sleep(30000);
		driver.quit();
	}

}





