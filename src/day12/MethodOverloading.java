package day12;

public class MethodOverloading {
	
	
	public void sum()
	{
		System.out.println("sum method");
	}

	
	public void sum(int a)
	{
		System.out.println(a);
	}
	
	public void sum(double a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj=new MethodOverloading();
		obj.sum(10);
		obj.sum(2.2);
		obj.sum();
		
	}

}
