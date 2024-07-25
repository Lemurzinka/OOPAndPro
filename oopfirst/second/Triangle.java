package oopfirst;

public class Triangle {
	private double lengthOfSideA;
	private double lengthOfSideB;
	private double lengthOfSideC;
	
	public Triangle(double lengthOfSideA, double lengthOfSideB, double lengthOfSideC) {
		super();
		this.lengthOfSideA = lengthOfSideA;
		this.lengthOfSideB = lengthOfSideB;
		this.lengthOfSideC = lengthOfSideC;
	}
	public Triangle() {
		super();
	}
	
	public double getLengthOfSideA() {
		return lengthOfSideA;
	}
	public void setLengthOfSideA(double lengthOfSideA) {
		this.lengthOfSideA = lengthOfSideA;
	}
	public double getLengthOfSideB() {
		return lengthOfSideB;
	}
	public void setLengthOfSideB(double lengthOfSideB) {
		this.lengthOfSideB = lengthOfSideB;
	}
	public double getLengthOfSideC() {
		return lengthOfSideC;
	}
	public void setLengthOfSideC(double lengthOfSideC) {
		this.lengthOfSideC = lengthOfSideC;
	}

	@Override
	public String toString() {
		return "Triangle [Length Of Side A=" + lengthOfSideA + ", Length Of Side B=" + lengthOfSideB + ", Length Of Side C="
				+ lengthOfSideC + "]";
	}
	
	 public double calculateTheArea () {
		double p = (lengthOfSideA+lengthOfSideB+lengthOfSideC)/2;
		double area = Math.sqrt(p*(p-lengthOfSideA)*(p-lengthOfSideB)*(p-lengthOfSideC));
		
		return area;
		
	}
	
	
}
