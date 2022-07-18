package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {

		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the browser
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		driver.get("http://leafground.com/pages/Image.html");

		driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
		
		String title = driver.getTitle();
		
		if(title.equals("TestLeaf - Interact with Images"))
		{
			System.out.println("the page is broken");
		}
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();

	}

}
