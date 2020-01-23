package JavaLogicQuestions;

public class SumOfDigits {

	public static int sum_of_digits(int num){
		
		int sum = 0;
		while(num!=0){
			int lastdigit = num%10;
			sum = sum+lastdigit;
			num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println(sum_of_digits(123456));

	}

}
