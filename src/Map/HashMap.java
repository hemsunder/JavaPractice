package Map;

public class HashMap {

	public static void main(String[] args) {
		
		java.util.HashMap<String, String> map = new java.util.HashMap<String, String>();
		map.put("candname1", "hemsunder");
		map.put("candname2", "durga");
		map.put("Compname1", "Pega");
		map.put("Compname2", "ZenQ");
		
		System.out.println(map);
		
		String value = map.get("Compname1");
		System.out.println("The value is "+value);
		
		
	}

}
