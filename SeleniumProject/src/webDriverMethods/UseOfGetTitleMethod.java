package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//return string
public class UseOfGetTitleMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String title=driver.getTitle();
		System.out.println("Title of web page is : "+title);
		if(title.contains("Selenium")) {
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not Verified");
		}

	}

}
