package Selenium_Testing_2;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Testing_2 {
	public void main() {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\Users\\evanr\\Documents\\Katalon_Studio_Windows_64-8.1.0\\Katalon_Studio_Windows_64-8.1.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\evanr\\Documents\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
    }
}
