package ArrayList;

import java.util.ArrayList;

public class NonGenericArrayListForLoop {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(1234);
		al.add('H');
		al.add("Selenium WebDriver");
		al.add(12.50);
		
		for(int i=0;i<al.size();i++){
			System.out.println(" Object is "+al.get(i));
		}

	}

}
