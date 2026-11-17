package Daywise_classnotes;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Collections_Map {

	public static void main(String[] args) {
		//HashMap hm = new HashMap();
		LinkedHashMap hm = new LinkedHashMap();
		hm.put("name", "Jansi");
		hm.put("Age", 20);
		hm.put("rollnumber", "2105");
		hm.put("name", "newname");
		System.out.println(hm); //{name=newname, Age=20, rollnumber=2105}
		
		System.out.println(hm.keySet()); //returns set [name, Age, rollnumber]
		System.out.println(hm.values()); //returns value [newname, 20, 2105]

	}

}
