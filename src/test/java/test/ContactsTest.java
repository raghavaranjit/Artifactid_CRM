package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import base.BaseClass;
import util.TestUtil;
import util.TestUtilforXls_Reader;
import pages.ContactsPage;
import pages.LoginPage;
import util.Xls_Reader;

public class ContactsTest extends BaseClass{

	public ContactsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//ContactsPage contactsreference;
	
	
	String sheetName = "contactssheet";
	
	@BeforeMethod()
	public void setup () throws IOException, InterruptedException {
		initializationmethod();
		LoginPage loginpagereference = new LoginPage();
		loginpagereference.login(propref.getProperty("usernameforlogin"),propref.getProperty("passwordforlogin")); 
						
	}
	
	/* DATA PROVIDER FROM TEST UTIL.JAVA */
	//@DataProvider
	//public Object[][] getcontactstestdata(){
	//Object data[][] = TestUtil.getTestData(sheetName);
	//return data;	
	//}
	
	/* DATA PROVIDER FROM XLS READER.JAVA  */
	//@DataProvider
	//public Iterator<Object[]> getcontactstestdata() {
	//	ArrayList<Object []> contcttestdata = TestUtilforXls_Reader.getDataFromExcel();
	//	return contcttestdata.iterator();
	//}
	
	
	/* CODE IS VALID FOR XLS READER AND TESTUTIL */
	//@Test(dataProvider="getcontactstestdata")
	//public void validateCreateNewContact(String title, String firstName, String lastName, String company)throws IOException, InterruptedException{
	//	ContactsPage contactsreference = new ContactsPage();
	//  contactsreference.createNewContact(title,firstName,lastName,company);
	    
    @Test    
	public void validateCreateNewContact()throws IOException, InterruptedException{
			ContactsPage contactsreference = new ContactsPage();
			Xls_Reader reader = new Xls_Reader("C:\\Users\\apv29\\eclipse-workspace\\Artifactid_CRM\\src\\main\\java\\testdata\\Selenium.xlsx");
			int noofrows = reader.getRowCount("contactssheet");
			for(int rowNum = 2; rowNum <= noofrows; rowNum++)
			{
			String title = reader.getCellData("contactssheet", "title", rowNum);
			String firstName = reader.getCellData("contactssheet", "firstName", rowNum);
			String lastName = reader.getCellData("contactssheet", "lastName", rowNum);
			String company = reader.getCellData("contactssheet", "company", rowNum);
		    contactsreference.createNewContact(title,firstName,lastName,company);	
			}
		}
	
	}















