package ForPractiesAll.com;

public class ConstructorDemoPrac {
	
	int rollno;
	String name;
	double age;
	String collegeName;
	
	  ConstructorDemoPrac() {
		  collegeName="Sinhgad";
	  }
	  
	  ConstructorDemoPrac(int r,String nm,double ag) {
		  rollno=r;
		  name=nm;
		  age=ag;
		  System.out.println("rollno is:"+rollno);
		  System.out.println("name is:"+name);
		  System.out.println("age is:"+age);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemoPrac cd=new ConstructorDemoPrac();
		System.out.println("college Name="+cd.collegeName);
		
		ConstructorDemoPrac cd1=new ConstructorDemoPrac();
		System.out.println("defualt value");
		System.out.println("for int:"+cd.rollno);
		System.out.println("for String:"+cd.name);
		System.out.println("for double:"+cd.age);
		
		ConstructorDemoPrac cd2=new ConstructorDemoPrac(18,"Shiva",25);
		

	}

}
