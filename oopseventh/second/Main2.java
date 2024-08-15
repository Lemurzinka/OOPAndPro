package oopseventh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main2 {

	public static void main(String[] args) {
		File file1 = new File("D:\\DENIS\\TEST\\Test.pdf");
		File folderOut1 = new File("D:\\DENIS\\TEST2");

		
		try {
			Action.copy(folderOut1, file1);
		} catch (IOException e1) {
			e1.printStackTrace();
		}




		}
	}


