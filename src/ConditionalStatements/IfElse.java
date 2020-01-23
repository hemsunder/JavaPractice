package ConditionalStatements;

public class IfElse {

	public static void main(String[] args) {
		
		
		String browser = "IE";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Test case has to be executed in chrome browser");
		}
		
		
		else {
			System.out.println("Please provide browser name");
		}

	}

}
