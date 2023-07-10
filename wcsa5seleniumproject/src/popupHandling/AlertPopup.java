package popupHandling;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/hp/Desktop/wcsa5/WebElement/AlertPopup.html");
		
		//To generate Pop up click on button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//handle pop up by using robot class
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(2000);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//handle alert pop up by switchTo()
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();
		//al.dismiss();
		//returns the text of alert pop up
		System.out.println(al.getText());
		
		
	}

}
