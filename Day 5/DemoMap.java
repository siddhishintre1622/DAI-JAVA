package day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		Map <String,Integer> map = new HashMap<>();
		
		map.put("one", 1);
		map.put("two",2);
		map.put("three", 3);
		
		System.out.println(map.get("two"));
		
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
		{
			System.out.println(key + "->" + map.get(key));
		}
		
	}

}
