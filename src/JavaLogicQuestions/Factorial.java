package JavaLogicQuestions;

public class Factorial {

	public static int factorial(int num){
		
		int fact = 1;
		if(num==0){
			return 1;
		}
		
		else{
			
			for(int i=1;i<=num;i++){
				fact = fact*i;
				System.out.println(fact);
			}
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}

}
