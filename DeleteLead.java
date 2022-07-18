package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']//span)[2]")).click();

		driver.findElement(By.xpath("(//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder'])[14]/input")).sendKeys("8501886925");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String leadID = "";
		
		Thread.sleep(5000);
		
		leadID = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a)[1]")).getText();
			
		System.out.println(leadID);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[13]")).sendKeys(leadID);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String verify = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		System.out.println(verify);
		
		driver.close();
		
	}

}
