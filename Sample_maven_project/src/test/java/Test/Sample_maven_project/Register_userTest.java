package Test.Sample_maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register_userTest {
	@Test(dependsOnMethods = "get_speed")
	public static void register_method()
	{
		System.setProperty("webdriver.chrome.driver","E:\\TY\\Selenium\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		driver.findElement(By.xpath("//input[@value='M']")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Mohan");
		driver.findElement(By.name("LastName")).sendKeys("Buddy");
		driver.findElement(By.id("Email")).sendKeys("Mohan122@test.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Testng@123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Testng@123");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		driver.quit();
	}
	
	@Test
	public static void  get_speed() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\TY\\Selenium\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.speedtest.net/");
		driver.findElement(By.xpath("//span[text()='Go']")).click();
		Thread.sleep(8000);
		driver.quit();
		
	}
	
	
}
