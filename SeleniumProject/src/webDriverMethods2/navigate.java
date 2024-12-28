package webDriverMethods2;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigate 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    URL mainurl=new URL("https://www.facebook.com");
	    driver.navigate().to(mainurl);
	    Thread.sleep(2000);
	    URL loginpage=new URL(mainurl,"https://www.facebook.com/r.php");
	    driver.navigate().to(loginpage);
	    Thread.sleep(2000);
	    driver.navigate().back();
	}
}
