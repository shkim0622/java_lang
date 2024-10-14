import java.util.ArrayList;

public class list	{
	public static void main(String[] args)	{

	ArrayList<String> names = new ArrayList<String>();
	names.add("kim");
	names.add("lee");
	names.add("park");
	names.add("hong");
	names.add("no");
	names.add("yu");
	names.add("su");

	for(int i = 0; i<names.size(); i++){

	System.out.println(names.get(i));

		}
	}	
}
