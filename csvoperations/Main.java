

package oopfifth;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File file1;
		File file2;
CompareFiles cf = new CompareFiles();
		if (args.length == 2) {
			file1 = new File(args[0]);
			file2 = new File(args[1]);
		} else {
			file1 = new File("D:\\new.csv");
			file2 = new File("D:\\new-copy.csv");
		}

		try {
			cf.isEquels(file1, file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
