package week2.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// intantiation
		int[] nums = new int[5];
		String[] names = new String[2];
		
		names[0] = "acbahdk";
		names[1] = "sheik";
		
		
		
		nums[0]=11;
		nums[1]=12;
		nums[3]=13;
		nums[4]=10;
		nums[2]=15;
		System.out.println(nums.length);
		System.out.println(nums[3]);
		System.out.println(names[1]);
		//using literals
		String[] companyName = {"testlaef","cts","infosys"};
		System.out.println(companyName[2]);
		int length = companyName.length;
		System.out.println(length);
		System.out.println(companyName.length);
		Arrays.sort(companyName);
		for (int i = 0; i < companyName.length; i++) {
			System.out.println(companyName[i]);
		}
	}

}
