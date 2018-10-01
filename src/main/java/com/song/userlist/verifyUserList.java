package com.song.userlist;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class verifyUserList {
	private static WebDriver driver;
	private static JavascriptExecutor js;

	public static void main(String[] args) {
		setUp();
		
		//verifyGoogle();		
		AddUserTestCase();
		ViewTestCase();
		EditUserTestCase();
		RemoveUserTestCase();
		
		tearDown();
	}
	
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

//		System.setProperty("webdriver.ie.driver", "C:\\workspace\\WebDriver\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();

//		System.setProperty("webdriver.gecko.driver", "C:\\workspace\\WebDriver\\geckodriver-v0.22.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

//		driver = new HtmlUnitDriver();

//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        js = (JavascriptExecutor)driver;	
	}
	
	public static void verifyGoogle() {
		driver.get("http://google.com");
        driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		
		System.out.println("current URL: [" + driver.getCurrentUrl() + "]");
		System.out.println("current Title: [" + driver.getTitle() + "]");
		System.out.println("1. verifyGoogle sucess");
		System.out.println(" ");
		
	}
	

	public static void AddUserTestCase() {
		
		driver.get("http://35.233.240.59:8180");
        js.executeScript("scrollBy(0,2500)");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='User List3'])[1]/following::a[1]")).click();        
//	    driver.findElement(By.linkText("Create User")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("È«±æµ¿");
	    driver.findElement(By.id("gender")).clear();
	    driver.findElement(By.id("gender")).sendKeys("M");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
//	    driver.findElement(By.linkText("Return Home")).click();
        js.executeScript("scrollBy(0,2500)");
		System.out.println("current Title: [" + driver.getTitle() + "]");
		System.out.println("2. AddUserTestCase sucess");
		System.out.println(" ");
	}

	public static void ViewTestCase() {
		
	    driver.get("http://35.233.240.59:8180");
        js.executeScript("scrollBy(0,2500)");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Male'])[5]/following::a[1]")).click();
	    driver.findElement(By.linkText("Return Home")).click();
        js.executeScript("scrollBy(0,2500)");
		System.out.println("3. ViewTestCase sucess");
		System.out.println(" ");
	}

	public static void EditUserTestCase() {
		
	    driver.get("http://35.233.240.59:8180");
        js.executeScript("scrollBy(0,2500)");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View'])[11]/following::a[1]")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("È«±æµ¿±º");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
//	    driver.findElement(By.linkText("Update User")).click();
        js.executeScript("scrollBy(0,2500)");
		System.out.println("4. EditUserTestCase sucess");
		System.out.println(" ");
	}

	public static void RemoveUserTestCase() {		
	    driver.get("http://35.233.240.59:8180");
        js.executeScript("scrollBy(0,2500)");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View'])[11]/following::input[2]")).click();
        js.executeScript("scrollBy(0,2500)");
		System.out.println("5. RemoveUserTestCase sucess");
		System.out.println(" ");
	}
	
	public static void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//	    driver.quit();
	}
	

}
