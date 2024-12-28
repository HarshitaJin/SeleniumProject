package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class blinkitXpathAssignment 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blinkit.com");
		//detect my location
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='SearchBar__IconContainer-sc-16lps2d-5 hcexgJ']")).click();
        driver.findElement(By.xpath("//input[@class='SearchBarContainer__Input-sc-hl8pft-3 irVxjq']")).sendKeys("milk");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Amul Taaza Toned Fresh Milk']/../..//div[text()='ADD']")).click();
        for(int i=1;i<5;i++)
        {
        	driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']")).click();
        }
        driver.findElement(By.xpath("//div[@class='CartButton__Button-sc-1fuy2nj-5 joEvaa']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Login to Proceed']")).click();
	}
}
