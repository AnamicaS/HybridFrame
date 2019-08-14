package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import  utility.FunctionalLibrary;

public class LoginPage extends FunctionalLibrary {
  @Test
  public void Login() {
	  WebElement username=driver.findElement(By.xpath("//*[@name='email']"));
	  username.sendKeys("Anams");
	  WebElement password=driver.findElement(By.xpath("//*[@name='pass']"));
	  password.sendKeys("1234");
	  WebElement login=driver.findElement(By.id("Log In"));
	  login.click();
  }
}
