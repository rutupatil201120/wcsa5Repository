package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8888888888");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sj@2011");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log In' and @class='css-1dbjc4n r-184aecr r-z2wwpe r-1loqt21 r-15d164r r-1e081e0 r-1f1sjgu r-ah5dr5 r-1otgn73'] ]")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-184aecr r-z2wwpe r-1loqt21 r-15d164r r-1e081e0 r-1f1sjgu r-ah5dr5 r-1otgn73']")).click();
	}

}
