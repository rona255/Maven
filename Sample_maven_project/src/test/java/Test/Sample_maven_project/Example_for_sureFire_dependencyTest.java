package Test.Sample_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example_for_sureFire_dependencyTest {
	
	@Test
	public void sample()
	{
		System.setProperty("webdriver.chrome.driver","E:\\TY\\Selenium\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
