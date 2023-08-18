package POM_Usage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Fb_Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_Login {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//creating an object for POM class
		Fb_Loginpage fbLogin=new Fb_Loginpage(driver);
		fbLogin.emailTextField("Kirthi0590@gmail.com");
		fbLogin.passwordTextField("Kirthi@0528");
		fbLogin.LoginButton();

	}

}
