package Autosuggestions;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Google {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phon");
		List<WebElement> list = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(6000);
		for(WebElement b:list)
		{
			System.out.println(b.getText());
		}
		Thread.sleep(6000);
		driver.close();	
	}

}
