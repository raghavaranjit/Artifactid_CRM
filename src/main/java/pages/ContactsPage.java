package pages;

import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsPage extends BaseClass{

	
	public ContactsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	static int frameonetimecount =1;
	
	
	public void createNewContact(String title, String firstName, String lastName, String company) throws InterruptedException{	
		Thread.sleep(10000);
		while(frameonetimecount<2 ) {
		driver.switchTo().frame("mainpanel");
		frameonetimecount++; 
		}
		
		Actions actionreference = new Actions(driver);
		WebElement contacts =  driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		actionreference.moveToElement(contacts).build().perform(); 
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(company);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	  
   
	}
	
}		


// //a[contains(text(),'Contacts')]  //a[@title='Contacts']