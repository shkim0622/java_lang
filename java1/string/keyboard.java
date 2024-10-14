public class keyboard {
	public static void main(String[] args) throws Exception	{
		byte[] bytes = new byte[100];

		System.out.print("입력 : ");

		int readbyte = System.in.read(bytes);

		String str = new String(bytes,0,readbyte-1);//배열을 문자열로 변환	
		System.out.println(str);
	}
}

