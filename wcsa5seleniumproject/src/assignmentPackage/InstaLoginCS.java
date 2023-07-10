package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLoginCS {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[name*='ern']")).sendKeys("kitkat");
       
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name*='ass']")).sendKeys("rutu@12345");
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class*='ap']")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("span[class*='ab3']")).click();
        
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector("a[class*=' xaqea5y xav7gou x9f619']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id*='ma']")).sendKeys("qsp@1234");
     
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder*='sswo']")).sendKeys("jak@123");
      
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[id*='ginb']")).click();
        
        Thread.sleep(2000);
       // driver.findElement(By.cssSelector("a[class='_97w4']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[class*='signup_btn']")).click();
      
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name*='stn']")).sendKeys("Rutuja");
      
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Patil");
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id*='0_g_']")).sendKeys("1234512345");
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("kittu@20");
       
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("select[name*='day']")).sendKeys("20");
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("select[id*='on']")).sendKeys("Nov");
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("select[title*='ea']")).sendKeys("2000");
       
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label[for*='0_4_']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label[for*='0_5_']"));
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label[for*='0_6_']"));
        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[id*='0_s_']")).click();
       
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[class*='bq']")).click();
	}

}
