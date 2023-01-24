package practiceset_2022;

import java.time.Duration;
import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebTableSorting_Streams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//tr/th[1]")).click();
	List<WebElement> Elementslist=driver.findElements(By.xpath("//tr/td[1]"));
	List<String> originallist=Elementslist.stream().map(s->s.getText()).collect(Collectors.toList());
	List<String> Expectedlist=originallist.stream().sorted().collect(Collectors.toList());
	Assert.assertEquals(originallist, Expectedlist);
	
	
	
	
	} 
}

