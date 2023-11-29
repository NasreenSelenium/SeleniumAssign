package week1.assign1;

public class IsPrime {
	public static void main(String[] args) {
		  int i,n = 99;
		  boolean flag = false;
		  
		  for (i=2;i<=n-1;i++) {
			
			if(n%i == 0 ) {
				flag = true;
			}
			
		}
		  if(flag == false) {
			  System.out.println(n + " :is Prime");
		  }
		  if(flag == true) {
			  System.out.println(n + " :is not Prime");
		  }
	}

}
