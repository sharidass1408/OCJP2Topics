package com.nbna.listfilesfromDirectory1;

import java.io.File;
import java.io.IOException;

public class ListingFiles {

	public static void main(String[] args) {
		/*
		 * To Demo how list of files are created
		 * 
		 */
		//System.out.println("Hello");
		File directory = new File("C:/Folder_with_Files");
		/*
		 * To demo how to check if a given file is a directory
		 */
		if (directory.isDirectory()) {

			String[] files = directory.list();
			for (String f : files) {
				System.out.println(f);
			}
		} else if (directory.isFile()) {
			System.out
					.println("Sorry this is not a directory, but a file with such a name exists");

		} else {
			System.out
					.println("Such a file or directory does not exist. Please make a selection to create a file with this name");
			try {
				directory.createNewFile();

			} catch (IOException e) {
				System.out
						.println("Sorry had an I/O problem performing this operation");
			}
		}

	}
}
