package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnBluestone {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch Blue stone
		driver.get("https://www.bluestone.com/");
		
		//handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		
		//click on offers
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Offers ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' 25% Off your first Gold Mine installment ']")).click();

	}

}
