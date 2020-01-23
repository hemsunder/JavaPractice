package String;

public class Contains {

	public static void main(String[] args) {
		
		String song = "aatu potu gunde maatullona daagena";
		boolean flag = song.contains("daagena");
		System.out.println("Is it exists? "+flag);
		
		String expected = "Selenium&Java";
		String actual = "Selenium&Python";
		
		boolean flagg = expected.contains(actual);
		System.out.println("Are requirements matching?? "+flagg);
	}

}
