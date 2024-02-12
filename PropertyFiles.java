package day24.Practice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PropertyFiles {

	String firstname;
	String lastname;
	String email;
	String pasword;
	String name;
	String phno;
	
private void workbook() throws IOException {
	
	XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\HP\\Eclipse workspace new\\SeleniumPractice\\Files\\Fileone.xlsx");
	XSSFSheet sheet = book.getSheet("Sheet1");
	XSSFRow row1 = sheet.getRow(0);
	String Fname = row1.getCell(0).toString();		firstname=Fname; 
	String Lname = row1.getCell(1).toString();		lastname=Lname;
	XSSFRow row2 = sheet.getRow(1);
	String Email = row2.getCell(0).toString();		email=Email;
	String Pword = row2.getCell(1).toString();		pasword=Pword;
	XSSFRow row3 = sheet.getRow(2);
	String aName = row3.getCell(0).toString();		name=aName;
	String phnum = row3.getCell(1).toString();		phno=phnum;
	
}
public static void main(String[] args) throws Exception {
	PropertyFiles pf = new PropertyFiles();
	

}
}
