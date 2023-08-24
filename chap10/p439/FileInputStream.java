package p439;

public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println("read " + file);
	}
	
	@Override
	public void close() throws Exception{
		System.out.println("close " + file);
	}
	// ...? close() 뒤에 throws Exception.. 있을 이유가..?
	
	
}

//??? a..ha?! method block 내에서 오류가 발생해서 exception 출력해야 하는데 그걸 포기한다는 의미구만.