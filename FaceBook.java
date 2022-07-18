package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FaceBook {

	public static void main(String[] args) {

		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//maximize the browser
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//a[contains(text(),\"Create New Account\")]")).click();
		
		String title = driver.getTitle();

		if(title.equals("Facebook – log in or sign up"))
			
		{
			System.out.println("inside sign up page");
		}

		//populate first name and last name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("XYZ");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ABC");
		
		//enter the phone number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8544123667");
		
		//enter the password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("likend!");

		//enter the DOB
		WebElement dropDown1 = driver.findElement(By.id("day"));

		Select select1 = new Select(dropDown1);
		
		select1.selectByVisibleText("22");

		WebElement dropDown2 = driver.findElement(By.id("month"));

		Select select2 = new Select(dropDown2);
		
		select2.selectByVisibleText("May");
		
		WebElement dropDown3 = driver.findElement(By.id("year"));

		Select select3 = new Select(dropDown3);
		
		select3.selectByVisibleText("1995");

		//choose gender as female
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}
}