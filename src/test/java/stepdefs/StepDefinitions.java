package stepdefs;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CurrencyConverterPage;
import pages.HomePage;

public class StepDefinitions {

	public WebDriver driver = Hooks.driver;

	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Exception {
		HomePage  homepage = new HomePage(driver);
		Boolean actual = homepage.ValidateHomePage();
		Assert.assertTrue(actual);
	}

	
		
	@Given("^Navigate to FX, travel & migrant and Click Currency Converter Btn$")
	public void navigate_to_FX_travel_migrant_and_Click_Currency_Converter_Btn() throws Exception {
		HomePage homepage = new HomePage(driver);
		//homepage.ClickFX_GoTOCurrencyConverter();  // Use this if Mouse Hover fails
		homepage.MouseHoverFX_GoTOCurrencyConverter(); 
		CurrencyConverterPage  ccpage = new CurrencyConverterPage(driver);
		Boolean actual = ccpage.ValidateCCPage();
		Assert.assertTrue(actual);
	}
	
	

	@When("^Click Convert Btn$")
	public void click_Convert_Btn() throws Exception {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		ccpage.click_Convert_Btn(driver);
	}

	@Then("^Display error message and Teardown$")
	public void display_error_message() throws Exception {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		Boolean actual = ccpage.ValidateErrorMsg();
		Assert.assertTrue(actual);
	}
	
	
	@Then("^User is able convert (\\d+) NZD to USD  and Check success message$")
	public void user_is_able_convert_NZD_to_USD_and_Check_success_message(String Amount) throws Exception {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		ccpage.selectConvertFromListBox(driver, "New Zealand Dollar");
		ccpage.enterAmount(driver,Amount);
		ccpage.selectConvertToListBox(driver, "United States Dollar");
		ccpage.click_Convert_Btn(driver);
		Boolean actual = ccpage.ValidateSuccessMsg("User is able convert 1 NZD to USD successfully");
		Assert.assertTrue(actual);
	}
	
	
	@Then("^User is able convert (\\d+) USD to NZD  and Check success message$")
	public void user_is_able_convert_USD_to_NZD_and_Check_success_message(String Amount) throws Exception {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		ccpage.selectConvertFromListBox(driver, "United States Dollar");
		ccpage.enterAmount(driver,Amount);
		ccpage.selectConvertToListBox(driver, "New Zealand Dollar");
		ccpage.click_Convert_Btn(driver);
		Boolean actual = ccpage.ValidateSuccessMsg("User is able convert 1 USD to NZD successfully");
		Assert.assertTrue(actual);
	}
	
	
	@Then("^User is able convert (\\d+) Pound Sterling  to NZD  and Check success message$")
	public void user_is_able_convert_Pound_Sterling_to_NZD_and_Check_success_message(String Amount) throws Exception {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		ccpage.selectConvertFromListBox(driver, "Pound Sterling");
		ccpage.enterAmount(driver,Amount);
		ccpage.selectConvertToListBox(driver, "New Zealand Dollar");
		ccpage.click_Convert_Btn(driver);
		Boolean actual = ccpage.ValidateSuccessMsg("User is able convert 1 Pound Sterling to NZD successfully");
		Assert.assertTrue(actual);
	}
	
	@Then("^User is able convert (\\d+) Swiss Franc to Euro and Check success message$")
	public void user_is_able_convert_Swiss_Franc_to_Euro_and_Check_success_message(String Amount) throws Exception {
		CurrencyConverterPage ccpage = new CurrencyConverterPage(driver);
		ccpage.selectConvertFromListBox(driver, "Swiss Franc");
		ccpage.enterAmount(driver,Amount);
		ccpage.selectConvertToListBox(driver, "Euro");
		ccpage.click_Convert_Btn(driver);
		Boolean actual = ccpage.ValidateSuccessMsg("User is able convert 1 Swiss Franc to Euro successfully");
		Assert.assertTrue(actual);
	}
	
	
}
