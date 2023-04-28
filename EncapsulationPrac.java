package ForPractiesAll.com;

public class EncapsulationPrac {
	
	private int rollno;
	private String name;
	
	
	   void setrollno(int r) {
		   rollno=r;
		   System.out.println("rollno is:"+rollno);
	   }
	   void setname(String nm) {
		   name=nm;
		   System.out.println("name is:"+name);
	   }
	   int getrollno() {
		   return rollno;
	   }
	   String getname() {
		   return name;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationPrac ep=new EncapsulationPrac();
		ep.setrollno(25);
		ep.setname("vinod");
	    ep.setname("ravi");
	    ep.setrollno(26);
		
	    
	    ep.getrollno();
	    ep.getname();
		

	}

}
