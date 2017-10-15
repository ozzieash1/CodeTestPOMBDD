package com.practiceselenium;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ExerciseOne {

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:/WS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.practiceselenium.com");
		// driver.get("http://www.practiceselenium.com/check-out.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	
	@Test
	public void AssertTitle() {
		System.setProperty("webdriver.chrome.driver", "C:/WS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.practiceselenium.com");
		// driver.get("http://www.practiceselenium.com/check-out.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Actual title
		String title = driver.getTitle();
		System.out.println("Title is  " + title);
		String expected_title = "Welcome";
		Assert.assertEquals(title, expected_title);
		System.out.println("Assertion completed");
	}

}
