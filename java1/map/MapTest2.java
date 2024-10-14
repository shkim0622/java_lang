import java.util.Map;
import java.util.HashMap;

public class MapTest2	{

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // Map 선언
		
		map.put("red", 450);
		map.put("blue", 4800); // Map 안에 값 넣기
        	// Map의 Key는 중복 불가, 동일한 Key에 다른 값을 넣을 경우 최근에 넣은 값 적용
		map.put("blue", 1350);
		
           	// Key를 사용하여 Map 안의 값 가져오기
		System.out.println("Map Value : " + map.get("blue")); 
		
		System.out.println("Map size : " + map.size()); // 맵 크기 확인
		
		map.replace("blue", 450); // Key 값의 내용을 변경
		System.out.println("blue Value : " + map.get("blue")); 
		
        	// Key가 존재하는지 확인
		System.out.println("Key Exist : " + map.containsKey("blue"));
		// Value가 존재하는지 확인
       		System.out.println("Value Exist : " + map.containsValue(450));
		
		System.out.println("Map Empty : " + map.isEmpty()); // 비어있는 지 확인
		
		map.remove("blue"); // key에 해당하는 값 삭제
		map.put(null, 150);
		map.put("blue", 450);
		
		System.out.println("Key가 있으면 Value 없으면 default : " + map.getOrDefault("white", 6300));
		
		// Key가 없거나 Value가 null일 때만 삽입
		map.putIfAbsent("purple", 6300); // key 가 존재 하지 않음
		map.putIfAbsent("blue", 6300); //key와 Value 값  존재
		System.out.println("Key가 없거나 Value가 null일 때만 삽입 : " + map.get("purple"));
		System.out.println("Key가 없거나 Value가 null일 때만 삽입 : " + map.get("blue"));
	}
}
