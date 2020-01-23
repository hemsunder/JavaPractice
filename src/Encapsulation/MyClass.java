package Encapsulation;

public class MyClass {

	public static void main(String[] args) {
		
		Person per = new Person();
		//System.out.println(per.name);  		//error
		System.out.println(per.getName());
		per.setName("Hemsunder");
		System.out.println(per.getName());

	}

}
