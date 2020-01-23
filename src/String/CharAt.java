package String;

public class CharAt {

	public static void main(String[] args) {
		
		String name = "Gundrathi Hemsunder Goud";
		String updatedname = name.toUpperCase();
		
		char ch = name.charAt(10);
		//System.out.println(ch);
		
		//System.out.println(name.charAt(15));
		
		int count = name.length();
		//System.out.println("Total characters are "+count);
		
		for(int i=0;i<count;i++){
			System.out.println(updatedname.charAt(i));
		}

	}

}
