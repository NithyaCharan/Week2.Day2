package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
		
		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the browser
		driver.manage().window().maximize();	
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		String link = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
		
		System.out.println(link);
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		
		String broken = driver.getTitle();
		
		if(broken.equals("404 Not Found"))
		
				{
					System.out.println("Page broken");
		
				}
		else
		
		{
			System.out.println("Page not broken");
			
		}
		
		driver.get("http://leafground.com/pages/Link.html");

		

	}

}
