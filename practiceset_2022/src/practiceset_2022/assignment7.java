package practiceset_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	List<WebElement> row=driver.findElements(By.xpath("//table[@name='courses']//tr"));
	//ROW SIZE
	int j=row.size();
	System.out.println("row size is : " + j);
	//COLUMN SIZE 
	List<WebElement> column=driver.findElements(By.xpath("//table[@class='table-display']//th"));
	int k=column.size();
	System.out.println("column size is : " +  k);
	//print second row
	List<WebElement> secondrowdata=driver.findElements(By.xpath("//table[@name='courses']//tr[3]"));
	int L=0;
	String s=secondrowdata.get(L).getText();
	System.out.println("Data in Second Row is : " + s);
	}
}

