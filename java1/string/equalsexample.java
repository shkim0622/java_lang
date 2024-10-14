public class equalsexample	{
	public static void main(String[] args)	{
		String str1 = new String("name");
		String str2= "name";

		if(str1== str2)	{
			System.out.println("같은 String 객체를 참조");
		} 
		else {
			System.out.println("다른 String 객체를 참조");
		}
	
		if(str1.equals(str2))	{
			System.out.println("같은 String 객체를 참조");
		} 
		else {
			System.out.println("다른 String 객체를 참조");
		}
	}
}

