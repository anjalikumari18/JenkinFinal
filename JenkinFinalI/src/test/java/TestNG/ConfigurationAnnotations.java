package TestNG;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	
	@BeforeSuite
	public void configBS() {
		System.out.println("====execute BS====");
	}
	
	@AfterSuite
	public void configAS() {
		System.out.println("====execute AS====");
	}
	
	@BeforeClass
	public void configBC() {
		System.out.println("execute BC");
	}
	
	@BeforeMethod
	public void configBM() {
		System.out.println("execute BM");
	}
	
	@Test
	public void executeTC1() {
		System.out.println("TC1 Executed");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	public void executeTC2() {
		System.out.println("TC2 Executed");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	

	@AfterClass
	public void configAC() {
		System.out.println("execute AC");
	}
	
	@AfterMethod
	public void configAM() {
		System.out.println("execute AM");

}}
