package JavaConcepts;

public class BreakDemo {

	public static void main(String[] args) {
		
		//for loop with break
		
		/*for(int i=0;i<5;i++){
			if(i==3){
				break;
			}
			System.out.println(i);
		}*/
		
		//while loop + break
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		}

	}

}
