package Com.Ses1;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String>ht=new Hashtable<>();
		ht.put(11,"Viren");
		ht.put(22,"Rahul");
		ht.put(33,"Madhu");
		ht.put(44,"Minal");
		ht.put(55,"Tanveer");
		ht.put(66,"  ");
		
		for(Map.Entry<Integer, String>hm:ht.entrySet()) {
			System.out.println("key is:"+hm.getKey()+"value is:"+hm.getValue());
		}
		

	}

}
