package practiceset_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muppa\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	List<WebElement> column=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
	int sum=0;
	for(int i=0;i<column.size();i++)
	{
		sum=sum+Integer.parseInt(column.get(i).getText());
	}
		System.out.println(sum);
		
		String Total=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		 String[] FormattedTotal=Total.split(":");
		 String FT=FormattedTotal[1].trim();
		 int Final=Integer.parseInt(FT);
		 System.out.println("final amount" + Final);
		 if(Final==sum)
		 {
			 System.out.println("Expected and actual results are same" + "Sum amount is:" + sum + "Final amount is" + Final);
		 }
		 else
		 {
			 System.out.println("you stupid, go and check your code");
		 }
		 
		/* for(int i=0;i<4;i++)
			{
				sum=sum+Integer.parseInt(column.get(i).getText());
			}
				System.out.println(sum);
		*/
		Assert.assertEquals(Final, sum);
	}

	
}

