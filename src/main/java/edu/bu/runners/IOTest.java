package edu.bu.runners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import edu.bu.domain.Person;

public class IOTest {

	public static void main(String[] args) {
		File inFile = new File("in.txt");
		File outFile = new File("out.txt");
		PrintWriter printWriter = null;
		try {
			if (!inFile.exists())
				return;
			Scanner scanner = new Scanner(inFile);
			printWriter = new PrintWriter(outFile);
			while (scanner.hasNextLine()) {
				String currLine = scanner.nextLine();
				String replacedString = currLine.replaceAll("java", "apple");
				printWriter.println(replacedString);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			printWriter.close();
		}

	}

}
