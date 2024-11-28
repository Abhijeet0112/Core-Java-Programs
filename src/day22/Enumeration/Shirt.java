package day22.Enumeration;

enum size{
	Small,
	Medium,
	Large
}

public class Shirt {
	String color;
	size size;
	public Shirt(String color, day22.Enumeration.size size) {
		super();
		this.color = color;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Shirt [color=" + color + ", size=" + size + "]";
	}
	
	
}
