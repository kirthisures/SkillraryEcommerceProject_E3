package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Type {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Kirthiga");
		Thread.sleep(5000);
		email.clear();
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.submit();
		

	}

}
