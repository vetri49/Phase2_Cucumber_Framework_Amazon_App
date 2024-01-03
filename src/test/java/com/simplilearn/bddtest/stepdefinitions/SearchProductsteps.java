package com.simplilearn.bddtest.stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchProductsteps {
	String driverpath="src\\test\\resources\\drivers\\windows\\geckodriver.exe";
    String siteurl="https://www.amazon.in/";
	WebDriver driver;
	WebElement searchBox;
	
	@Before(value="@SearchTest")
	public void setUp() {
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	
	@After(value="@SearchTest")
	public void cleanUp() {
		if(driver!=null)
			driver.quit();
	}
	
	@Given("Open firefox browser and Amazon application")
	public void open_firefox_browser_and_amazon_application() {
		driver.get(siteurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    
	}

	@Given("Maximize browser window")
	public void maximize_browser_window() {
		driver.manage().window().maximize();
	}

	@Then("Enter the product search in the search bar")
	public void enter_the_product_search_in_the_search_bar(DataTable dataTable) {
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
		 System.out.println(">>>>>>>>>>>>"+ dataList);
		for(Map<String, String> data : dataList) {
	        searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys(data.get("product-name"));
		}
	}
		@Then("Submit  the product")
		public void submit_the_product() throws InterruptedException {
			Thread.sleep(1000);
		    searchBox.submit();
		}

		@Then("Clear search bar")
		public void clear_search_bar() {
		    
		}

	}
