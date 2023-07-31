package example;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println(oldStrArray[0] == newStrArray[0]);
		oldStrArray[0] = "haha!";
		System.out.println(oldStrArray[0] == newStrArray[0]);
		
		
		
	}
}
