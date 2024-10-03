package sawislogin;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver = new ChromeDriver();
	@BeforeTest 
	  public void browser(){
		WebDriverManager.chromedriver().setup();
	 	driver.manage().window().maximize();
	}
	@AfterTest
	  public void Quit() {
		driver.quit();
	}
	
  @Test
  public void test1() throws InterruptedException {
	  
	 
	 	String baseUrl = "http://hyd.gpinfotech.com/SAWICQA/home";
	    driver.get(baseUrl);
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
	    Thread.sleep(2000);

	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//body/div[@id='ProgressBlur']/section[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("sawisadmin@itrelated.co.za");
	    driver.findElement(By.xpath("//body/div[@id='ProgressBlur']/section[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Info1234$");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	    Thread.sleep(4000);
  }
}
