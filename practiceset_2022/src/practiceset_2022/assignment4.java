package practiceset_2022;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.browser.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
	driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	Set<String> windows=driver.getWindowHandles();
	Iterator<String> it= windows.iterator();
	String parentId=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText()); 
	driver.switchTo().window(parentId);
	System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());

	}
}