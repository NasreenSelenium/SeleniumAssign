package week2.day3;

public class PrintCountofCharacter {

	public static void main(String[] args) {
		String input = "Testleaf";
		int count = 0;
		//convert string to chararray
		char[] ch = input.toCharArray();
		int len = ch.length;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]== 'e') {
				count++;
			}
		}
     System.out.println("Count of e:" + count);
	}

}
