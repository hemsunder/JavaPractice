package ArrayList;

import java.util.ArrayList;

public class NonGenericArrayList {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(1234);
		al.add('H');
		al.add("Selenium WebDriver");
		al.add(12.50);
		
		System.out.println(al.get(2));
		System.out.println(al);

	}

}
