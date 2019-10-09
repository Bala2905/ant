package order;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Cash {
	public static WebDriver driver;
	static String URL ="https://www.flipkart.com/";


@Test(priority=1)

public void launchBroswer() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bala\\eclipse-workspace\\FlipKart\\Driver\\geckodriver.exe");
	driver = new FirefoxDriver();
//WebDriver driver = new FirefoxDriver(); 
	driver.manage().window().maximize(); 
	Thread.sleep(5000);
	driver.get(URL);
	Thread.sleep(10000);
	}

@Test(priority=2)
public void login () throws InterruptedException

{
	//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9940286390");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Flipkart@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	Thread.sleep(5000);
	
	//Mousehover
	WebElement dropdown= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/ul/li[3]/span"));
	Actions act = new Actions(driver);
	act.moveToElement(dropdown).perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[4]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/a/div[1]/div/div/div/img")).click();
	Thread.sleep(2000);
	
	//For Switching New Tab
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(5000);
}
	@Test(priority=3)
	public void NextTab () throws InterruptedException
{
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
	Thread.sleep(2000);
	//Mouse
	WebElement dropdown= driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[3]/div/div"));
	Actions act = new Actions(driver);
	act.moveToElement(dropdown).perform();
	
	//For Switching New Tab
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(0));
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[1]/div/div/div/section[4]/div[2]/div/div[1]/div/div/label/div[1]")).click();

	
	//driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).click();
	//driver.findElement(By.partialLinkText("Logout")).click();	
}


}




































