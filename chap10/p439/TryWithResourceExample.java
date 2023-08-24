package p439;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("exception code has been executed");
		}
	}
}

/// ?????????????????????????????????