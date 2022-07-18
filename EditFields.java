package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {

		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//populate the email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("XYz@abc.com");
		
		//append and tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Pressing the tab",Keys.TAB);
		
		//get the default value
		String defText = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		
		System.out.println(defText);
		
		//clear the filed
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

		//check if it is disabled
		System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[5]/input")).isEnabled());

	}

}
