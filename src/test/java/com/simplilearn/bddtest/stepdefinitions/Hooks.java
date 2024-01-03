package com.simplilearn.bddtest.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	@Before
	public void beforeScenario() {
		System.out.println("--This will run before the scenario--");
	}
	@After
	public void afterScenario() {
		System.out.println("--This will run after the scenario--");
	}
	@BeforeStep
	public void beforeStep() {
		System.out.println("--Before step--");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("--After step--");
	}
	
}
