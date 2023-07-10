package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramInvalidLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Browser
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='ern']")).sendKeys("kitkat");
       
		driver.findElement(By.cssSelector("input[name*='ass']")).sendKeys("rutu@12345");
        
        driver.findElement(By.cssSelector("button[class*='ap']")).click();
		
	}

}
