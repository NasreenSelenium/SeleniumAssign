package wwek7.day1;

public class LearnConstructor {
	int empId;
	String empName;
	boolean isWorking;
	
	public LearnConstructor() {
		System.out.println("Default Constructor");
	}
	public LearnConstructor(int empId) {
		this.empId = empId;
		System.out.println("One Parameterized  Constructor");
	}
	public LearnConstructor(int empId,String empName) {
		System.out.println("Two Parameterized  Constructor");
	}
	public static void main(String[] args) {
		LearnConstructor obj = new LearnConstructor(1105);
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.isWorking);
		
	}

}
