public class Data {
	int x ;

	public static void main (String[] args)  {
		Data  d = new Data();//객체 생성
         	d.x =10;//인스턴스 변수
          	System.out.println("main() : x ="  +d.x);
          
          	change(d.x);
          	System.out.println("After change(d.x)");
          	System.out.println("main() : x =" +d.x);
}
	static void change (int x) {  //기본형 매개 변수
     		x = 1000;
     		System.out.println("main() : x = "+ x);
   }
}

