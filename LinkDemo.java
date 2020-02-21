
package cog.cognizant;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add("Hello");
		list.add("To");
		list.add("Bla");
		list.add("Java");
		list.add("Batch");
		list.add(001);
		list.add(true);
		list.addFirst("Start");
		list.addLast("End");
	ListIterator<String> it = list.listIterator();	
	System.out.println("************Forward Direction*******");
	while(it.hasNext()) {
		String element = it.next();
		System.out.println(element);
		if(element.equals("Java")) {
			break;
		}
	}
	System.out.println("************Backward Direction*******");
	while(it.hasPrevious()) {
		String element = it.previous();
		System.out.println(element);
		
	}
	System.out.println(list);
	list.remove(3);
	list.add(3,"YAAHOOO");
	System.out.println("List contains Python ? :"+list.contains("Python"));
	for(Object obj  : list ) {
		System.out.println(obj);
	
	}
	}

}

	