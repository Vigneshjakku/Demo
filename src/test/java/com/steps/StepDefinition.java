package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	static WebDriver driver;
                                                                                                       
	@Given("User is on loginpage")
	public void user_is_on_loginpage() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");

	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.cssSelector("*#email")).sendKeys("Besant Tambaram");
		driver.findElement(By.id("pass")).sendKeys("1234567");
	}

	@When("User clicks on loginpage")
	public void user_clicks_on_loginpage() {
		driver.findElement(By.cssSelector("*[name='login']")).click();
	}

	@Then("User verify the error message")
	public void user_verify_the_error_message() {
		WebElement text = driver.findElement(By.xpath("//*[text()='Find your account and log in.']"));

		String text2 = text.getText();

		Assert.assertEquals(text2, "Find your account and log in.");
		System.out.println(text2);

	}
}
