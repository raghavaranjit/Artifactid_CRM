package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	public void login(String un , String pwd) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pwd);
		Thread.sleep(10000);		
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
							
				}
	
	}
