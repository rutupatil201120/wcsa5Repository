package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/wcsa5/WebElement/MultipleSelDropDown.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelectDD);
		Thread.sleep(2000);
		//To select Using Index
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		//To select using Visible Text
		sel.selectByVisibleText("Paani Puri");
		
		Thread.sleep(2000);
		//To select Using Value
		sel.selectByValue("v5");
		
		Thread.sleep(2000);
		//To deselect Using Index
		sel.deselectByIndex(3);
		
		Thread.sleep(2000);
		//To deselect Using Visible text
		sel.deselectByVisibleText("Misal Pav");
		
		Thread.sleep(2000);
		//To deslect Using Value
		sel.deselectByValue("v5");
		
		Thread.sleep(2000);
		//To select Multiple Options Using for loop
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		
		//To deselect Multiple options Using for loop
//		for(int i=0;i<5;i++)
//		{
//			sel.deselectByIndex(i);
//			Thread.sleep(1000);
//		} 
		
		Thread.sleep(1000);
		//To deselect Using deselectAll
		sel.deselectAll();
		
	}

}
