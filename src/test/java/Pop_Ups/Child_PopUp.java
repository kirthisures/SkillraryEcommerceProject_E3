package Pop_Ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_PopUp {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://skillrary.com/"); 
		//handling parent window
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		//Handling child window
		Set<String> child=driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		//Address of element in child window
		driver.findElement(By.id("mytext")).sendKeys("Kirthiga");
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
