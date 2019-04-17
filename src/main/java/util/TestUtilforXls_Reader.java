package util;
import java.util.ArrayList;


public class TestUtilforXls_Reader { 

	static Xls_Reader reader;

public static ArrayList<Object []>  getDataFromExcel(){

	ArrayList<Object []>  myData = new ArrayList<Object []>();
	
	try {
		reader = new Xls_Reader ("C:\\Users\\apv29\\eclipse-workspace\\Artifactid_CRM\\src\\main\\java\\testdata\\Selenium.xlsx");
	} catch(Exception e ){
		e.printStackTrace();
	}

	for (int rowNum = 2; rowNum <= reader.getRowCount("contactssheet"); rowNum++ ){
	 
		// GENERAL FORMAT 
		// String XXXXX = reader.getCellData("SHEET NAME " , "COLOUM NAME  " , rowNum);	
		
		String title = reader.getCellData("contactssheet" , "title " , rowNum);
		String firstName = reader.getCellData("contactssheet" , "firstName " , rowNum);
		String lastName = reader.getCellData("contactssheet" , "lastName " , rowNum);
		String company = reader.getCellData("contactssheet" , "company " , rowNum);

		Object ob[] = { title, firstName, lastName,company };
		myData.add(ob);
	}
	return myData;
}}


//C:\Users\apv29\eclipse-workspace\Artifactid_CRM\src\main\java\testdata\Selenium.xlsx



