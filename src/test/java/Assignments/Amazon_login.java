package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_login {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		email.sendKeys("Phone");
		Thread.sleep(3000);
		email.clear();
		//driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("Kirthiga");
		//driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Kirthi@0528");
		//driver.findElement(By.xpath("////a[contains(text(),'Forgot password?')]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
