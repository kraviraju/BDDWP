package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import utils.Utils;
public class HomePage extends BasePage {
	
	
	// Constructors
		public HomePage(WebDriver driver) { super(driver); }
		public HomePage(WebDriver driver, String url) { super(driver); driver.get(url);	}
	
	// Elements
		@FindBy(how = How.CSS, using = "#ubermenu-section-link-fx-travel-and-migrant-ps") private WebElement link_FX;
		@FindBy(how = How.CSS, using = "#ubermenu-item-cta-currency-converter-ps") private WebElement Btn_CC;
	
	// Methods
		// Clicks FX Link from Menu
		public void click_FX(WebDriver driver) throws InterruptedException {
			Utils.waitForPageLoaded(driver);
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(link_FX));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			link_FX.click();
		}
		
		// Once Menu opens clicks on Currency Converter button
		public void click_CC(WebDriver driver) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Btn_CC.click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		// Validates Home Page title
		public String ValidateHomePage() {
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(link_FX));
			if (driver.getTitle().contains("Westpac New Zealand")) {
				Reporter.log("PASS :: Home Page Title Validated !");
				return "true"; 	
			} else {
				Reporter.log("FAIL :: Home Page Title Failed to Validate !");
				return "false"; 
			}
		}
		
}
