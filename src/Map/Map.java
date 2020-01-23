package Map;

public class Map {

	public static void main(String[] args) {
		
		
		//int a=10,b=20, c=30,d=40;
		
		java.util.Map<String, String> map = new java.util.HashMap<String, String>();
		map.put("candname1", "hemsunder");
		map.put("candname2", "durga");
		map.put("Compname1", "Pega");
		map.put("Compname2", "ZenQ");
		
		for(java.util.Map.Entry<String, String> data:map.entrySet()){
			//System.out.println(data);
			System.out.println("The key is "+data.getKey()+" and the value is "+data.getValue());
		}
		
		
	}

}
