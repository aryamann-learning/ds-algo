package com.learning;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWriting {
	public static void main(String[]args)   
	{  
	try   
	{  
	//declare file name to be create   
	String filename = "D:\\ARYA\\Excelwriting.xlsx";  
	//creating an instance of HSSFWorkbook class  
	XSSFWorkbook workbook = new XSSFWorkbook();  
	//invoking creatSheet() method and passing the name of the sheet to be created   
	XSSFSheet sheet = workbook.createSheet("January");   
	//creating the 0th row using the createRow() method  
	XSSFRow rowhead = sheet.createRow((short)0);  
	//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
	rowhead.createCell(0).setCellValue("S.No.");  
	rowhead.createCell(1).setCellValue("Customer Name");  
	rowhead.createCell(2).setCellValue("Account Number");  
	rowhead.createCell(3).setCellValue("e-mail");  
	rowhead.createCell(4).setCellValue("Balance");  
	//creating the 1st row  
	XSSFRow row = sheet.createRow((short)1);  
	//inserting data in the first row  
	row.createCell(0).setCellValue("1");  
	row.createCell(1).setCellValue("ANJI");  
	row.createCell(2).setCellValue("123456789");  
	row.createCell(3).setCellValue("ANJI123@gmail.com");  
	row.createCell(4).setCellValue("700000.00");  
	//creating the 2nd row  
	XSSFRow row1 = sheet.createRow((short)2);  
	//inserting data in the second row  
	row1.createCell(0).setCellValue("2");  
	row1.createCell(1).setCellValue("PRIYANKA");  
	row1.createCell(2).setCellValue("234567891");  
	row1.createCell(3).setCellValue("priyanka@gmail.com");  
	row1.createCell(4).setCellValue("200000.00");  
	
	XSSFRow row2 = sheet.createRow((short)3);
	row2.createCell(0).setCellValue("2");  
	row2.createCell(1).setCellValue("ARYA");  
	row2.createCell(2).setCellValue("345678912");  
	row2.createCell(3).setCellValue("aryaa@gmail.com");  
	row2.createCell(4).setCellValue("100000.00");
	FileOutputStream fileOut = new FileOutputStream(filename);  
	workbook.write(fileOut);  
	//closing the Stream  
	fileOut.close();  
	//closing the workbook  
	
	//prints the message on the console  
	System.out.println("Excel file has been generated successfully.");  
	}   
	catch (Exception e)   
	{  
	e.printStackTrace();  
	}  
	}  

}
