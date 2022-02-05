package Test.Sample_maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public static void logIn()
	{
		System.setProperty("webdriver.chrome.driver","E:\\TY\\Selenium\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Mohan122@test.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testng@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
}
