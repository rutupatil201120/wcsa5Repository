package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginButton {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Browser
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();//handle pop up
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();//click on cart
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();//click on Login button
		
	}

}
