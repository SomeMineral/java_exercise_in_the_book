package p487;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println("os name: " + osName);
		System.out.println("user name: " + userName);
		System.out.println("user home: " + userHome);
		System.out.println("-----------------------------------------");
		System.out.println(" [ key ]  value ");
		System.out.println("-----------------------------------------");
		
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println(" [ " + key + " ]  " + value + " ");
		}
		
		
		for (Object objKey : keys) {
			System.out.println(objKey.getClass().getName());
			break;
		}
		
		//hmm... for loop 작성할 때 처음부터 Object가 아니라 String으로 하는 게 낫지 않았을까...
	}
}
