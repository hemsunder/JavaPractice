package JavaConcepts;

public class LocalVsGlobalVariables {
	
	static String namee = "AA";
	String name = "Hemsunder";
	int age = 28;

	public static void main(String[] args) {
		
		int k = 25;
		System.out.println(k);
		System.out.println(namee);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		

	}
	
	public void sum(){
		int i = 10;
		int j = 20;
		String name = "Durga";
	}

}
