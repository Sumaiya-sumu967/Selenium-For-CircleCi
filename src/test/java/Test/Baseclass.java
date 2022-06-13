package Test;
//import java.io.file;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Baseclass {

	public WebDriver driver;
	
@BeforeClass
public void setup() {
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.tripadvisor.com/");
}

@AfterClass
public void teardown() {
	driver.quit();
}
}