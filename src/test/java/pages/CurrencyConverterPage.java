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
import org.junit.Assert;

import utils.Utils;
public class CurrencyConverterPage extends BasePage {
	
	WebDriverWait wait = new WebDriverWait(driver, 40);
	
	// Constructors
		public CurrencyConverterPage(WebDriver driver) { super(driver); }
		public CurrencyConverterPage(WebDriver driver, String url) { super(driver); driver.get(url);}

	// Elements
		@FindBy(how = How.CSS, using = "#convert") private  WebElement btn_Convert;
		@FindBy(how = How.CSS, using = "#errordiv > ul > li") private WebElement obj_errorMessage;
		@FindBy(how = How.CSS, using = "#Amount") private WebElement txtbox_Amount;
		@FindBy(id="westpac-iframe") private WebElement iframe_WestPac;
		@FindBy(id="ConvertFrom") private WebElement lstbx_ConvertFrom;
		@FindBy(id="ConvertTo") private WebElement lstbx_ConvertTo;
		@FindBy(xpath="//*[@id='resultsdiv']/em") private WebElement obj_successMessage;
		
		
	// Methods
		// Clicks on Convert button 
		public void click_Convert_Btn(WebDriver driver) throws InterruptedException {
			try
			{
				Utils.waitForPageLoaded(driver);
				driver.switchTo().defaultContent();
				driver.switchTo().frame(iframe_WestPac);
				btn_Convert.click();
			}catch(Exception e){  }
		}
		// Grabs error message
		public String get_Message(WebDriver driver) throws InterruptedException {
			String msg="";
			try
			{
				msg= obj_errorMessage.getText();
			}catch(Exception e){  }
			return msg;
		}
		// Selects item from 'ConvertFrom' List box
		public void selectConvertFromListBox(WebDriver driver, String str){
			driver.switchTo().defaultContent();
			driver.switchTo().frame(iframe_WestPac);
			try{
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
			driver.switchTo().frame(iframe_WestPac);
			try{
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
				
			}
			
		}
		// Enter value in Amount Text field
		public void enterAmount(WebDriver driver,String str){
			try
			{
				driver.switchTo().defaultContent();
				driver.switchTo().frame(iframe_WestPac);
				txtbox_Amount.clear();
				txtbox_Amount.sendKeys(str);
			}catch(Exception e){  }
			
		}
		// Switches frame from default to Westpac frame under the form
		public void SwitchtoWPFrame(WebDriver driver){
			try
			{
				wait.until(ExpectedConditions.elementToBeClickable(btn_Convert));
				driver.switchTo().defaultContent();
				driver.switchTo().frame(iframe_WestPac);
			}catch(Exception e){  }
		}
		// Grabs success message
		public Boolean get_suc_Message(WebDriver driver) throws InterruptedException {
			Boolean result=false;
			try
			{
				driver.switchTo().defaultContent();
				driver.switchTo().frame(iframe_WestPac);
				result= obj_successMessage.isDisplayed();
			}catch(Exception e){  }
			return result;
		}
		
		// Validates CC Page title
				public Boolean ValidateCCPage() {
					Boolean result=false;
					try
					{
						driver.switchTo().defaultContent();
						driver.switchTo().frame(iframe_WestPac);
						wait.until(ExpectedConditions.elementToBeClickable(btn_Convert));
						if (driver.getTitle().contains("Currency converter")) {
							result=true; 	
						} else {
							result=false; 	
						}
						
					}catch(Exception e){  }
					return result;
				}
	
				// Validates Error Message
				public Boolean ValidateErrorMsg() {
					Boolean result=false;
					try
					{
						wait.until(ExpectedConditions.elementToBeClickable(obj_errorMessage));
						driver.switchTo().defaultContent();
						driver.switchTo().frame(iframe_WestPac);
							if (obj_errorMessage.isDisplayed()) {
							result=true; 	
						} else {
							result=false; 	
						}
						
					}catch(Exception e){  }
					return result;
				}
				// Validates Success Message
				public Boolean ValidateSuccessMsg(String str) {
					Boolean result=false;
					try
					{
						wait.until(ExpectedConditions.elementToBeClickable(obj_successMessage));
						driver.switchTo().defaultContent();
						driver.switchTo().frame(iframe_WestPac);
						if (obj_successMessage.isDisplayed()) {
							result=true; 	
						} else {
							result=false; 	
						}
						
					}catch(Exception e){  }
					return result;
				
				}
				
}
