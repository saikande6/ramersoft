package com.ramersoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramer\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("https://ramersoft.com");
        driver.manage().window().maximize();
	}

}
