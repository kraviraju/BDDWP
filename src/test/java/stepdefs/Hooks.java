package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Property;

public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void setup() {
		
		Property property = new Property();
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver_win32.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get(Property.getPropery("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		

		
	}
	
	@After
	public void tearDown() {
		driver.close();		
	}
}
