
public class Stack {

	private int [] stack;
	private int top; 
	private int size;
	
	public Stack() {
		
		top = -1;
		size = 50;
		stack = new int[size];
		
	}
	
	public Stack(int size) {
		
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}
	
	public boolean push(int a) {
		
		if(!isFull()) {
			top++;
			stack[top] = a;
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		
		if(top == stack.length - 1) {
			return true;
		}
		return false;
	}
	
	public int pop() {
		
		return stack[top--];
	}
	
	public boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}
		return false;
	}
}
