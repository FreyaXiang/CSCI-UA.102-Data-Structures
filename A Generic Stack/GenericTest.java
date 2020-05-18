public class GenericTest {
	
	public static void main(String[] args) {
		
		//Stack<Character>
		Stack<Character> charStack1=new Stack<>();
		
		charStack1.push('a');
		charStack1.push('b');
		charStack1.push('c');
		charStack1.push('d');
		charStack1.push('e');
		charStack1.push('f');
		
        charStack1.display();
		
		charStack1.display(1, 3);
		
		charStack1.search('c');
		
		for (int i=0;i<6;i++) {
			charStack1.pop();
		}
		
		Stack<Character> charStack2=new Stack<>();
		charStack2.push('g');
		charStack2.push('h');
		charStack2.push('i');
		
		System.out.println(charStack1.compareTo(charStack2));
		
		System.out.println();
		
		//Stack<Integer>
		Stack<Integer> intStack1=new Stack<>();
		
		for (int i=0;i<6;i++) {
			intStack1.push(i);	
		}
		
        intStack1.display();
		
		intStack1.display(1, 3);
		
		intStack1.search(4);
		
		for (int i=0;i<6;i++) {
			intStack1.pop();
		}
		
		Stack<Integer> intStack2=new Stack<>();
		intStack2.push(10);
		intStack2.push(11);
		intStack2.push(12);
		
		System.out.println(intStack1.compareTo(intStack2));
		
		System.out.println();
		
		//Stack<Float>
		Stack<Float> floatStack1=new Stack<>();
		
		for (int i=0;i<6;i++) {
			floatStack1.push((float)(i+0.1));	
		}
		
        floatStack1.display();
		
		floatStack1.display(1, 3);
		
		floatStack1.search((float)2.1);
		
		for (int i=0;i<6;i++) {
			floatStack1.pop();
		}
		
		Stack<Float> floatStack2=new Stack<>();
		floatStack2.push((float)(10+0.1));
		floatStack2.push((float)(11+0.1));
		floatStack2.push((float)(12+0.1));
		
		System.out.println(floatStack1.compareTo(floatStack2));
		
		System.out.println();
		
		//Stack<Double>
		Stack<Double> doubleStack1=new Stack<>();
		
		for (int i=0;i<6;i++) {
			doubleStack1.push(i+0.2);	
		}
		
        doubleStack1.display();
		
		doubleStack1.display(1, 3);
		
		doubleStack1.search(2.2);
		
		for (int i=0;i<6;i++) {
			doubleStack1.pop();
		}
		
		Stack<Double> doubleStack2=new Stack<>();
		doubleStack2.push(10+0.2);
		doubleStack2.push(11+0.2);
		doubleStack2.push(12+0.2);
		
		System.out.println(doubleStack1.compareTo(doubleStack2));
		
		System.out.println();
		
		//Stack<String>
		Stack<String> stringStack1=new Stack<>();
		
		stringStack1.push("I love Java");
		stringStack1.push("I love CS102");
		stringStack1.push("I love Java");
		stringStack1.push("I love CS102");
		stringStack1.push("I love Java");
		stringStack1.push("I love CS102");
		
        stringStack1.display();
		
		stringStack1.display(1, 3);
		
		stringStack1.search("I hate java");
		
		for (int i=0;i<6;i++) {
			stringStack1.pop();
		}
		
		Stack<String> stringStack2=new Stack<>();
		stringStack2.push("I love CS102");
		stringStack2.push("I love Java");
		stringStack2.push("I love CS102");
		
		System.out.println(stringStack1.compareTo(stringStack2));
		
		
	}
}