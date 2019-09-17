package com.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public static void Script() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium-Java-3.14.0\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://Gmail.com");
  }
}
