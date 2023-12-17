package nov16;

public class Sample {

	public static void addition(int x, int y)
	{
		int z=x+y;
		System.out.println(z);
	}

	public static String verify_String(String str1,String str2)
	{
		String res ="";
		if(str1.equalsIgnoreCase(str2))
		{
			res = "String are Equal";
		}
		else
		{
			res = "String are not Equal";
		}
		return res;
	}


	public static boolean comparevalue(int a, int b) 
	{
		if(a==b)
		{
			return true;
		}else
		{
			return false;

		}
	}
	public static void main(String[] args)

	{
		Sample.addition(1223,585);
		String res =Sample.verify_String("Hello", "hello");
		System.out.println(res);
		boolean x =Sample.comparevalue(100,100);
		System.out.println(x);


	}




}



