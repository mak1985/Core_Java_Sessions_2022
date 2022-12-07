package session17;

public class WrapperClass {

	void m1()
	{
		
	}
	
	public static void main(String[] args) {
		
		int y;
		String str = "2000";
		
		y = Integer.parseInt(str); //Object to primitive type conversion
		System.out.println(y);
		
		double d;
		String str1 = "3.14";
		d=Double.parseDouble(str1);
		System.out.println(d); //Object to primitive type conversion
		
		Integer a = new Integer(10);
		System.out.println(a);
		
		int i = 10;
		Integer b = Integer.valueOf(i); //Primitive to Object conversion - Method used valueOf()
		Integer k=i;
		
		System.out.println(i + k);
		
	}

}
