package Array;

public class SingleArray {

	public static void main(String[] args) {
		
		/*int num[] = new int[5];
		num[0] = 10;
		num[1] = 12;
		num[2] = 14;
		num[3] = 16;
		num[4] = 18;*/
		
		int[] num = {10,12,14,16,18};
		
		System.out.println(num);
		System.out.println("Number is "+num[3]);
		System.out.println("Num is "+num[0]);
		
		int count = num.length;
		System.out.println("Total numbers are "+count);
		
		for(int i=0;i<count;i++){
			System.out.print(num[i]+",");
		}

		//System.out.print("Array is "+num);
		
		String names[] = new String[2];
		names[0] = "Hemsunder";
		names[1] = "Durga";
		int countt = names.length;
		System.out.println("\nTotal names are "+countt);
		
		for(int j=0;j<countt;j++){
			System.out.println("Name is "+names[j]);
		}
	}

}
