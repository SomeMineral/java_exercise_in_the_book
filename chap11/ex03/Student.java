package ex03;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	// Ah.. 두 번 평가하는구나
	// hashCode() 통과하면 equals()도 심사하는구나
	

	// 책 앞쪽 예제 그대로 받아적자.. 후
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if (studentNum.equals(student.studentNum)) {
				return true;
			}
		}
		return false;
	}

	
	// 문제에서 hashCode의 return은 studentNum의 hashCode를 쓰라고 선언하셨..
	@Override
	public int hashCode() {
		return studentNum.hashCode(); // 필드 값의 hashCode면 이렇게 쓰면 되겠..지?
	}
}
