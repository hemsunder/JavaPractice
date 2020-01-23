package ConditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		
		String browser = "IEE";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Test case has to be executed in chrome browser");
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			System.out.println("Test case has to execute in Firefox browser");
		}
		
		else if(browser.equalsIgnoreCase("ie")){
			System.out.println("Test case has to execute in IE browser");
		}
		
		else {
			System.out.println("Please provide browser name");
		}

	}

	}


