import java.util.ArrayList;

public class Stack<E extends Comparable<E>> implements Comparable<Stack<E>> {
	
	ArrayList<E> stack;
	int top;
	int size;
	
	public Stack(int n) {
		stack = new ArrayList<E>();
		top = -1;
		size=n;
		
	}
	
	public Stack() {
		this(5);
	}
	
	public void push(E e) {
		if(top == size-1) {
			System.out.println("Stack Overflow");
			return;
		}
		
		stack.add(e);
		++top;
		System.out.println("Pushed " + e);
	}
	
	public void pop() {
		if(top == -1)
			System.out.println("Stack Underflow");
		else {
			System.out.println("Popped "+stack.get(top--));		
		}
	}
	
	public void display() {
		for(int i = 0; i <= top; i++)
			System.out.print(stack.get(i) + " ");
		
		System.out.println();
	}
	
	public void display(int start, int end) {
		if(start > top)
			return;
		if(end > top)
			end = top;
		for(int i = start; i <= end; i++)
			System.out.print(stack.get(i) + " ");
		
		System.out.println();
	}
	
	public void search(E e) {
		for(int i = 0; i <= top; i++)
			if(stack.get(i).compareTo(e)==0) {
				System.out.println("Found at " + i);
				return;
			}
		
		System.out.println("Not found");
	}

	@Override
	public int compareTo(Stack<E> o) {
		if(this.top < o.top)
			return -1;
		else if(this.top == o.top)
			return 0;
		else
			return 1;
	}
}
