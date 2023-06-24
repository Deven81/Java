package Com;

public class ImpFactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=10;                //5= 1*2*3*4*5=120
		int fact=1;               //10=1*2*3*4*5*6*7*8*9
		                          // if you give fact=2 then means total value x2
		for(int i=1;i<=10;i++) {
			fact= fact*i;
		}
		System.out.println(fact);

	}

}
