package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//return type string
public class UseOfGetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("Selenium")) {
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not Verified");
		}

	}


	}


