package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class lifestyle {
  @Test
  public void lifestyleTest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening lifestyle", true);
	  driver.get("https://www.lifestylestores.com/in/en/");
	  Thread.sleep(2000);
	  driver.close();
  }
}
