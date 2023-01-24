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

public class assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
	String text=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
	System.out.println(text);
	
	WebElement staticDropdown=driver.findElement(By.id("dropdown-class-example"));
	Select dropdown=new Select(staticDropdown);

	dropdown.selectByVisibleText(text);
	
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.id("alertbtn")).click();
	System.out.println(driver.switchTo().alert().getText()); 
	String outcome=driver.switchTo().alert().getText();
	if(outcome.contains(text))
	{
		System.out.println("Yes, the text grabbed from step2 is present in popup message");
	}
	else
	{
		System.out.println("No, the text grabbed from step2 is not present in popup message");
	}
	driver.switchTo().alert().accept();

	}
}