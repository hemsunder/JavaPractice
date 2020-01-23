package JavaLogicQuestions;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num){
		
		if(num<2){
			return false;
		}
		
		for (int i=2;i<num;i++){
			if(num % i ==0){
				return false;
			}
		}
		return true;
		
	}
	
	public static void getprimenumbers(int num){
		for(int i=2;i<=num; i++){
			if(isPrimeNumber(i)){
				System.out.println(i+ "   ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		isPrimeNumber(9);
		getprimenumbers(9);
	}

}
