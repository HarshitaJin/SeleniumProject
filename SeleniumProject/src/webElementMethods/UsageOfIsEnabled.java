package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/home/cowin_signup_form");
		WebElement SubmitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		boolean bool =SubmitButton.isEnabled();
		if(bool) {
			SubmitButton.click();
		}
		else {
			driver.findElement(By.xpath("//button[text()='Accept Terms of Service']")).click();
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//button[text()='Close']")).click();
			SubmitButton.click();
			
		}
		

	}

}
