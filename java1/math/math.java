public class math	{
	
	public static void main(String[] args) {
        	System.out.println("abs(10.6) :" + Math.abs(-10.6)); // 절대값
        	System.out.println("ceil(10.3) : " + Math.ceil(10.3));//값을 받아 가까운 큰 정수
      		System.out.println("floor(10.3) : " + Math.floor(10.3));//값을 받아 가까운 작은 정수
       		System.out.println("max(3, 5) : " + Math.max(3, 5)); //큰 값
        	System.out.println("min(3, 5) : " + Math.min(3, 5)); // 작은 값
        	System.out.println("random() : " + Math.random());// 0~1.0에서 랜덤	
		System.out.println("round(10.56) : " + Math.round(10.56));// 소수 첫번째 자리에서 반올림
        	System.out.println("rint(10.3) : " + Math.rint(10.3));//가까운 정수값으로 리턴
    }
}
