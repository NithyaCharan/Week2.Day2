package week2.day2;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) {

		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//find the number of rows
		WebElement TogetRows = driver.findElement(By.xpath("//div[@id='contentblock']/section/div/table/tbody"));
		
		java.util.List<WebElement> TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
		
		//find the number of columns
		WebElement TogetCols = driver.findElement(By.xpath("//div[@id='contentblock']/section/div/table/tbody/tr"));
		
		java.util.List<WebElement> TotalColsList = TogetCols.findElements(By.tagName("th"));
		
		System.out.println("Total number of Colums in the table are : "+ TotalColsList.size());
		
		//get the progress percentage
		WebElement progress = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/font[1]"));	
		
		String name = progress.getText();
		
		System.out.println(name);
		
		//check the least value box
		driver.findElement(By.xpath("//font[text()[normalize-space()='Handle Exceptions']]/following::input[1]")).click();
		
	}

}
