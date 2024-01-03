package com.simplilearn.bddtest.stepdefinitions;


import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProducts2steps {
    String driverpath="src\\test\\resources\\drivers\\windows\\geckodriver.exe";
    String siteurl="https://www.amazon.in/";
	WebDriver driver;
	WebElement searchBox;
	@Before(value="@SearchTest2")
	public void setUp() {
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	@After(value="@SearchTest2")
	public void cleanUp() {
		if(driver!=null)
			driver.quit();
	}
	@Given("Launch Amazon application on firefox browser")
	public void launch_amazon_application_on_firefox_browser() {
	    driver.get(siteurl);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	@When("Enter the product {string}")
	public void enter_the_product(String string) throws InterruptedException {
	    Thread.sleep(2000);
	    searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(string);
		Thread.sleep(2000);
	}

	

	@Then("Submit product")
	public void submit_product() {
		searchBox.submit();
	    
	}

	@Then("Confirm the page title {string}")
	public void confirm_the_page_title(String title) throws InterruptedException {
		Thread.sleep(1000);
		Assertions.assertEquals(title,driver.getTitle());
	}
}
