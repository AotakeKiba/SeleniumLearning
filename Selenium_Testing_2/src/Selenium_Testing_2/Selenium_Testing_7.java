package Selenium_Testing_2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Testing_7 {
	private static final String WebDriverManager = null;

	public void main() {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
         
		System.setProperty("webdriver.chrome.driver","C:\\Users\\evanr\\Documents\\Eclipse\\Driver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver(option);
		
//        String baseUrl = "http://demo.guru99.com/test/newtours/";
//
//        driver.get(baseUrl);           
//        WebElement link_Home = driver.findElement(By.linkText("Home"));
//        WebElement td_Home = driver.findElement(By.xpath("//html/body/div"+ "/table/tbody/tr/td"
//                + "/table/tbody/tr/td"+ "/table/tbody/tr/td"+ "/table/tbody/tr"));    
//         
//        Actions builder = new Actions(driver);
//        Action mouseOverHome = builder
//                .moveToElement(link_Home)
//                .build();
//         
//        String bgColor = td_Home.getCssValue("background-color");
//        System.out.println("Before hover: " + bgColor);        
//        mouseOverHome.perform();        
//        bgColor = td_Home.getCssValue("background-color");
//        System.out.println("After hover: " + bgColor);
        
        
        String baseUrl = "http://www.facebook.com/"; 
        driver.get(baseUrl);
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
        	.moveToElement(txtUsername)
        	.click()
        	.keyDown(txtUsername, Keys.SHIFT)
        	.sendKeys(txtUsername, "hello")
        	.keyUp(txtUsername, Keys.SHIFT)
        	.doubleClick(txtUsername)
        	.contextClick()
        	.build();
        	
        seriesOfActions.perform() ;
//        driver.close();
	}

}
