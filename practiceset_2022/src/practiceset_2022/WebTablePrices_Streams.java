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

public class WebTablePrices_Streams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//tr/th[1]")).click();	
	
	List<WebElement> Elementslist=driver.findElements(By.xpath("//tr/td[1]"));
	
	List<String> originalList=Elementslist.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println("a:" + originalList);
	
	List<String> price;
	
	List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
	price=rows.stream().filter(s -> s.getText().contains("Beans")).map(s -> PriceofVeggie(s)).collect(Collectors.toList());
	System.out.println("b:" + price);
	
	//price.forEach(a->System.out.println(a));
	
		
	//List<String> list=Elementslist.stream().filter(s->s.getText().contains("Beans")).map(s->PriceofVeggie(s)).collect(Collectors.toList());
	
	}

	private static String PriceofVeggie(WebElement s)
	{
		String finaloutput=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		System.out.println("c:" + finaloutput);
		return finaloutput;
		
		
	}
	


}
