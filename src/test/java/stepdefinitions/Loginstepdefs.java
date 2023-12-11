package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefs {

	WebDriver driver = Baseclass.driver;

	@Given("I have launched the application URL")
	public void i_have_launched_the_application_URL() {
		driver.get("https://www.simplilearn.com/");
	}

	@Given("I click on the Login link")
	public void i_click_on_the_Login_link() {
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		loginlink.click();
	}

	@When("I enter the username")
	public void i_enter_the_username() {
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("aijda");
	}

	@When("I enter the password")
	public void i_enter_the_password() {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("aiaasjda");
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		WebElement loginbtn = driver.findElement(By.name("btn_login"));
		loginbtn.click();
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
		WebElement errormesssage = driver.findElement(By.xpath("//div[@id=\"error_box\"]"));
		String actualmessage = errormesssage.getText();
		String expectedmessage = "The email or password you have entered is invalid.";
		Assert.assertEquals(actualmessage, expectedmessage);
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String Username) {
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys(Username);
	}

	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String Pass) {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(Pass);
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String error) {
		WebElement errorMessage = driver.findElement(By.xpath("//div[@id=\"error_box\"]"));
		String actualMessage = errorMessage.getText();
		String expectedMessage = "The email or password you have entered is invalid.";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@Then("I should see below login options on the screen")
	public void i_should_see_below_login_options_on_the_screen(List<String> Options) {

		for (String options : Options) {

			WebElement Loginoption = driver.findElement(By.xpath("//button[@data-clickedtype='" + options + "']"));
			Assert.assertTrue(Loginoption.isDisplayed());

		}

	}

}
