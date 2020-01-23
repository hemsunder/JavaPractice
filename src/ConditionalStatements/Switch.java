package ConditionalStatements;

public class Switch {


	public static void main(String[] args) {
		
		String name = "Hemsunderr";
		
		switch(name){
		
		case "Hemsunder":
			System.out.println("QA can do Automation testing and manual testing as well");
			break;
			
		case "Durga":
			System.out.println("QA Can do only manual testing");
			break;
			
		case "Ramana":
			System.out.println("Can shift the load to lorry");
			break;
			
		default:
			System.out.println("Search for good employee");
		}

	}

}
