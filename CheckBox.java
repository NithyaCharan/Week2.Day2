package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {

		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the browser
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("((//div[@class='example'])[1]/input)[1]")).click();
		
		driver.findElement(By.xpath("((//div[@class='example'])[1]/input)[3]")).click();
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='example'])[2]/input")).isSelected());
		
		if(driver.findElement(By.xpath("((//div[@class='example'])[3]/input)[1]")).isSelected())
		{
			driver.findElement(By.xpath("((//div[@class='example'])[3]/input)[1]")).click();
		}
		
		if(driver.findElement(By.xpath("((//div[@class='example'])[3]/input)[2]")).isSelected())
		{
			driver.findElement(By.xpath("((//div[@class='example'])[3]/input)[2]")).click();
		}

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[1]")).click();
		
		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[2]")).click();

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[3]")).click();

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[4]")).click();

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[5]")).click();

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[6]")).click();

		


	}

}
