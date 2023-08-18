package WebElements;

import java.awt.Dimension;
import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_Type {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		org.openqa.selenium.Point coOrdinates= email.getLocation();
		System.out.println("X and Y coordinates of email testfield are below:");
		System.out.println(coOrdinates.getX());
		System.out.println(coOrdinates.getY());
		org.openqa.selenium.Dimension size=email.getSize();
		System.out.println("Width and Height of email textfield are below");
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		

	}

}
