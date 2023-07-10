package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// How to close Parent Window?
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
	    WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
	    
	    Point elementLoc = childWindow.getLocation();
	    int xaxis = elementLoc.getX();
	    int yaxis = elementLoc.getY();
	    
	    //scroll till open a pop up window link
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
	    
	    //click on link to open child browser
	    childWindow.click();
	    
	    //close the parent browser
	    Thread.sleep(2000);
	    driver.close();

	}

}