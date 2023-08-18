package TestNg_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser_Amazon {
	@Parameters({"browsername"})
	@Test
	public void amazon(String browser) {
		WebDriver driver;
		if (browser.equals("chrome"))
		{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();	
		}
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.close();
	}
}
