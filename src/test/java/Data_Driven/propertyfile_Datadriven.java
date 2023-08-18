package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertyfile_Datadriven {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();//creating an object for properties class
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");//Creating an object for physical file
		p.load(fis);//loading fileinputstream
		String Url=p.getProperty("url");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Url);
		
	}

}
