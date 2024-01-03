package com.simplilearn.bddtest.stepdefinitions;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePagesteps {
	String driverpath="src\\test\\resources\\drivers\\windows\\geckodriver.exe";
    String siteurl="https://www.amazon.in/";
	WebDriver driver;
	
	
	@Before(value="@HomePageTest")
	public void setUp() {
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	
	@After(value="@HomePageTest")
	public void cleanUp() {
		if(driver!=null)
			driver.quit();
	}
	@Given("Open the Firefox browser and Launch the amazon application")
	public void open_the_firefox_browser_and_launch_the_amazon_application() {
	    driver.get(siteurl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@When("User on amazon application homepage")
	public void user_on_amazon_application_homepage() {
	 Assertions.assertEquals(siteurl,driver.getCurrentUrl());   
	}

	@Then("Confirm meta title of the page")
	public void confirm_meta_title_of_the_page() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		Assertions.assertEquals(actualTitle, expectedTitle);
	}

	@When("User navigate to different link")
	public void user_navigate_to_different_link() {
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	}

	@Then("Confirm meta title of the curent page")
	public void confirm_meta_title_of_the_curent_page() throws InterruptedException {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Thread.sleep(1000);
		String actualTitle = driver.getTitle();
		Assertions.assertNotEquals(actualTitle, expectedTitle);
	}
	

	
}
