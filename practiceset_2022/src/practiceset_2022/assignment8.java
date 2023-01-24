package practiceset_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("can");
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"));

	}
}

