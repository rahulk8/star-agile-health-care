package com.project.staragile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;

public class MediCureTestNgReport{
  
          @Test
	  public  void testapp() {
                  WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://13.232.228.60:8082/contac.html");
		   //driver.findElement(By.name("q")).sendKeys("kia",Keys.ENTER);
		   //System.out.println(driver.getTitle());

		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys("Rahul Kumar");
	
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9711739492");
	
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulpatna89@gmail.com");

	        driver.findElement(By.xpath("//input[@placeholder='Message']")).sendKeys("Hi Medicure , Please call me back for medical consultation");
		
		driver.findElement(By.className("btn_box")).click();
		
		String message = driver.findElement(By.id("message")).getText();
		if(message.equals("Email sent.")) {
			System.out.println("Script Executed Successfully");
		} else 
		{
			System.out.println("Script Failed");
		}
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("//home/ubuntu//scr.png");
		FileUtils.copyFile(screenShot, destFile);
		  
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
