
public class Queue {

	private int [] queue; 
	private int total; 
	private int front; 
	private int rear; 
	private int size;
	
	public Queue() {
		
		total = 0;
		front = 0; 
		rear = 0;
		size = 50;
		queue = new int [size];
	}
	
	public Queue(int size) {
		total = 0;
		front = 0;
		rear = 0;
		this.size = size;
		queue = new int[this.size];
	}
	
	public boolean isFull() {
		
		if(total == size) {
			return true;
		}
		return false;
	}
	
	public boolean enqueue(int a) {
		
		if(!isFull()) {
			total ++ ;
			queue[rear] = a;
			rear = (rear + 1) % size;
			return true;
		}
		return false;
	}
	
	public int dequeue() {
		
		int item = queue[front];
		total --;
		front = (front + 1) % size;
		
		return item;
	}
	
	public void showAll() {
		
		int front = 0;
		
		if(total !=0) {
			
			for(int i=0; i<total; i++) {
				System.out.println(" " + queue[front]);
				front = (front + 1) % size;
			}
		}
	}
	
}