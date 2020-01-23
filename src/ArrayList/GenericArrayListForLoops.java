package ArrayList;

import java.util.ArrayList;

public class GenericArrayListForLoops {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Selenium");
		al.add("Hemsunder");
		al.add("100");
		al.add("12.55");
		
		//Normal For Loop
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		
		//Enhanced For Loop
		
		for(String str:al){
			System.out.println(str);
		}

	}

}
