package string;

public class Replace {
	
	/*
	 * char[]로 주어진 문자열 str이 있다. 
	 * 문자열의 모든 공백을 %20으로 치환하는 소스를 작성하십시오
	 * (반환은 char[]로 한다)
	 */
	
	public static void main(String[] args) {
		char[] str = "잘 모르 겠다".toCharArray();
		
		System.out.println(replaceStr(str));
	}
	
	public static char[] replaceStr(char[] str) {
		String result = "";
		for(int i = 0; i < str.length; i++) {
			if(str[i] == ' ') {
				result += "%20";
			}else {
				result += str[i];
			}
		}
		str = result.toCharArray();
		return str;
	}
}
