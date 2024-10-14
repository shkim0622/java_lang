public class memberexample	{
	public static void main(String[] args)	{

		member obj1 = new member("blue");
		member obj2 = new member("blue");

		if(obj1.equals(obj2))	{
			System.out.println("ob1=obj2");

		}
		else	{
			System.out.println("ob1!=obj2");
		}		
	}
}

