package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		//linktext
		driver.findElement(By.linkText("Register")).click();
		
		//identify the web element by tagname
       driver.findElement(By.tagName("input")).sendKeys("books");
       
	}

}
