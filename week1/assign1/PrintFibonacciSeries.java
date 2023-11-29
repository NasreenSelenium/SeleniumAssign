package week1.assign1;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		for (int i = 1; i < 8; i++) {
   			c=a+b;
			a=b;
			b=c;
			System.out.println("c: "+c);	

		}
		
	}

}
