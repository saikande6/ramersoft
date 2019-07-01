package com.ramersoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ramer\\Desktop\\selenium documents\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
        driver.get("http://192.168.1.113:8080/KOT/getLayout");
        driver.manage().window().maximize();
        driver.findElement(By.id("layout_123esdrf45t6yhgb")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"tabler_\"]/span")).click();
        
        
        
	}

}
