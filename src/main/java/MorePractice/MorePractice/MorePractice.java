package MorePractice.MorePractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MorePractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String csv="C:\\Users\\91700\\eclipse-workspace\\MorePractice\\Csv\\1732080449644.csv";
		String text ="M:/output.txt";
	BufferedReader file = new BufferedReader(new FileReader(csv));
	BufferedWriter write = new BufferedWriter(new FileWriter(text));
	int rowcount =0;
	String row;
	while((row=file.readLine())!=null && rowcount<10) {
		write.write(row);
		write.newLine();
		rowcount++;
		
	}
	  System.out.println("Successfully written " + rowcount + " rows to the text file: " + text);

      // Close resources
      file.close();
      write.close();
	}
}
