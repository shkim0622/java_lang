public class indexexample	{
	public static void main(String[] args)	{
		String str = "java programing";

		int location = str.indexOf("programing");
		System.out.println(location);
		
		if(str.indexOf("java") != -1)	{ // 포함 된 경우 
		System.out.println("a java book");
		}
		else { //포함 되지 않은 경우
		System.out.println("not a java book");
		}

	}
}

