package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Loginnnnnn {
	WebDriver driver = null;

	@Given("^Open Chrome browser$")
	public void open_Chrome_browser() throws Throwable {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E://Workspace//Cucumber_Bdd_Test//chromedriver.exe"); driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 */
		System.out.println("First Scenario----------Open Browser");
	}

	@Then("^Go to Application Home Page$")
	public void go_to_Application_Home_Page() throws Throwable {
		System.out.println("First Scenario----------Go to home page");
		// driver.get("https://www.facebook.com");
	}

	@Then("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		System.out.println("First Scenario----------Click on Login Button");
		// driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	@Then("^Enter Valid User name and Valid Password$")
	public void enter_Valid_User_name_and_Valid_Password() throws Throwable {
		System.out.println("First Scenario----------Entering UserName & Password");
		// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
		// driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("");
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		System.out.println("First Scenario----------Click on login  Button");
		// driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	}

	@Then("^User redirects to user home page$")
	public void user_redirects_to_user_home_page() throws Throwable {
		System.out.println("First Scenario----------User redirected to home page");
	}

}
