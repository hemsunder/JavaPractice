package Map;

import java.util.Map;

public class HashMapForLoop {

	public static void main(String[] args) {
		
		java.util.HashMap<String, String> map = new java.util.HashMap<String, String>();
		map.put("candname1", "hemsunder");
		map.put("candname2", "durga");
		map.put("Compname1", "Pega");
		map.put("Compname2", "ZenQ");
		
		for(Map.Entry<String, String> data:map.entrySet()){
			//System.out.println(data);
			System.out.println("The key is "+data.getKey()+" and the value is "+data.getValue());
		}
		
		
	}

}
