package stepdefs;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CurrencyConverterPage;
import pages.HomePage;

public class StepDefinitions {

	public WebDriver driver = Hooks.driver;
	
	@Given("^I am on the home page on URL \"([^\"]*)\"$")
	public void i_am_on_the_home_page_on_URL(String arg1) throws Exception {
		driver.get(arg1);
		HomePage  homepage = new HomePage(driver);
		String actual = homepage.ValidateHomePage();
		Assert.assertEquals(actual, "true");
	}

	
		
	@Given("^Navigate to FX, travel & migrant and Click Currency Converter Btn$")
	public void navigate_to_FX_travel_migrant_and_Click_Currency_Converter_Btn() throws Exception {
		HomePage homepage = new HomePage(driver);
		homepage.click_FX(driver);
		homepage.click_CC(driver);
		CurrencyConverterPage  ccpage = new CurrencyConverterPage(driver);
		String actual = ccpage.ValidateCCPage();
		Assert.assertEquals(actual, "true");
	}
	
	

	@When("^Click Convert Btn$")
	public void click_Convert_Btn() throws Exception {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		ccpage.click_Convert_Btn(driver);
	}

	@Then("^Display error message and Teardown$")
	public void display_error_message() throws Exception {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		String actual = ccpage.ValidateErrorMsg();
		Assert.assertEquals(actual, "true");
	}

	@Given("^Select \"([^\"]*)\" from Convert from drop down$")
	public void select_from_Convert_from_drop_down(String arg1) throws Throwable {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		ccpage.selectConvertFromListBox(driver, arg1);
	}

	@When("^Enter (\\d+) in Amount field$")
	public void enter_in_Amount_field(String arg1) throws Throwable {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		ccpage.enterAmount(driver,arg1);
	}

	@When("^Select \"([^\"]*)\" from Convert to drop down$")
	public void select_from_Convert_to_drop_down(String arg1) throws Throwable {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		ccpage.selectConvertToListBox(driver, arg1);
	}

	@Given("^Check success message \"([^\"]*)\"$")
	public void check_success_message(String arg1) throws Exception {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		String actual = ccpage.ValidateSuccessMsg(arg1);
		Assert.assertEquals(actual, "true");

	}

	
	
	

	
}
