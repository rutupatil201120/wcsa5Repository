package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/hp/Desktop/wcsa5/WebElement/SingleSelectDropdown.html");
		
		//identify dropdown on webpage
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		
		//handling the dropdown by creating obj of select...
		Select sel = new Select(dropDownElement);
		
		//select the option from dropdown...
		//Use Selection method
		Thread.sleep(2000);
	    sel.selectByIndex(2);//from single select dropdown
	    
	    Thread.sleep(2000);
	    //try to deselect given option from dropdown
	    sel.deselectByIndex(2);
	    
	   
	    
	}

}
