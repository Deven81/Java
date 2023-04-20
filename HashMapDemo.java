package Com.Ses1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>hm=new HashMap<>();
		
		
		hm.put(1, "Ravi");
		hm.put(2, "Shankar");
		hm.put(3,"John");
		hm.put(4, "Rohan");
		hm.put(44, "Ganu");
		hm.put(5,"Lisa" );
		hm.put(9, null);
		
		for(Map.Entry<Integer, String>hmm:hm.entrySet()) {
			System.out.println("key is:"+hmm.getKey()+"value is:"+hmm.getValue());
			
			
		}
		

	}

}
