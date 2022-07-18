package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {

		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the browser
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		WebElement position = driver.findElement(By.xpath("//button[text()='Get Position']"));
		
		System.out.println(position.getLocation());
		
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		System.out.println(driver.findElement(By.id("size")).getSize());

		
				
		
		

		
		


		
	}

}
