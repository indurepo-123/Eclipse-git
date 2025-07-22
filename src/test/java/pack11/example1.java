package pack11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example1 {
	
	@Test @Ignore
	public void TestGoogle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.className("gLFyf")).sendKeys("Air India");
		driver.findElement(By.className("gLFyf")).submit();
		Thread.sleep(3000);
		System.out.println("what the falakura");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
	}

	@Test 
	public void aTestGoogle1() {
		System.out.println("this is test 1 from example 1");
		
	}
	@Test 
	public void cTestGoogle2() {
		System.out.println("this is test 2 from example 1");
		
	}
	@Test 
	public void bTestGoogle3() {
		System.out.println("this is test 3 from example 1");
		
	}

}
