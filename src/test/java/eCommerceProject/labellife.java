package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class labellife {
  @Test
  public void labellifeTest () throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	   Reporter.log("opening labellife", true);
	   driver.get("https://www.thelabellife.com/");
	   Thread.sleep(2000);
	   driver.close();
	  
  }
}
