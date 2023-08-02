package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ebay {
  @Test
  public void ebayTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ebay.in");
	  Reporter.log("opening ebay", true);
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
