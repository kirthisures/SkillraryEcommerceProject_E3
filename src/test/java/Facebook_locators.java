import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_locators {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.tagName("a"));
		WebElement createpage=driver.findElement(By.xpath("//div[@class='_203y']"));
		driver.findElement(By.tagName("div"));
		org.openqa.selenium.Point coordinates=createpage.getLocation();
		System.out.println("X and Y coordinates of createpage testfield are below:");
		System.out.println(coordinates.getX());
		System.out.println(coordinates.getY());
		org.openqa.selenium.Dimension size=createpage.getSize();
		System.out.println("Width and Height of createpage textfield are below");
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		Thread.sleep(3000);
		driver.close();	

	}

}
