package parmar;

public class InterfaceExample {
	
	Example obj=(a,b)->{
		
		return a+b;
	};
	public int sum(int a,int b)
	{
		return obj.getsum(a, b);
	}

}
