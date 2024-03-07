package Selenium_Testing_2;

import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	private Real_Test real_test = new Real_Test();
	private Selenium_Testing_2 testing_2 = new Selenium_Testing_2();
	private selenium_testing_3 testing_3 = new selenium_testing_3();
	private Selenium_Testing_4 testing_4 = new Selenium_Testing_4();
	private Selenium_Testing_5 testing_5 = new Selenium_Testing_5();
	private Selenium_Testing_6 testing_6 = new Selenium_Testing_6();
	private Selenium_Testing_7 testing_7 = new Selenium_Testing_7();
	private Selenium_Testing_8 testing_8 = new Selenium_Testing_8();
	private Selenium_Testing_9 testing_9 = new Selenium_Testing_9();

	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\evanr\\Documents\\Eclipse\\Driver\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        
		//Real test
		//real_test.main(option);
		
		//testing webdriver selenium
		//testing_2.main();
		
		//testing selection selenium
		//testing_3.main();
		
		//testing input selenium
		//testing_4.main();
		
		//testing radio button and checkbox
		//testing_5.main();
		
		//testing dropdown
		//testing_6.main();
		
		//testing mouse action
		//testing_7.main();
		
		//testing alert and pop up window
		//testing_8.main();
		
		//testing broken link
		testing_9.main(option);
	}
	
	public static void main(String[] args) throws InterruptedException {
		Main main = new Main();
		main.main();
	}

}
