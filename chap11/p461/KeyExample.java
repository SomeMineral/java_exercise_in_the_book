package p461;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// ho- HashMap...? 아직 잘 모르는 표현
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "gil-dong");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		System.out.println(value.hashCode());
	}
}
