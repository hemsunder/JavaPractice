package Array;

public class TwoDArray {

	public static void main(String[] args) {
		
		//Example1:
		/*int num[][] = new int[2][3];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[1][0] = 40;
		num[1][1] = 50;
		num[1][2] = 60;*/
		
		//Example2:
		int[][] num = {{10,20,30}, {100,200,300}};
		
		//Example1 = Example2
		
		//int count = num.length;
		//System.out.println(count);
		//System.out.println("Numer is "+num[1][1]);
		
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[i].length;j++){
				System.out.println("Number is "+num[i][j]);
			}
		}
		

		String[][] names = {
							{"NAME1", "NAME2", "NAME3"}, 
							{"NAME4", "NAME5", "NAME6", "NAME7"}, 
							{"NAME8","NAME9", "NAME10", "NAME11", "NAME12"}
							};
		
		for(int k=0;k<names.length;k++){
			for(int l=0;l<names[k].length;l++){
				System.out.println("Name is "+names[k][l]);
			}
		}
		
		
	}

}
