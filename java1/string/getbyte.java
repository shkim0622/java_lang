public class getbyte	{
	public static void main(String[] args)	{
		String str = "hello";

		byte[] bytes = str.getBytes();
		System.out.println ("bytes.length :  " +bytes.length);

		String str = new String(bytes);
		System.out.println ("bytes -> String:  " + str);
		}
}


