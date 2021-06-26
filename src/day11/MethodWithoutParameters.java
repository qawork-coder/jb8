package day11;

public class MethodWithoutParameters {

	public void checkEligibility() {

		int age = 40;

		if (age >= 18) {
			System.out.println("eLigible");
		} else {
			System.out.println("Not eligible");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodWithoutParameters obj =new MethodWithoutParameters(); //For creation of Object
		obj.checkEligibility();
		
		
		
		
	}

}
