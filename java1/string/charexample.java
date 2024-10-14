public class charexample	{
	public static void main(String[] args)	{
		String ssn = "012345-123456";
		
		char gender = ssn.charAt(7);

		switch(gender)	{
			case '1':
			case '3':
				System.out.println("남자 입니다.");	
				break;
			case '2':
			case '4':
				System.out.println("여자  입니다.");	
				break;
		}
	}

}

