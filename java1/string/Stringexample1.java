public class Stringexample1	{
	public static void main (String[] args)	{

		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};//ASCII
		
		String str1 = new String (bytes);
		System.out.println(str1);
		
		String str2 = new String (bytes,6,4);//byte,int offset,int length
		System.out.println(str2);
	}
}

