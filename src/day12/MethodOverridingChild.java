package day12;

public class MethodOverridingChild extends MethodOverridingBase{

	public void name()
	{
		System.out.println(" i m a child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverridingChild obj=new MethodOverridingChild();
		obj.name();
	}

}
