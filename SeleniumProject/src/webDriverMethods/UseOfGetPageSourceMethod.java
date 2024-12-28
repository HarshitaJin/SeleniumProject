package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//return type string
public class UseOfGetPageSourceMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
}
}
