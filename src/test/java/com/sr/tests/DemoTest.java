package com.sr.tests;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sr.config.FrameworkConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	@Test
	
	public void testLogin() {
		//FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
		
		
		
		System.out.println(com.sr.config.ConfigFactory.getConfig().browser());
		System.out.println(com.sr.config.ConfigFactory.getConfig().url());
		
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\119\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.quit();
	}

}
