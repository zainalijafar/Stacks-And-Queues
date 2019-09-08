
public class PersonQueue {

	private int total; 
	private int size; 
	private int front; 
	private int rear; 
	private Person[] queue;
	
	public PersonQueue() {
	
		total = 0;
		size = 50;
		front = 0;
		rear = 0;
		queue = new Person[size];
				
	}
	
	public PersonQueue(int size) {
		
		total = 0;
		this.size = size;
		front = 0;
		rear = 0;
		queue = new Person[this.size];
	}
	
	public boolean enqueue(Person p) {
		
		if(!isFull()) {
			queue[rear] = p;
			rear = (rear + 1) % size; 
			total++;
			return true;
		}
		return false;
	}
	
	public Person dequeue() {
		
		Person item = queue[front];
		front = (front + 1) % size; 
		total --;
		return item;
	}
	
	public boolean isFull() {
		
		if(total == size) {
			return true;
		}
		return false;
	}
	
	public void showAll() {
		
		int front = 0;
		
		for(int i=0; i<total; i++) {
			
			System.out.println("Person : " + queue[front] );
			front = (front + 1) % size;
		}
	}
}