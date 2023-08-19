package eCommerceProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MeeShow {
  @Test
  public void meeShowTest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.meeshow.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Reporter.log("opening meeshow", true);
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  driver.close();
	  
  }
}
