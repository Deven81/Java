package Com.Ses1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String>lm=new LinkedHashMap<>();
		lm.put(1, "suresh");
		lm.put(2,"Ramesh");
		lm.put(3,"Ram");
		lm.put(4,"Laxman");
		lm.put(55,"Vihan");
		lm.put(6,"Loki");
		lm.put(66,null);
		
		for(Map.Entry<Integer, String>mm:lm.entrySet()) {
			System.out.println("key is:"+mm.getKey()+"value :"+mm.getValue());
		}

	}

}
