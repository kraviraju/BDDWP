package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import utils.Utils;
public class HomePage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, 40);
	
	// Constructors
		public HomePage(WebDriver driver) { super(driver); wait.until(ExpectedConditions.elementToBeClickable(link_FXTravel_Migran)); }
		public HomePage(WebDriver driver,String url) { super(driver); driver.get(url);	}
	
	// Elements
		@FindBy(how = How.CSS, using = "#ubermenu-section-link-fx-travel-and-migrant-ps") private WebElement link_FXTravel_Migran;
		@FindBy(how = How.CSS, using = "#ubermenu-item-cta-currency-converter-ps") private WebElement Btn_CurrencyConverter;
	
	// Methods
		
		// Mouse Hover on FX - Some times it works or may not
				public void MouseHoverFX_GoTOCurrencyConverter(){
					Utils.waitForPageLoaded(driver);
					wait.until(ExpectedConditions.elementToBeClickable(link_FXTravel_Migran));
					Actions action = new Actions(driver);
					action.moveToElement(link_FXTravel_Migran).build().perform();
					Btn_CurrencyConverter.click();
				}
				
				
				// Click on FX - Some times it works or may not
				public void ClickFX_GoTOCurrencyConverter(){
					Utils.waitForPageLoaded(driver);
					wait.until(ExpectedConditions.elementToBeClickable(link_FXTravel_Migran));
					link_FXTravel_Migran.click();
					Btn_CurrencyConverter.click();
				}
		
		
		
		// Validates Home Page title
		public Boolean ValidateHomePage() {
			Boolean result=false;
			try
			{
				wait.until(ExpectedConditions.elementToBeClickable(link_FXTravel_Migran));
					if (driver.getTitle().contains("Westpac New Zealand")) {
						result=true; 	
					} else {
						result=false; 
					}
			}catch(Exception e){  }
			return result;
		}
		
		
		
}
