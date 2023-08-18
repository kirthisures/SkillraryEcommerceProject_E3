package Assignments;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Property_Assignement {
	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();//creating an object for properties class
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");//Creating an object for physical file
		p.load(fis);//loading fis
		String Url=p.getProperty("url");
		String brow=p.getProperty("browser");
		String username=p.getProperty("username");
		String pass=p.getProperty("password");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Url);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//option.addArguments("--disable-notifications");
	}
}
