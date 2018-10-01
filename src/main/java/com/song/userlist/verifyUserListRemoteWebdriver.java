package com.song.userlist;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/* 
 * 서버실행후 client 실행
 * 서버 : C:\workspace\WebDriver\selenium-server.bat
 * 
$ type selenium-server.bat
java -Dwebdriver.ie.driver="C:\workspace\WebDriver\IEDriverServer_Win32_3.14.0\IEDriverServer.exe" 
     -Dwebdriver.chrome.driver="C:\workspace\WebDriver\chromedriver_win32\chromedriver.exe" 
     -jar selenium-server-standalone-3.14.0.jar -port 4444

 */

public class verifyUserListRemoteWebdriver {
	private static RemoteWebDriver driver;
	private static DesiredCapabilities capabilities;
	
	public static void main(String[] args) {
		
		setUp();
		
		verifyGoogle();		
		AddUserTestCase();
		ViewTestCase();
		EditUserTestCase();
		RemoveUserTestCase();
		
		tearDown();
		
		return;		
	}
	

	public static void setUp() {
		capabilities = new DesiredCapabilities();		
		capabilities.setBrowserName("chrome");
//		capabilities.setBrowserName("htmlunit");
//		capabilities.setBrowserName("internet explorer");
//		capabilities.setBrowserName("firefox");
//		capabilities.setVersion("3.6");

		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
//			driver = new RemoteWebDriver(new URL("http://172.30.1.55:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
	
	public static void verifyGoogle() {
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		
		System.out.println("current URL: [" + driver.getCurrentUrl() + "]");
		System.out.println("current Title: [" + driver.getTitle() + "]");
		System.out.println("1. verifyGoogle sucess");
		System.out.println(" ");
		
	}

	public static void AddUserTestCase() {
		driver.get("http://http://35.233.240.59:8180/user");	
	    driver.get("http://35.233.240.59:8180/user");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='User List3'])[1]/following::a[1]")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("홍길동");
	    driver.findElement(By.id("gender")).clear();
	    driver.findElement(By.id("gender")).sendKeys("M");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
		System.out.println("current Title: [" + driver.getTitle() + "]");
		System.out.println("2. AddUserTestCase sucess");
		System.out.println(" ");
	}

	public static void ViewTestCase() {
	    driver.get("http://35.233.240.59:8180/user");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Male'])[5]/following::a[1]")).click();
	    driver.findElement(By.linkText("Return Home")).click();
		System.out.println("3. ViewTestCase sucess");
		System.out.println(" ");
	}

	public static void EditUserTestCase() {
	    driver.get("http://35.233.240.59:8180/");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View'])[11]/following::a[1]")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("홍길동군");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
		System.out.println("4. ViewTestCase sucess");
		System.out.println(" ");
	}

	public static void RemoveUserTestCase() {
	    driver.get("http://35.233.240.59:8180/user");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View'])[11]/following::input[2]")).click();
		System.out.println("5. RemoveUserTestCase sucess");
		System.out.println(" ");
	}
	

	public static void tearDown() {
//	    driver.quit();
//	    String verificationErrorString = verificationErrors.toString();
//	    if (!"".equals(verificationErrorString)) {
//	      fail(verificationErrorString);
//	    }
	}	

}
