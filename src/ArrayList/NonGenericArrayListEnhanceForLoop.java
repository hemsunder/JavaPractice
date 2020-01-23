package ArrayList;

import java.util.ArrayList;

public class NonGenericArrayListEnhanceForLoop {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(1234);
		al.add('H');
		al.add("Selenium WebDriver");
		al.add(12.50);
		
		for(Object ob:al){
			System.out.println("Object is "+ob);
		}
		
	}

}
