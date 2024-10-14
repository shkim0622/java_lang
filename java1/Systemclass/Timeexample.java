public class Timeexample	{
	public static void main (String[] args)	{
		//long time1 = System.nanoTime();
		long time1 = System.currentTimeMillis();
		
		int sum=0;

		for (int i = 0; i<=1000000000; i++)	{
			sum += i;
		}
		//long time2 = System.nanoTime();
		long time2 = System.currentTimeMillis();
		System.out.println("time2 - time1 : "+(time2-time1));

	}
}
