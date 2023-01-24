package practiceset_2022;

import java.time.Duration;
import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("password")).sendKeys("learning");
	driver.findElement(By.xpath("//span[text()=' User']")).click();
	
	WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(7000));
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']"))).click();
	
	//driver.findElement(By.xpath("//option[text()='Consultant']"));
	
	WebElement staticDropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
	Select dropdown=new Select(staticDropdown);
	dropdown.selectByVisibleText("Consultant");
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("signInBtn")).click();
	WebDriverWait x=new WebDriverWait(driver, Duration.ofMillis(7000));
	
	x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='card-title']")));
	List<WebElement> items=driver.findElements(By.xpath("//h4[@class='card-title']"));
	
	for(int i=0;i<items.size();i++)
	{
	System.out.println(items.get(i).getText());
	driver.findElements(By.xpath("//button[text()='Add ']")).get(i).click();
	}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.xpath("//label[@for='checkbox2']")).click(); 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000L);
		driver.close();
	}
}
