class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class example {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        Person p2 = new Person("홍길동");

        // 객체 인스턴스마다 각기 다른 주해시코드(주소))를 가지고 있다.
        System.out.println(p1.hashCode()); // 622488023
        System.out.println(p2.hashCode()); // 1933863327
    }
}
