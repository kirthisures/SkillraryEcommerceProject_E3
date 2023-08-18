package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Skillrary_multiple_Dropdown {
	public static void main(String[] args)throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select s= new Select(dropdown);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("199");
		Thread.sleep(3000);
		//s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		s.deselectByIndex(1);
		Thread.sleep(3000);
		s.deselectByValue("199");
		Thread.sleep(3000);
		//s.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		List<WebElement> values=s.getAllSelectedOptions();
		for(WebElement b:values)
		{
			System.out.println(b.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
