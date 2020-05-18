package Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTestOut {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		
		//request the length and width from user
		System.out.print("Enter the length of the rectangle: ");
		int l=Integer.parseInt(in.readLine());
		
		System.out.print("Enter the width of the rectangle: ");
		int w=Integer.parseInt(in.readLine());
		
		//create the Rectangle object
		Rectangle r=new Rectangle(l,w);
		
		//get the area
		int a=r.area();
		
		//output the rectangle area
		System.out.println("The area of the rectangle is "+a);
		

	}

}
