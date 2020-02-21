package cog.cognizant;
import java.util.Map.Entry;
import java.util.TreeMap;


public class MapTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Banana",35);
		map.put("Orange",60);
		map.put("Mango",110);
	//	map.put("Grapes",200);
		map.put("Water Melon",20);
		map.put("Banana",70);
		//map.put(null,0);
		map.put("Water",null);
		System.out.println(map);
	//	System.out.println(map.get("Grapes"));
	//	map.remove("Orange");
	//	System.out.println(map);
		// System.out.println(map.containsKey("Grapes"));
	
for (Entry<String, Integer> entry : map.entrySet()) {
//	System.out.println(entry.getKey());
//	System.out.println(entry.getValue());
	System.out.println(entry.getKey()+" --->" +entry.getValue());
}
	}

}
