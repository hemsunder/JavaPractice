package String;

public class StartsWithAndEndsWith {

	public static void main(String[] args) {
		
		
		String title1 = "Ala vaikuntapuram loo";
		String title2 = "Sarileru neekevvaru";
		
		boolean flag = title1.startsWith("Ala");
		System.out.println("The status is "+flag);
		
		boolean flagg = title2.endsWith("varu");
		System.out.println("The status is "+flagg);

	}

}
