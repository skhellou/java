package test0225;

public class Test02_main {
	
	public static void main(String[] args) {
		
		String str1= "appler";
		String str = "applr";

		Test02 strChk = new Test02(str, str1);
		
		
		boolean chk = strChk.strChk(str, str1);
		
		System.out.println(chk);
		
	}
}
