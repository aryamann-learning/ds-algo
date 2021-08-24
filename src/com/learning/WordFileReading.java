package com.learning;

import java.io.FileInputStream;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class WordFileReading {
	/*public static void main(String[] args) {
		 try {
			   FileInputStream fis = new FileInputStream("test.docx");
			   XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(fis));
			   XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
			   System.out.println(extractor.getText());
			} catch(Exception ex) {
			    ex.printStackTrace();
			}
	 }*/
	public static void main(String[] args) {  
        try(FileInputStream fis = new FileInputStream("C:\\Users\\SYS\\Documents\\JAVA DOCUMENTS\\oops.docx")) {  
            XWPFDocument file   = new XWPFDocument(OPCPackage.open(fis));  
            XWPFWordExtractor ext = new XWPFWordExtractor(file);  
            System.out.println(ext.getText());  
        }catch(Exception e) {  
            System.out.println(e);  
        }  
   }  
}