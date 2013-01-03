package IOUtil;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;


public class TestPriorityQueue {
	public static void testPriorityQueue(){
		//testAdd();
		//testClear();
		//testComparator();
		//testIterator();
		//testPeek();
		//testPoll();
		testRemove();
	}
	
	private static void testAdd(){
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<10;i++){
			pq.add(i);
		}
		System.out.println("priority queue values are"+pq);
	}
	
	private static void testClear(){
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		
		for(int i=0;i<10;i++){
			pq.add(new Integer(i));
		}
		System.out.println("priority queue value are:"+pq);
		pq.clear();
		System.out.println("priority queue values after clear"+pq);
	}
	
	private static void testComparator(){
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		
		pq.add(6);
		pq.add(9);
		pq.add(5);
		
		System.out.println("priority queue values are"+pq);
		
		Comparator comp=pq.comparator();
		System.out.println("comparator value is"+comp);
	}
	
	private static void testIterator(){
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<10;i++){
			pq.add(new Integer(i));
		}
		
		Iterator<Integer> it=pq.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	
	private static void testPeek(){
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=3;i<10;i++){
			pq.add(new Integer(i));
		}
		
		Integer head=pq.peek();
		System.out.println(head);
		System.out.println(pq);
	}
	
	public static void testPoll(){
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		for(int i=3;i<10;i++){
			pq.add(new Integer(i));
		}
		
		Integer head=pq.poll();
		System.out.println(head);
		System.out.println(pq);
	}
	
	public static void testRemove(){
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		for(int i=3;i<10;i++){
			pq.add(new Integer(i));
		}
		
		boolean isremoved=pq.remove(48);
		System.out.println(isremoved);
		System.out.println(pq);
		
	}
}
