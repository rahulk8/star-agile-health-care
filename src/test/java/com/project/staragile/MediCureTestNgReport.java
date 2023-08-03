package com.medicureapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MediCureTest {
  
    @Test
	  public  void testapp() {
       WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://13.232.228.60:8082/");
		   //driver.findElement(By.name("q")).sendKeys("kia",Keys.ENTER);
		   System.out.println(driver.getTitle());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
