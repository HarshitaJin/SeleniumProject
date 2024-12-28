package webDriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//return type string
public class UseOfGetWindowHandle {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.selenium.dev/");
			String wid=driver.getWindowHandle();
			System.out.println("Window id "+wid);
	}

}
