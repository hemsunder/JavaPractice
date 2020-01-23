package JavaConcepts;

public class ConstructorDemo {
	
	int x;
	
	public ConstructorDemo(int y){
		x = y;
	}
	

	public static void main(String[] args) {
		
		ConstructorDemo demo = new ConstructorDemo(500);
		System.out.println(demo.x);
		
	}

}
