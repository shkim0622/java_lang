import java.util.Vector;

public class vector1{
	public static void main(String[] args)  {
		Vector<Integer> V = new Vector<Integer>();
		V.add(3);
		V.add(null);
		V.add(1,10);
		System.out.println(V.size());
		System.out.println(V.capacity());
		System.out.println(V);
		
	}
}

