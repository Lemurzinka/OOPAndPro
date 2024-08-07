package oopthird;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class CompareFiles {

	
	boolean isEquels (File file1, File file2) {
		
		int readBytes1 = 0; 
		int readBytes2 = 0;
		
		try (InputStream reader1 = new FileInputStream(file1);
				InputStream reader2 = new FileInputStream(file2)){
			byte [] arr1 = new byte [1000000];
			byte [] arr2 = new byte [1000000];
			
			while (true) {
				readBytes1 = reader1.read(arr1);
				readBytes2 = reader2.read(arr2);
				
				if (!(Arrays.equals(arr1, arr2))) {
					return false;
				}
				if (readBytes1 <= 0 && readBytes2 <=0) {break;}
			}
		}
		
		catch (IOException e ) {
			e.printStackTrace();
		}
		return true;
		}
	
}
