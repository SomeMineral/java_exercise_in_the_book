package p497;

import java.io.IOException; //헐.

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];
		
		System.out.print("input: ");
		int readByteNo = System.in.read(bytes); // 저장도 하고 마지막엔 개수도 뱉고?
		
		String str = new String(bytes, 0, readByteNo-2); // 이거 windows라서 -2를 추가한 거고 linux에선 없는 게 아닐..까? \r...
		System.out.println(str);
	}
}
