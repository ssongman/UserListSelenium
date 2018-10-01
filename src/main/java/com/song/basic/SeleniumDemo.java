package com.song.basic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		System.setProperty("webdriver.ie.driver", "C:\\workspace\\WebDriver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\workspace\\WebDriver\\geckodriver-v0.22.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

//		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.google.com");

		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("current URL: [" + driver.getCurrentUrl() + "]");
		System.out.println("current Title: [" + driver.getTitle() + "]");		


	    driver.get("https://www.google.com/");
	    driver.findElement(By.id("lst-ib")).click();
	    driver.findElement(By.id("lst-ib")).clear();
	    driver.findElement(By.id("lst-ib")).sendKeys("ssongman");
	    driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("rcnt")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='웹 검색결과'])[2]/following::h3[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Overview'])[1]/following::a[1]")).click();
	    driver.findElement(By.linkText("UserList")).click();
	    
		
	}
}
