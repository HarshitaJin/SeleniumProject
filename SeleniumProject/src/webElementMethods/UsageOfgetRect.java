package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetRect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement emailtextField = driver.findElement(By.id("email"));
		Rectangle rectangle = emailtextField.getRect();
		int emailTFHeight=rectangle.getHeight();
		int emailTFWidth=rectangle.getWidth();
		int emailXAxis=rectangle.getX();
		int emailYAxis=rectangle.getY();
		System.out.println("height is"+emailTFHeight);
		System.out.println("width is"+emailTFWidth);
		System.out.println("X Axis is"+emailXAxis);
		System.out.println("Y Axis is"+emailYAxis);
		
	

	}

}
