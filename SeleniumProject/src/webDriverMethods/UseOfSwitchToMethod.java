package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfSwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.linkedin.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.shopperstack.com/");
		Set<String> allwid=driver.getWindowHandles();
		//System.out.println(allwid);
		//using for each loop
		for(String wid : allwid) {
			String title=driver.switchTo().window(wid).getTitle();		
			if(title.equalsIgnoreCase("facebook")) {
				int FirstWindow=driver.manage().window().getSize().getHeight();
				System.out.println("First window height is"+FirstWindow);
				
			}
			else if(title.equalsIgnoreCase("linkedin"))
			{
				int SecondWindow=driver.manage().window().getSize().getWidth();
				System.out.println("Second window width is"+SecondWindow);
			}
			else if(title.equalsIgnoreCase("shopperstack"))
			{
				int thirdWindowh=driver.manage().window().getSize().getHeight();
				int thirdWindow=driver.manage().window().getSize().getWidth();
				System.out.println("Second window height is"+thirdWindowh);
				System.out.println("Second window width is"+thirdWindow);
			}
		}
		

	}

}
