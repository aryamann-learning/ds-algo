package com.learning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingPractice {
	public static void main(String[] args) throws IOException {
		
		File textFile = new File("D:\\ARYA\\Practice.txt");           // a text file which is non-editable
		File textFileTwo = new File("D:\\ARYA\\PracticeTwo.txt");     // A text file which is editable
		File wordFile = new File("D:\\ARYA\\oops.docx");
		
		System.out.println(textFile.canWrite());                      // we can't write because the give text file is non-editable.
		System.out.println(textFileTwo.canWrite());				      // we can write because it is editable text file.
		
        System.out.println(textFile.canRead());                       // we can read the file.
	//	System.out.println(textFile.delete());                        // we can able to delete the file.
        System.out.println(textFile.canExecute());                    // yes, we can execute the file.
        System.out.println(textFile.createNewFile());
        System.out.println(textFile.length());                        // length of file in bytes.
       System.out.println(wordFile.canRead());
        FileReader reader = new FileReader(textFile);

		BufferedReader textBufferReader = new BufferedReader(reader);

		String line = textBufferReader.readLine();

		System.out.println(line);
		while (line != null) {
			System.out.println(line);
			line = textBufferReader.readLine();
		}
		textBufferReader.close();

	}
}
