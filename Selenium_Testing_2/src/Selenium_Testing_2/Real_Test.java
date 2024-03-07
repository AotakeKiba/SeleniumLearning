package Selenium_Testing_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Real_Test {
	
	public void login (WebDriver driver) throws InterruptedException {
		//input credential
		driver.findElement(By.name("user_login")).sendKeys("div.qs");							
	    driver.findElement(By.name("password")).sendKeys("gundam");							
	    driver.findElement(By.cssSelector(".btn")).submit();					
	    System.out.println("Login Done with Submit");
	    
	    //change Project
	    Select drpProject = new Select(driver.findElement(By.name("ganti_project")));
	    drpProject.selectByVisibleText("CITRA - TEST");
	    
	    //to wait until all the Jabatan load up
	    Thread.sleep(2000);
	    
	    //change Jabatan
	    String jabatan = "ADMIN WO";
	    Select drpJabatan = new Select(driver.findElement(By.name("ganti_jabatan")));
	    boolean match = false;
	    
	    	//check for the drop down content
	    List<WebElement> options = drpJabatan.getOptions();
	    while (match == false) {
	    	for (WebElement we:options) {
		    	if (we.getText().equals(jabatan)) {
		    		match = true;
		    	}
	    	}
	    	//to wait until all the Jabatan load up
	    	Thread.sleep(2000);
	    }	    
	    
	    drpJabatan.selectByVisibleText("ADMINISTRASI");
	    
	    driver.findElement(By.id("ganji_project_jabatan")).click();
	    System.out.println("Successfully changed project");
	    
	    //to wait for reminder pop up
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='myModal']/div/div/div/button")).click();
	    System.out.println("close News");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='modalSPK']/div/div/div/button/span")).click();
	    System.out.println("close Reminder");
	    
	    //open drop down menu
	    driver.findElement(By.xpath("//span[2]/i")).click();
	}
	
	public void WO (WebDriver driver) throws InterruptedException{
		
	}
	
	public void main (ChromeOptions option) throws InterruptedException {
		// declaration and instantiation of objects/variables		
		WebDriver driver = new ChromeDriver(option);					
	    		
	    //Login to CPMS
		String baseUrl = "https://cpms.ciputragroup.com:83/login";
	    driver.get(baseUrl);					
	    
	    //login function
	    login(driver);
	    
	    //WO
	    //WO(driver);
	    
		//driver.close();

	}	
}
