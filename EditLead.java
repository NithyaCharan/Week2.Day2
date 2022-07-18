package  week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		    
		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the browser
		driver.manage().window().maximize();	
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[14]")).sendKeys("Baskar");
	
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		String title = driver.getTitle();

		if(title.equals("View Lead | opentaps CRM"))
			
		{
			System.out.println("inside View Lead page");
		}
		
		//driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("((//div[@class='frameSectionExtra'])[2]/a)[3]")).click();

		driver.findElement(By.id("updateLeadForm_companyName")).clear();

		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		driver.close();

	}
	
}	