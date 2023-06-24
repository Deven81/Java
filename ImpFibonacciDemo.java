package Com;

public class ImpFibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                    
		   int a=0;                  // in Fibonacci series always starts with 0 
		   int b=1;                   // fix veriable are 0 & 1 then it add 0+1=1,
		                              // addition like 0 1 1 2 3 5 8 13 21 
		   int count=10;
		   int c;
		   
		   System.out.print(a+" "+b);
		   
		   for(int i=2;i<count;i++) {
			   
			   c=a+b;
			   System.out.print(" "+c);
			   a=b;
			   b=c;
		   }
	}

}
