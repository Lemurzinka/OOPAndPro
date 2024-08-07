package oopfifth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

public class CopyFilesWithExpansion {

	   public void copyFiles(File from, File to, String extansion){
	        if(from == null || !from.exists() || to == null || extansion == null){
	            System.out.println("Error!");
	        }
	        File [] files = from.listFiles();
	        for (int i = 0; i < files.length; i++) {
	            String fileExtension = files[i].getName().substring(files[i].getName().indexOf(".")+1);
	            if (fileExtension.equals(extansion)){
	                
	                File newFile = new File(to.getAbsolutePath().concat("\\").concat(files[i].getName()));
	                try (InputStream is = new FileInputStream(files[i].getAbsolutePath());
	                     OutputStream os = new FileOutputStream(newFile)) {
	                    is.transferTo(os);
	                } catch (FileNotFoundException e) {
	                    throw new RuntimeException(e);
	                } catch (IOException e) {
	                    throw new RuntimeException(e);
	                }
			}
		}
		
	}
	
	
}
