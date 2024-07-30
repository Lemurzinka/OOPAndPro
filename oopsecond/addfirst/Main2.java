package oopsecond;

import java.io.File;

public class Main2 {

	public static void main(String[] args) {
		TextTransformer tt = new TextTransformer();
		InverseTransformer it = new InverseTransformer();
		UpDownTransformer ut = new UpDownTransformer();
		
		String text = "hello";
		
		System.out.println(tt.transform(text));
		System.out.println(it.transform(text));
		System.out.println(ut.transform(text));
		
		
		File f1 = new File("transformer.txt");
		TextSaver ts = new TextSaver(ut, f1);
		ts.saveTextToFile(text);
		
		

		

	}

}
