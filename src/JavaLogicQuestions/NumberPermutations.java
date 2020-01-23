package JavaLogicQuestions;

public class NumberPermutations {
	
	public static int countdigits(int N){
		int count=0;
		while(N>0){
			N=N/10;	
			count++;
		}
		return count;
	}

	public static void permutate(int N){
		int num= N;
		int count = countdigits(N);
		while(true){
			System.out.println(num);
			int lastdigit = num%10;
			int startdigits = num/10;
			num = (int) ((Math.pow(10, count-1))*lastdigit+startdigits);	
			if(num == N){
				break;
			}
		}
	}

	public static void main(String[] args) {
		int N=123456;
		permutate(N);
	}
}
