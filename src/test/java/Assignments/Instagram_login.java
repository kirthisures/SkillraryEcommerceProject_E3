package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram_login {
public static void main(String[] args) throws Throwable{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kirthi0590@gmail.com");
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Kirthi@0528");
	driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
	Thread.sleep(3000);
	driver.close();
	}

}
