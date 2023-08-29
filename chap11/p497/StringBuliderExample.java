package p497;

public class StringBuliderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		System.out.println();
		
		sb.insert(4, "2"); // 교체 ㄴㄴ 삽입 ㅇㅇ
		System.out.println(sb.toString());
		System.out.println();
		
		sb.setCharAt(4, '6'); // char 1개 교체 ㅇㅇ
		System.out.println(sb.toString());
		System.out.println();
		
		sb.replace(6, 13, "Book"); // 범위 교체 ㅇㅇ 제한 없음
		System.out.println(sb.toString());
		System.out.println();
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		System.out.println();
		
		int length = sb.length();
		System.out.println("total number of characters: " + length);
		System.out.println();
		
		String result = sb.toString();
		System.out.println(result);
		System.out.println();
		
		
		sb.append(" + add");
		System.out.println(result);
		System.out.println(sb.toString());
		
	}
}
