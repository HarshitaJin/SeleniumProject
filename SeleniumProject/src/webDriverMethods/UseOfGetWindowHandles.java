package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.linkedin.com/");
		//driver.get("https://www.shopperstack.com/");
		Set<String> wid=driver.getWindowHandles();
		System.out.println(wid);

	}

}
