package Encapsulation;

import java.util.Scanner;

public class Person {

	private String name = "Common name";
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String updatedName){
		this.name = updatedName;
		
	}
	
	
	public static void main(String[] args){
		
		Person obj = new Person();
		System.out.println(obj.name);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		String str = scan.nextLine();
		System.out.println("Name is "+str);
	}
	

}
