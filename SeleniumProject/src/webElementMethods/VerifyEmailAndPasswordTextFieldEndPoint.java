package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEmailAndPasswordTextFieldEndPoint {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement emailtextField = driver.findElement(By.id("email"));
		Rectangle rectangle = emailtextField.getRect();
		int emailTFWidth=rectangle.getWidth();
		System.out.println("width is"+emailTFWidth);
		int emailXAxis=rectangle.getX();
		System.out.println("X Axis is"+emailXAxis);
		int endpoint1=emailTFWidth+emailXAxis;
		System.out.println(endpoint1);
		WebElement PasswordtextField = driver.findElement(By.id("passContainer"));
		Rectangle Rectangle = PasswordtextField.getRect();
		int PasswordTFWidth=Rectangle.getWidth();
		System.out.println("width is"+PasswordTFWidth);
		int PasswordXAxis=Rectangle.getX();
		System.out.println("X Axis is"+PasswordXAxis);
		int endpoint2=PasswordTFWidth+PasswordXAxis;
		System.out.println(endpoint2);
		if(endpoint1==endpoint2) {
			System.out.println("Same End Points");
		}
		else {
			System.out.println("different end points");
		}
		
	}

}
