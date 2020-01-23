package JavaConcepts;

public class ContinueDemo {

	public static void main(String[] args) {
		
		//for loop with continue
		
		/*for(int i=0;i<10;i++){
			if(i==3){
				continue;
			}
			System.out.println(i);
		}*/
		
		//while loop + continue
		
		int i = 0;
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		}

	}


	}


