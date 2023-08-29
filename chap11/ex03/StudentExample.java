package ex03;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		
		// create HashMap object which saves total point using Student key ?
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		// save point 95 of new Student("1")
		hashMap.put(new Student("1"), "95");
		
		// load point of new Student("1")
		String score = hashMap.get(new Student("1")); // 동등하게 판단하도록 설정을 해야함.. 흑흑.
		System.out.println("total point of Student 1: " + score);
	}
}
