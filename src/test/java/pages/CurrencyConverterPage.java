package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import utils.Utils;
public class CurrencyConverterPage extends BasePage {
	
	
	// Constructors
		public CurrencyConverterPage(WebDriver driver) { super(driver); }
		public CurrencyConverterPage(WebDriver driver, String url) { super(driver); driver.get(url);}

	// Elements
		@FindBy(how = How.CSS, using = "#convert") private  WebElement btn_Convert;
		@FindBy(how = How.CSS, using = "#errordiv > ul > li") private WebElement txt_errMSG;
		@FindBy(how = How.CSS, using = "#Amount") private WebElement txtbx_Amount;
		@FindBy(id="westpac-iframe") private WebElement iframe_WP;
		@FindBy(id="ConvertFrom") private WebElement lstbx_ConvertFrom;
		@FindBy(id="ConvertTo") private WebElement lstbx_ConvertTo;
		@FindBy(xpath="//*[@id='resultsdiv']/em") private WebElement txt_sucMSG;
		
		
	// Methods
		// Clicks on Convert button 
		public void click_Convert_Btn(WebDriver driver) throws InterruptedException {
			Utils.waitForPageLoaded(driver);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(iframe_WP);
			btn_Convert.click();
		}
		// Grabs error message
		public String get_Message(WebDriver driver) throws InterruptedException {
			return txt_errMSG.getText();
		}
		// Selects item from 'ConvertFrom' List box
		public void selectConvertFromListBox(WebDriver driver, String str){
			driver.switchTo().defaultContent();
			driver.switchTo().frame(iframe_WP);
			try{
			    WebDriverWait wait = new WebDriverWait(driver, 20);
			    wait.until((ExpectedCondition<Boolean>) new ExpectedCondition<Boolean>(){
			        public Boolean apply(WebDriver driver)  
			        {
			            Select select = new Select(lstbx_ConvertFrom);
			            return select.getOptions().size()>1;
			        }
			    });
			    Select select = new Select(lstbx_ConvertFrom);
			    select.selectByVisibleText(str);
			}catch(Throwable e){
			    System.out.println("Error found for ["+str+"] : "+e.getMessage());
			}
		}
		
		// Selects item from 'ConvertTO' List box
		public void selectConvertToListBox(WebDriver driver, String str){
			driver.switchTo().defaultContent();
			driver.switchTo().frame(iframe_WP);
			try{
			    WebDriverWait wait = new WebDriverWait(driver, 20);
			    wait.until((ExpectedCondition<Boolean>) new ExpectedCondition<Boolean>(){
			        public Boolean apply(WebDriver driver)  
			        {
			            Select select = new Select(lstbx_ConvertTo);
			            return select.getOptions().size()>1;
			        }
			    });
			    Select select = new Select(lstbx_ConvertTo);
			    select.selectByVisibleText(str);
			}catch(Throwable e){
				System.out.println("Error found for ["+str+"] : "+e.getMessage());
			}
			
		}
		// Enter value in Amount Text field
		public void enterAmount(WebDriver driver,String str){
			driver.switchTo().defaultContent();
			driver.switchTo().frame(iframe_WP);
			txtbx_Amount.clear();
			txtbx_Amount.sendKeys(str);
			
		}
		// Switches frame from default to Westpac frame under the form
		public void SwitchtoWPFrame(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(btn_Convert));
			driver.switchTo().defaultContent();
			driver.switchTo().frame(iframe_WP);
		}
		// Grabs success message
		public Boolean get_suc_Message(WebDriver driver) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(iframe_WP);
			return txt_sucMSG.isDisplayed();
		}
		
		// Validates CC Page title
				public String ValidateCCPage() {
					driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
					driver.switchTo().defaultContent();
					driver.switchTo().frame(iframe_WP);
					WebDriverWait wait = new WebDriverWait(driver, 40);
					wait.until(ExpectedConditions.elementToBeClickable(btn_Convert));
					if (driver.getTitle().contains("Currency converter")) {
						Reporter.log("PASS :: Currency Converter Page Title Validated !");
						return "true"; 	
					} else {
						Reporter.log("FAIL :: Currency Converter Page Title Failed to Validate !");
						return "false"; 
					}
				}
	
				// Validates Error Message
				public String ValidateErrorMsg() {
					driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
					driver.switchTo().defaultContent();
					driver.switchTo().frame(iframe_WP);
					WebDriverWait wait = new WebDriverWait(driver, 40);
					wait.until(ExpectedConditions.elementToBeClickable(txt_errMSG));
					if (txt_errMSG.isDisplayed()) {
						Reporter.log("PASS :: Error Message [Please enter the amount you want to convert.] Displayed !");
						return "true"; 	
					} else {
						Reporter.log("FAIL :: Error Message Failed to Display !");
						return "false"; 
					}
				}
				// Validates Success Message
				public String ValidateSuccessMsg(String str) {
					driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
					driver.switchTo().defaultContent();
					driver.switchTo().frame(iframe_WP);
					WebDriverWait wait = new WebDriverWait(driver, 40);
					wait.until(ExpectedConditions.elementToBeClickable(txt_sucMSG));
					if (txt_sucMSG.isDisplayed()) {
						Reporter.log("PASS :: ["+str+"] !");
						return "true"; 	
					} else {
						Reporter.log("FAIL :: ["+str+"] !");
						return "false"; 
					}
					
				}
				
}
