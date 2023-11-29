package week2.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] num = {2,5,7,7,5,9,2,3};
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println("sorted array: "+ num[i]);
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if ((num[i]) == num[j]) {
					System.out.print("Duplicate numbers are "+ num[i] + ",");	
					
				}
				
			}
			
		}
		
		
	}
}
	

