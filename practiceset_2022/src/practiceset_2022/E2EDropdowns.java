//*******************************PERFECT********************************
package practiceset_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class E2EDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	
	//DYNAMIC DROPDOWN//*************************************
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(2000L);
			driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();  
	//Calendar current date
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	//Passengers dropdown
			driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click(); 
			Thread.sleep(3000L);
			for(int i=1;i<5;i++)
			{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click(); 
			}
			
			Thread.sleep(2000L);
			for(int j=0;j<2;j++)
			{
			driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
			}
			driver.findElement(By.xpath("//input[@value='Done']")).click();
	//STATIC DROPDOWN//**************************************
			WebElement staticDropdown=driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
			Select dropdown=new Select(staticDropdown);
			dropdown.selectByIndex(3); 
			Thread.sleep(2000L); 
	//Radio btn DROPDOWN//**************************************
			
			driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).click();
			Thread.sleep(2000L);
			driver.findElement(By.xpath("//input[@value='OneWay']")).click();

	//Checkbox Dropdown
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	//calendar enabled or disabled
			if(driver.findElement(By.xpath("//div[@id=\"Div1\"]")).getAttribute("style").contains("1"))
			{
			System.out.println("It's enabled");
			
			}
			else
			{
				System.out.println("It's Disabled");
			}
			
			
			
	//AUTO SUGGESTIVE DROPDOWN//****************************
			
			driver.findElement(By.id("autosuggest")).sendKeys("ind");

			Thread.sleep(3000);
			//List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
			List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			

			for(WebElement option :options)
			{
				if(option.getText().equalsIgnoreCase("India"))
				{
					option.click();
				break;
				} 	
			
		
	}
	//FINALLY....SEARCHING FOR FLIGHTS
			driver.findElement(By.cssSelector("input[name*='FindFlights']")).click();
	
			Thread.sleep(3000L);
			driver.close();
	}

}
