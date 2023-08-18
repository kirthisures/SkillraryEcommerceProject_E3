package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Getting {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println("Attribute :"+mobile.getAttribute("class"));
		System.out.println("Attribute :"+mobile.getTagName());
		org.openqa.selenium.Point coOrdinates= mobile.getLocation();
		System.out.println("X and Y coordinates of email testfield are below:");
		System.out.println(coOrdinates.getX());
		System.out.println(coOrdinates.getY());
		org.openqa.selenium.Dimension size=mobile.getSize();
		System.out.println("Width and Height of email textfield are below");
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		
		
		
		
		

	}

}
