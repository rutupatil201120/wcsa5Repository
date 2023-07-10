package actionsClassMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Use to Perform Double click
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the ActiTime
		driver.get("http://127.0.0.1/login.do");
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		
		//Perform login Operation
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//HomePage
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		//click on setting module...
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
		//click on Logo and color
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		
		//click on use custom Logo
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		//click on button to select the file
		//driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		//Perform Double click
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		Thread.sleep(4000);
		
		File file = new File("./AutoItPrograms/ActiTimeFileUpload");
		String absPath = file.getAbsolutePath();
		Runtime.getRuntime().exec(absPath);
		Thread.sleep(4000);
		Runtime.getRuntime().exec(absPath);
		
		Thread.sleep(2000);
		//driver.quit();

	}

}
