package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the browser
		driver.manage().window().maximize();	
		
		//select dropdown using index
		WebElement usingIndex = driver.findElement(By.id("dropdown1"));

		Select select1 = new Select(usingIndex);
		
		select1.selectByIndex(1);
		
		//select dropdown using text
		WebElement usingText = driver.findElement(By.name("dropdown2"));
		
		Select select2 = new Select(usingText);
		
		select2.selectByVisibleText("Selenium");
		
		//select dropdown using value
		WebElement usingValue = driver.findElement(By.id("dropdown3"));

		Select select3 = new Select(usingValue);
		
		select3.selectByValue("1");
		
		//select dropdown using dropdown options
		WebElement number = driver.findElement(By.className("dropdown"));

		Select select4 = new Select(number);
		
		select4.selectByValue("4");
		
		//select dropdown using sendkeys
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("Se",Keys.TAB);
		
		//select dropdown using choose
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]/option[2]")).click();

	}

}
