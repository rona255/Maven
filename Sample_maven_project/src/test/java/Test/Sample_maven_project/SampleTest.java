package Test.Sample_maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public static void Demo()
	{
		System.out.println("Example for maven");
	}
	@Test
	public static void Temp()
	{	WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(21, TimeUnit.HOURS);
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.MICROSECONDS);
		System.out.println("I am Temp Method");
	
	}
}
