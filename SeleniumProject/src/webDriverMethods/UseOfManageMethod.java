package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//return type options (an interface)
public class UseOfManageMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize browser window
		driver.manage().window().minimize();//minimize browser window 
		driver.manage().window().fullscreen();//displays browser on full screen
		


	}

}
