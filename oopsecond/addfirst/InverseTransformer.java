package oopsecond;

public class InverseTransformer extends TextTransformer {

	
	
	public InverseTransformer() {
		super();
	}

	@Override
	public String transform (String text) {
	StringBuilder sb = new StringBuilder(text);
	sb.reverse();
	
	
	return sb.toString();
	
	} 
}
