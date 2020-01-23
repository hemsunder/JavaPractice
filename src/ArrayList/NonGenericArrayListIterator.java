package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGenericArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(1234);
		al.add('H');
		al.add("Selenium WebDriver");
		al.add(12.50);
		
		Iterator it = al.iterator();
		
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println("Object is "+obj);
		}

	}

}
