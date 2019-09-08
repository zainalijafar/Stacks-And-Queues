
public class Main {

	public static void main(String[]args) {
	
		PersonQueue q = new PersonQueue();
		
		Person p1 = new Person("Zain","1");
		Person p2 = new Person("Safder","2");
		
		q.enqueue(p1);
		q.enqueue(p2);
		
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
		
		q.showAll();
		
/*		Queue q = new Queue();
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		
		q.showAll();
		
		
		
/*		PersonStack ps = new PersonStack();
		
		Person p1 = new Person("Zain","1");
		Person p2 = new Person("Safder","2");
		
		ps.push(p1);
		ps.push(p2);
		
		System.out.println(ps.pop());
		System.out.println(ps.pop());
		System.out.println(ps.pop());
		System.out.println(ps.pop());
		
		
		
/*		Stack stack = new Stack();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop()); */
		
	}
}
