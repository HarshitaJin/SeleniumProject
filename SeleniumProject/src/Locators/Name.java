package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement ETF = driver.findElement(By.name("username"));
		ETF.sendKeys("harshu.att@gmail.com");

		WebElement PTF = driver.findElement(By.name("password"));
		PTF.sendKeys("harshiiiii");
		Thread.sleep(2000);
		WebElement Loginbutton = driver.findElement(By.className("_acap"));
        Loginbutton.click();
	}

}
