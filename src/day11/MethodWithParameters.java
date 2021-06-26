package day11;

public class MethodWithParameters {

	public void checkEligibility(int age) {

		//int age = 40;

		if (age >= 18) {
			System.out.println("eLigible");
		} else {
			System.out.println("Not eligible");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithParameters obj = new MethodWithParameters(); // For creation of Object
		obj.checkEligibility(20);
	}

}
