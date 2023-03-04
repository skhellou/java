package string;

import java.util.Scanner;

public class Ceaser {

	
	public static void main(String[] args) {
	//	boolean aa = 'a' > 'A';
	//	System.out.println(aa);	//true
		
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 암호문을 입력해주세요");
		String str = sc.nextLine();
//		try {
//			if(str.length() > 10); 
//			
//		} catch (Exception e) {
//			
//		}
		System.out.println("12 이하의 정수를 입력해주세요");
		int num = sc.nextInt();
		
		String result = ceaser(str, num);
		//String result = toCeaser(str, num);
		System.out.println(result);
		
	
	}
	public static char toCeaser1(char str, int num) {
		if(!Character.isAlphabetic(str)) {
			return str;
		}
		
		int check = Character.isUpperCase(str) ? 'A':'a';	//입력받은 문자가 대문자인지 소문자인지 구분
		int shift = str - check;							// a에서 부터 이동된 위치 담기
		shift = (shift + num) %('Z' - 'A' + 1);				// z 를 넘어서 다시 a 부터 돌아가야하는 상황이 생기기 때문에, 이동위치에 이동횟수 더해주고 
															// 알파벳갯수(26)를 나눠 다시 a 부터 이동된 위치 담기 (같은 역할 하는 변수에 다시 담아준다)
		return (char)(check + shift);						// 알파벳의 처음인 a가 담긴 check 변수에 이동된 위치 더해주기
		
	}
	
	public static String ceaser(String str, int num) {
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()) {
			sb.append(toCeaser1(c,num));
		}
		return sb.toString();
	}
	
	public static String toCeaser(String str, int num) {
		
		char[] arr = str.toCharArray();
		String change = "";
		for(int i = 0; i < arr.length; i++) {
			Character check = arr[i];
			if(!check.isAlphabetic(arr[i])) {
			//if(arr[i] < 'A' || arr[i] > 'z') {		//알파벳이 아닐때
				change += arr[i];
			}else if(arr[i] >= 'A' && arr[i] <= 'Z') {	// 대문자일때
				change += (char)((arr[i] - 'A' + num) % 26 + 'A');
			}else if(arr[i] >= 'a' && arr[i] <= 'z'){		
				change += (char)((arr[i] -'a' + num) % 26 + 'a');
			}
		}
		return change;
	}
}
