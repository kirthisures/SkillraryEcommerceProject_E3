package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Locator {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("Kirthiga");
		//driver.findElement(By.name("pass")).sendKeys("Kirthi@0528");
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(5000);
		//driver.findElement(By.name("email")).sendKeys("kirthi0590@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("Kirthi@0528");
		//driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		//driver.close();
		

	}

}




