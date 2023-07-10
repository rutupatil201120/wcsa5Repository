package dropDown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/hp/Desktop/wcsa5/WebElement/MultipleSelDropDown.html");
		
		//identify DropDown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//handle the DropDown
		Select sel = new Select(dropDownElement);
		
//		List<WebElement> allOpts = sel.getOptions();
//		
//		for(WebElement op:allOpts) 
//		{
//			System.out.println(op.getText());
//		}
		
		//To Read options from DropDown
		WebElement allOpts = sel.getWrappedElement();
		System.out.println(allOpts.getText());
		
	}

}
