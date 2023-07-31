package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ebay {
  @Test
  public void ebayTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening ebay",true);
	  driver.get("");
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
