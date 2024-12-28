package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAssignmemt {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		Thread.sleep(2000);
		WebElement firstNameTF = driver.findElement(By.name("FirstName"));
		firstNameTF.sendKeys("Harshita");
		Thread.sleep(2000);
		WebElement lastNameTF = driver.findElement(By.name("LastName"));
		lastNameTF.sendKeys("Jindal");
		Thread.sleep(2000);
		WebElement emailTF = driver.findElement(By.name("Email"));
		emailTF.sendKeys("harshi.att@gmail.com");
		Thread.sleep(2000);
		WebElement passwordTF = driver.findElement(By.name("Password"));
		passwordTF.sendKeys("Abcd@0001");
		Thread.sleep(2000);
		WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword"));
		confirmPassword.sendKeys("Abcd@0001");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("register-button"));
		button.click();
		}
}
