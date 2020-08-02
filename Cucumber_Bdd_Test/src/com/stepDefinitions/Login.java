package com.stepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
	@Given("^Open Chrome$")
	public void open_Chrome() {
		System.out.println("Second Feature:---------------open chrome");
	}

	@Then("^enter Username and Password$")
	public void enter_Username_and_Password(DataTable table) {
		List<List<String>> data = table.raw();
		System.out.println(data.get(0).get(0).toString() + "|||||" + data.get(0).get(1).toString());
		System.out.println(data.get(1).get(0).toString() + "|||||" + data.get(1).get(1).toString());
	}

	@Then("^i enter (.*) and (.*)$")
	public void i_enter_and(String un, String pwd) {
		System.out.println("User::::::" + un + "||||||||||" + "Password:::::" + pwd);

	}

	@Then("^close Chrome$")
	public void close_Chrome() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Second Feature:---------------close chrome");
	}
}
