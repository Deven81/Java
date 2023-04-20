package Com.Ses1;

import java.util.Map;
import java.util.Map.Entry;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	java.util.TreeMap<Integer, String>tm=new java.util.TreeMap<>();
	     tm.put(1, "lokesh");
	     tm.put(20, "Rahul");
	     tm.put(3, "Puran");
	     tm.put(44, "Elvish");
	     tm.put(5, null);
		
	     for(Map.Entry<Integer, String>hmm:tm.entrySet()) {
	    	 System.out.println("key is:"+hmm.getKey()+"value is:"+hmm.getValue());
		
		}
		

	}

}
