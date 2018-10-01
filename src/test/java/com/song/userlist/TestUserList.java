package com.song.userlist;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



/***************************************************************
< mvn test report >
C:\workspace\UserListSelenium> mvn surefire-report:report

<report>
C:/workspace/UserListSelenium/target/site/surefire-report.html

****************************************************************/


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestUserList {
	private WebDriver driver;
	private JavascriptExecutor js;

	@Before
	public void setUp() {
		// 테스트 성공
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// 테스트 성공
//		System.setProperty("webdriver.ie.driver", "C:\\workspace\\WebDriver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();

		// 테스트 실패함
//		System.setProperty("webdriver.gecko.driver", "C:\\workspace\\WebDriver\\geckodriver-v0.22.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

		// 테스트 실패함
//		WebDriver driver = new HtmlUnitDriver();

//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        js = (JavascriptExecutor)driver;
	}

	@Test
	public void test1verifyGoogle() {
		// test1verifyGoogle
		// 1.test1verifyGoogle 
		driver.get("http://google.com");
        driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		
		System.out.println("current URL: [" + driver.getCurrentUrl() + "]");
		System.out.println("1. test1verifyGoogle sucess");
		System.out.println(" ");
		driver.quit();
	}
	

	@Test
	public void test2UserListTestCase() {
		
		// UserListTestCase
		// 2.AddUser 
		driver.get("http://35.233.240.59:8180");
        js.executeScript("scrollBy(0,2500)");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='User List3'])[1]/following::a[1]")).click();        
//	    driver.findElement(By.linkText("Create User")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("홍길동");
	    driver.findElement(By.id("gender")).clear();
	    driver.findElement(By.id("gender")).sendKeys("M");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
        
		System.out.println("current Title: [" + driver.getTitle() + "]");
		System.out.println("2. AddUserTestCase sucess");
		System.out.println(" ");
		
		// 3.ViewTestCase
//	    driver.get("http://35.233.240.59:8180");
        js.executeScript("scrollBy(0,2500)");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Male'])[5]/following::a[1]")).click();
	    driver.findElement(By.linkText("Return Home")).click();
		System.out.println("3. ViewTestCase sucess");
		System.out.println(" ");
		
		// 4.EditUserTestCase
	    driver.get("http://35.233.240.59:8180");
        js.executeScript("scrollBy(0,2500)");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View'])[11]/following::a[1]")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("홍길동군");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
		System.out.println("4. EditUserTestCase sucess");
		System.out.println(" ");
		
		// 5.RemoveUserTestCase	
//	    driver.get("http://35.233.240.59:8180");
        js.executeScript("scrollBy(0,2500)");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View'])[11]/following::input[2]")).click();
		System.out.println("5. RemoveUserTestCase sucess");
		System.out.println(" ");
	}


	@After
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	    driver.quit();
	}
	

}
