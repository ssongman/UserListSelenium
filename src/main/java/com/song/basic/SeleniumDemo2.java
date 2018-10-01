package com.song.basic;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo2 {	
    public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		System.setProperty("webdriver.ie.driver", "C:\\workspace\\WebDriver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\workspace\\WebDriver\\geckodriver-v0.22.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

//		WebDriver driver = new HtmlUnitDriver();
        
        driver.get("http://wikipedia.org");                
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("scrollBy(0,2500);");
        System.out.println("Scroll OK");
        
        jsx.executeScript("alert('Scroll down complete');");
        System.out.println("alert OK");

        Thread.sleep(5000);
        driver.switchTo().alert().accept();     // alert 명령 확인
        
        String pageTitle = (String)jsx.executeScript("return document.title");
        System.out.println("page Title using javascript : " + pageTitle);
        System.out.println("page Title using webdriver : " + driver.getTitle());
        
        //Thread.sleep(3000);        
        //driver.get("http://wikipedia.org");      
        //js.executeScript("document.getElementById('sizeSamll').click()");  
    }
}
