package p544;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 12345.6789;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println( df.format(num) );
		
		String[] formatBox = {"0.0", "000000.000000",
				"#", "#.#", "######.######",
				"#.0", "+#.0", "-#.0", "#,###.0",
				"0.0E0", "+#,###; -#,###", "#.#%",
				"\u00A4 #,###"};
		
		for(String format : formatBox) {
			df = new DecimalFormat(format);
			System.out.println();
			System.out.println(format);
			System.out.println( df.format(num) );
		}
		
	}
}
