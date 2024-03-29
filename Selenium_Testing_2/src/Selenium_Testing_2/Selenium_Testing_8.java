package Selenium_Testing_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;

public class Selenium_Testing_8 {
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\evanr\\Documents\\Eclipse\\Driver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
        
//     // Alert Message handling
//		
//        driver.get("https://demo.guru99.com/test/delete_customer.php");			
//                            		
//     	      	
//        driver.findElement(By.name("cusid")).sendKeys("53920");					
//        driver.findElement(By.name("submit")).submit();			
//        		
//        // Switching to Alert        
//        Alert alert = driver.switchTo().alert();		
//        		
//        // Capturing alert message.    
//        String alertMessage= driver.switchTo().alert().getText();		
//        		
//        // Displaying alert message		
//        System.out.println(alertMessage);	
//        Thread.sleep(5000);
//        		
//        // Accepting alert		
//        alert.accept();
        
	      //Launching the site.				
	        driver.get("https://demo.guru99.com/popup.php");			
		    driver.manage().window().maximize();		
		            		
			driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
			    		
		    String MainWindow=driver.getWindowHandle();	
	     // To handle all new opened window.				
	        Set<String> s1=driver.getWindowHandles();		
		    Iterator<String> i1=s1.iterator();		
		    		
		    while(i1.hasNext())			
		    {		
		        String ChildWindow=i1.next();		
		        		
		        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		        {    		
		             
		                // Switching to Child window
		                driver.switchTo().window(ChildWindow);	                                                                                                           
		                driver.findElement(By.name("emailid"))
		                .sendKeys("gaurav.3n@gmail.com");                			
		                
		                driver.findElement(By.name("btnLogin")).click();			
		                             
				// Closing the Child Window.
		                    driver.close();		
		        }		
		    }		
		    // Switching to Parent window i.e Main Window.
		        driver.switchTo().window(MainWindow);
			}

}
