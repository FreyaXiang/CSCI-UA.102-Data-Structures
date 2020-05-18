package Lab1;

public class Rectangle {
	private int length;
	private int width;
	
	//default constructor
	public Rectangle() {
		this(1,1);
	}
	
	//constructor with parameters
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	
	//two get methods
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	//two set methods
	public void setLength(int length) {
		this.length=length;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	//get the area of the rectangle
	public int area() {
		//calculate the area
		int area=this.length*this.width;
		//print 10 times
		for (int i=0;i<10;i++) {
			System.out.println(area);
		}
		
		return area;
	}
	
	//test if the rectangle is square
	public boolean isSquare() {
		return this.length==this.width;
	}

}
