package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://delhimetrorail.com/");
		//click on cross button
		WebElement crossButton = driver.findElement(By.id("buttonDismiss1"));
		crossButton.click();
		
		//click on from dropdown
		WebElement from = driver.findElement(By.id("FromStation"));
		from.click();
		
		WebElement line1 = driver.findElement(By.xpath("//div[text()='RITHALA']"));
		line1.click();
		
		WebElement mh = driver.findElement(By.xpath("//font[text()='MOHAN NAGAR']"));
		mh.click();
		WebElement to = driver.findElement(By.id("ToStation"));
		to.click();
		WebElement ne = driver.findElement(By.xpath("//div[text()='NOIDA ELECTRONIC CITY']"));
		ne.click();
		WebElement dw = driver.findElement(By.xpath("//font[text()='DWARKA SECTOR - 9']"));
		dw.click();
		
		WebElement sButton = driver.findElement(By.xpath("//button[text()='Show Route & Fare']"));
		sButton.click();
	}

}
