
package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import util.TestUtil;
//import com.FreeCRM.qa.util.WebEventListener;

public class BaseClass {     
	
	public static WebDriver driver;                      // gobal variable driver can be call any where from project // can be used in child class
	public static Properties propref;				      // properties file can be called any where from entire project
	//public static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener; 
		
	
	public BaseClass() throws IOException{   
		
	propref = new Properties();
	FileInputStream fisref = new FileInputStream("C:\\Users\\apv29\\eclipse-workspace\\Artifactid_CRM\\src\\main\\java\\config\\Config.properties");
	propref.load(fisref);
	    }
	

	 
	
	// driver method to call driver initialization 
	
	public static void initializationmethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\apv29\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.get(propref.getProperty("url"));
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);   // second may be changed from time to time 
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		
	}

	
}
