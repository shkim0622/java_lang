public class member	{
	public String id;

	public member(String id) {
		this.id = id;
	}
	public boolean equals(Object ob)	{
		// 객체 istanceof 클래스
		// 클래스 안에 객체 맞는지 확인
		if (ob instanceof member)	{
		// ob를 mem으로 타입 변환
		member mem = (member) ob;
			if(id.equals(mem.id))	{
				return true;
			}
		}		
		return false;
	}		
}
