
public class PersonStack {

	private Person[] stack;
	private int top; 
	private int size; 
	
	public PersonStack() {
		
		top = -1; 
		size = 50;
		stack = new Person[size];
	}
	
	public PersonStack(int size) {
		
		top = -1;
		this.size = size; 
		stack = new Person[this.size];
	}
	
	public boolean push(Person person) {
		
		if(!isFull()) {

			top++;
			stack[top] = person;			
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		
		if(top == stack.length-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public Person pop() {
		
		if(!isEmpty()) {

			return stack[top--];
		}
		return null;
	}
}
