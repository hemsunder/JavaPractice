package JavaConcepts;

public class TypeCasting {
	
	
	public static void wideningcasting(){
		
		int num = 10;
		double mydouble = num;
		
		System.out.println(num);
		System.out.println(mydouble);
		
	}
	
	public static void narrowingcasting(){
		
		double mydouble = 10.53;
		int num = (int)mydouble;
		
		System.out.println(num);
		
	}

	public static void main(String[] args) {
		narrowingcasting();
		

	}

}
