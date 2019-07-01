package com.ramersoft;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home1 {
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method sstub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramer\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("http://192.168.1.113:8080/KOT/");
        driver.manage().window().maximize();
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
       
   //    Robot robot = new Robot();
        driver.findElement(By.id("user")).click();
        
        Actions action =new Actions(driver);
        action.moveToElement(driver.findElement(By.id("")));
        // Create a three seconds delay.
        /*robot.delay(3000);

        // Generating key press event for writing the QWERTY letters
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_A);*/
        
    } 
      /*  driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("login-submit")).click();*/
       


}
