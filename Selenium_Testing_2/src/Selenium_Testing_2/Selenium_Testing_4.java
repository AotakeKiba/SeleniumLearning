package Selenium_Testing_2;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;

public class Selenium_Testing_4 {
	public void main () {
		// declaration and instantiation of objects/variables		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\evanr\\Documents\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();					
	    
//		String baseUrl = "http://demo.guru99.com/test/login.html";					
//	    driver.get(baseUrl);					

//	    // Get the WebElement corresponding to the Email Address(TextField)		
//	    WebElement email = driver.findElement(By.id("email"));							
//
//	    // Get the WebElement corresponding to the Password Field		
//	    WebElement password = driver.findElement(By.name("passwd"));							
//
//	    email.sendKeys("abcd@gmail.com");					
//	    password.sendKeys("abcdefghlkjl");					
//	    System.out.println("Text Field Set");					
//	     
//	    // Deleting values in the text box		
//	    email.clear();			
//	    password.clear();			
//	    System.out.println("Text Field Cleared");					
//
//	    // Find the submit button		
//	    WebElement login = driver.findElement(By.id("SubmitLogin"));							
//	                		
//	    // Using click method to submit form		
//	    email.sendKeys("abcd@gmail.com");					
//	    password.sendKeys("abcdefghlkjl");					
//	    login.click();			
//	    System.out.println("Login Done with Click");					
	    		
	    //using submit method to submit the form. Submit used on password field
		String baseUrl = "https://cpms.ciputragroup.com:81/login";
	    driver.get(baseUrl);					
	    driver.findElement(By.name("user_login")).sendKeys("div.qs");							
	    driver.findElement(By.name("password")).sendKeys("ssuper");							
	    driver.findElement(By.cssSelector(".btn")).submit();					
	    System.out.println("Login Done with Submit");				
	     
		//driver.close();

	}	
}
