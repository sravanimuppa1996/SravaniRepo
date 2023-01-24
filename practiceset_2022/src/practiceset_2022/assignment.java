package practiceset_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Sravani");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("muppasravsms@gmail.com");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	WebElement StaticDropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
	Select dropdown=new Select(StaticDropdown);
	//dropdown.selectByIndex(2);
	dropdown.selectByVisibleText("Female");
	driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
	driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("19960606");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	String	text = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
	System.out.println("success text" +text);
		
	}
}

