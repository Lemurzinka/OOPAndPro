package oopsecond;

public class Veterinarian {
private String name;

public Veterinarian(String name) {
	super();
	this.name = name;
}

public Veterinarian() {
	super();
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Veterinarian [name=" + name + "]";
}

public void treatment (Animal animal) {
	System.out.println("Treatment by "+ name +" of " + animal.getClass().getSimpleName().toLowerCase());
}
}
