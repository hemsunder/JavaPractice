package String;

public class Split {

	public static void main(String[] args) {
		
		String technologies = "Selenium-Java-Python-Git-TestNG-Cucumber-Pydev-Pycharm";
		String []techs = technologies.split("-");
		System.out.println(techs[0]);
		for(int i=0;i<techs.length;i++){
			System.out.println("Value of "+i+" is "+techs[i]);
			if (techs[i].contains("Git")){}
			System.out.println("Test case got passed");
			break;
		}

	}

}
