package com.freecrm.bdd.framework.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;	
	
	@Given("^User is already on Login page$")
	public void user_is_already_on_Login_page()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manpreet\\Downloads\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		}
	
	@When("^Title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM()  {
	    String title = driver.getTitle();
	    System.out.println("Login page title is " + title);
	    Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);

	}
	
	@Then("^User enters username and password$")
	public void user_enters_username_and_password()  {
		driver.findElement(By.name("username")).sendKeys("masingh68");
		driver.findElement(By.name("password")).sendKeys("test@123");

	}
	
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}
	
	@Then("^User is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home page title is " + title);
		Assert.assertEquals("CRMPRO", title);
		driver.quit();

	}

}
