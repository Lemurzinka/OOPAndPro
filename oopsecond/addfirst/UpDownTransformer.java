package oopsecond;

public class UpDownTransformer extends TextTransformer {

	public UpDownTransformer() {
		super();
	}

	@Override
	public String transform (String text) {

		String[] arrSymbols = text.split(" ");
		
		for (int i = 0; i < arrSymbols.length; i++) {
			StringBuilder sb = new StringBuilder(arrSymbols[i]);
			for (int j = 0; j < sb.length(); j++) {
				if ((j&1)==1) {
					sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
					
	
				}else {sb.setCharAt(j, Character.toUpperCase(sb.charAt(j)));}
			}
			arrSymbols[i] = sb.toString();
			
			
		}
	
	
	return String.join("", arrSymbols);
	
}}
