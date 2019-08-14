package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FunctionalLibrary {
	 public WebDriver driver;
  @BeforeMethod
  public void LoginApplication() {
	  System.setProperty("webdrver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace1\\HybridFramework\\driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  
	  
	    }
  @AfterMethod
  public void closeApplication() {
	  driver.quit();
  }
}
