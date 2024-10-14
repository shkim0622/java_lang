import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class list2 {

	public static void main(String[] args) {

		// ArrayList 생성
		List<Integer> list = new ArrayList<>();

		Random ran = new Random();
		for (int i = 0; i < 5; i++) {
			list.add(ran.nextInt(30) + 1); 
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();

		list.add(3, 35);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();

		list.set(0, 40);
		System.out.println("삭제 전 lsit 크기: " + list.size());

		list.remove(4);
		System.out.println("삭제 후 list 크기: " + list.size());

		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		}

	}

