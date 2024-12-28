package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetCSSProperty {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		//use of getCssValue()
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("font-size"));
		System.out.println(logo.getCssValue("margin"));
		
		//use of getAttribute()
		System.out.println(logo.getAttribute("src"));
		System.out.println(logo.getAttribute("alt"));
		
		//use of getTagName()
		System.out.println(logo.getTagName());
		
		//use of getSize()
		System.out.println(logo.getSize());
		
		//use of getLocation()
		System.out.println(logo.getLocation());
		
		//use of getRect()
		Rectangle r = logo.getRect();
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		
		

	}

}
