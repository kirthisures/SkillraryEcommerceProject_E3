package Basic_Programs;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_launching 
{

	public static void main(String[] args) 
	{
		//Manages Chrome Driver
		WebDriverManager.chromedriver().setup();
		//Manages 
		ChromeDriver driver=new ChromeDriver();

	}

}
