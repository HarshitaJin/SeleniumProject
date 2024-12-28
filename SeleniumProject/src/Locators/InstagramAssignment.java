package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("amansingh@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("qwerty123");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}
