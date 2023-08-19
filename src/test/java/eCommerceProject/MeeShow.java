package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MeeShow {
  @Test
  public void meeShowTest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.meeshow.com");
	  Reporter.log("opening meeshow", true);
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  driver.close();
	  
  }
}
