package com.learning;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriting {
	public static void main(String[] args) throws IOException {
		File textWrite = new File("D:\\ARYA\\Practice.txt");
		File textWriteTwo = new File("D:\\ARYA\\PracticeTwo.txt");
		System.out.println(textWrite.canRead());                                       // NO we can't read the file because given file is non-editable
		System.out.println(textWrite.canWrite());                                      // NO we can't write the file because given file is non-editable 
		System.out.println(textWrite.length());
		System.out.println(textWriteTwo.length());                                     // yes, we can get the length of file in bytes
		System.out.println(textWriteTwo.canWrite());                                   // we can write because the given the file is editable
		System.out.println(textWriteTwo.getName());                                    // we can get the file name
		System.out.println(textWriteTwo.getAbsolutePath());                            // we can get the file path
		FileWriter writer = new FileWriter(textWrite);
		BufferedWriter textBufferWriter = new BufferedWriter(writer);
		textBufferWriter.write("Hi i am arya\nI am from ongole\nI am learning java ");
		textBufferWriter.close();
	}


}
