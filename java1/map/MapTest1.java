import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("one", 1);
		map.put("two", 2);
		map.put("tree", 3);
		map.put("four", 4);

		map.put("one", 11);//key는 중복 불가능, vaule는 중복 가

		map.remove("four");

		Set<String> keys = map.keySet();//Map에 key는 set에 저장

		for (String key : keys) {
			System.out.print(map.get(key) + "  ");
		}
		System.out.println();

		Set<Entry<String, Integer>> entrys = map.entrySet();

		for (Entry<String, Integer> en : entrys) {
			System.out.println("key: " + en.getKey() + " Value: " + en.getValue());
		}


		if (map.containsKey("tree")) {
			System.out.println("키(key)는 존재합니다.");
		} else {
			System.out.println("키(key)는 존재하지 않습니다.");
		}
		if (map.containsValue(1)) {
			System.out.println("값(value)은 존재합니다.");
		} else {
			System.out.println("값(value)은 존재하지 않습니다.");
		}

	}
}
