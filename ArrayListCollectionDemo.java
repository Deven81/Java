package ForPractiesAll.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> studlist=new ArrayList<>();
		studlist.add(10);
		studlist.add(20);
		studlist.add(30);
		studlist.add(40);
		
		
		// collection methods
		System.out.println("tellme the collection of studlist:"+studlist.size());
		System.out.println("check any empty collection:"+studlist.isEmpty());
		studlist.clear();
		System.out.println("check the available collection:"+studlist.size());
		System.out.println("check any empty collection:"+studlist.isEmpty());
		
		
		
		
		    // for each Method 
		    for(int i:studlist) {        
			System.out.println(i);
			
			// collection iterator 
			Iterator<Integer>itr=studlist.iterator(); 
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
				
		   // List Iterator
		   ListIterator<Integer>itrr=studlist.listIterator(); 
		   while(itrr.hasNext()) {
			   System.out.println(itrr.next());
		   }
		   
		   System.out.println("*************");
		   
		   while(itrr.hasPrevious()) {
			   System.out.println(itrr.previous());
		   }
			}
		}
		

	}

}
