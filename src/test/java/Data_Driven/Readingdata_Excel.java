package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Readingdata_Excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\TestData1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		String title=driver.getTitle();
		wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TestData1.xlsx");
		wb.write(fos);
		

	}

}
