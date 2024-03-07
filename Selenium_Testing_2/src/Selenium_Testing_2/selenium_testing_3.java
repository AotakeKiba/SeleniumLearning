package Selenium_Testing_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_testing_3 {
	public void main() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\evanr\\Documents\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");

//		// Find the radio button for “No” using its ID and click on it
//		driver.findElement(By.id("yes")).click();
//			
//		//Click on Check Button
//		driver.findElement(By.id("buttoncheck")).click();
		
		List<WebElement> elements = driver.findElements(By.name("name"));
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	    }

		}

}
