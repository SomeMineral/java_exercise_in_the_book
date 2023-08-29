package p544;

import java.text.MessageFormat;

public class MessageFormatExample {
	public static void main(String[] args) {
		String id = "java";
		String name = "newbie";
		String tel = "010-0000-0000";
		
		String text = " member ID: {0}\n member name: {1}\n member phone number: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values( {0}, {1}, {2} )";
		Object[] arguments = {  id, name, tel };
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
