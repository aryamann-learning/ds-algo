package com.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/*import org.apache.poi.util.Units;*/
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WordFileWriting{
private static Object Units;

public static void main(String[] args) throws FileNotFoundException {
	
	
	XWPFDocument doc = new XWPFDocument();
	XWPFParagraph paragraphOne = doc.createParagraph();
	XWPFRun runOne = paragraphOne.createRun();
	runOne.setText("Hi this is arya\n");
	runOne.setBold(true);
	runOne.setItalic(true);
	runOne.setFontSize(20);
	runOne.setFontFamily("Times new roman");
	XWPFRun paragraphOneRunOne = paragraphOne.createRun();
    paragraphOneRunOne.setBold(true);
    paragraphOneRunOne.setFontSize(2);
    paragraphOneRunOne.setFontFamily("Verdana");
    paragraphOneRunOne.setText("HI I AM ARYA");
    //XWPFRun paragraphOneRunTwo = paragraphOne.createRun();
    //paragraphOneRunTwo.setText(" More text in paragraph one...");

    XWPFParagraph paragraphTwo = doc.createParagraph();
    paragraphTwo.setAlignment(ParagraphAlignment.CENTER);
    XWPFRun paragraphTwoRunOne = paragraphTwo.createRun();
    //paragraphTwoRunOne.setBold(true);
    paragraphTwoRunOne.setFontSize(12);
    paragraphTwoRunOne.setFontFamily("Verdana");
    paragraphTwoRunOne.addBreak();

    XWPFParagraph paragraphThree = doc.createParagraph();
    paragraphThree.setAlignment(ParagraphAlignment.LEFT);
    XWPFRun paragraphThreeRunOne = paragraphThree.createRun();
    //paragraphThreeRunOne.setBold(true);
    paragraphThreeRunOne.setFontSize(34);
    paragraphThreeRunOne.setFontFamily("Verdana");
    paragraphThreeRunOne.setText("hello this is arya");
    paragraphThreeRunOne.addBreak();

    XWPFParagraph paragraphFour = doc.createParagraph();
    paragraphFour.setAlignment(ParagraphAlignment.LEFT);
    XWPFRun paragraphFourRunOne = paragraphFour.createRun();
    paragraphFourRunOne.setBold(true);
    paragraphFourRunOne.setUnderline(UnderlinePatterns.SINGLE);
    paragraphFourRunOne.setFontSize(10);
    paragraphFourRunOne.setFontFamily("Verdana");
    paragraphFourRunOne.setText("Arya");
    /*up to this the code is working fine,and it is preparing the doc as expected,but after adding the rest of the part, that is adding the image,the doc got corrupted*/

    InputStream pic=null;
   /* try {
        pic = new FileInputStream("D:\\ARYA\\arya.JPG");
    } catch (FileNotFoundException e1) {
       
        e1.printStackTrace();
    }
    XWPFParagraph paragraphFive = doc.createParagraph();
    paragraphFive.setAlignment(ParagraphAlignment.CENTER);
    XWPFRun paragraphFiveRunOne = paragraphFive.createRun();
    try {
        paragraphFiveRunOne.addPicture(pic, XWPFDocument.PICTURE_TYPE_JPEG, "C:\\1.JPG",Units.toEMU(200), Units.toEMU(200));
    } catch (InvalidFormatException e1) {
      
        e1.printStackTrace();
    } catch (IOException e1) {
        
        e1.printStackTrace();
    } 
*/

    FileOutputStream outStream = null;
    try {
        outStream = new FileOutputStream("D:\\ARYA\\wordfilewriting.docx");
    } catch (FileNotFoundException e) {
        System.out.println("First Catch");
        e.printStackTrace();
    }
    try {
        doc.write(outStream);
        outStream.close();
    } catch (FileNotFoundException e) {
        System.out.println("Second Catch");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("Third Catch");
        e.printStackTrace();
    }

}

}