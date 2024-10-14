public class Variables {
   int num1; //인스턴스 변수
   static int num2; //클래스 변수

   public void printName(String name) {
      String prtMsg = name; // 지역변수  
       System.out.println(prtMsg);
    }
}
public static void main(String[] args) {
    Variables mc = new Variables();// 객체 생성

    mc.num1 = 100; //인스턴스 변수 사용
    Variables.num2 = 50; // 클래스 변수 

    mc.printName("홍길동");    
    System.out.printf("%d,%d",mc.num1, Variables.num2);
    }

