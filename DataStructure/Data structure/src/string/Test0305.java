package string;

public class Test0305 {

	/*
	 * 1. 아이디의 길이는 3자 이상 15자 이하.
	 * 2. 아이디는 알파벳 소문자, 숫자, _, -, ., 만 사용할 수 있다.
	 * 3. 단, 마침표는 처음과 끝에 사용할 수 없으며, 연속적으로 사용할 수 없다.
	 * 
	 * 다음의 7 단계의 순차적인 처리를 과정을 통해 ID가 발급된다.
	 * 1. 모든 아이디의 문자는 소문자로 처리한다. ( 대문자 입력하여도 소문자로 치환)
	 * 2. 알파벳 소문자, 숫자, 빼기, 밑줄,마침표를 제외한 모든 문자 제거
	 * 3. 연속적인 마침표는 하나로 인식한다.
	 * 4. 마침표가 처음 혹은 끝에 존재하면 삭제한다.
	 * 5. 만약 ID에 공백이 있으면 공백에는 'a'를 자동 대입한다.
	 * 6. ID의 길이가 15자 이상이면 16자부터는 삭제한다.
	 * 7. ID의 길이가 2자 이하이면, 마지막 문자를 길이값이 3이 될때까지 반복해서 붙인다.
	 * */
	public static void main(String[] args) {
		
	}
	private static boolean testID(String str) {
		
	}
	public static String createID(String str) {
		StringBuilder sb = new StringBuilder();
		
		
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(Character.isUpperCase(arr[i])) {
				arr[i] = Character.toLowerCase(arr[i]);
			}
			str = arr.toString();
			if(!(Character.isDigit(arr[i])) || arr[i] != '.' || arr[i] != ',' || arr[i] != '-' || arr[i] != '_') {
				arr[i]
			}
		}
		
	}
}
