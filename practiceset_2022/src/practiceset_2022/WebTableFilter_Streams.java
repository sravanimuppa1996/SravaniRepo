package practiceset_2022;

import java.time.Duration;
import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebTableFilter_Streams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Strawberry");
	List<WebElement> outputname=driver.findElements(By.xpath("//tr/td[1]"));
	List<String> actualname=outputname.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(actualname);

	
	List<String> expectedname=actualname.stream().filter(s->s.contains("Strawberry")).collect(Collectors.toList());
	System.out.println(expectedname);
	Assert.assertEquals(actualname, expectedname);
	
	
	
	
	}
	


}
