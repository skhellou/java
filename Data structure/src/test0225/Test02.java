package test0225;

public class Test02 {

	private String str1;
	private String str2;
	/*
	 * 2. 두 개의 문자열 ch1과 ch2가 있습니다. 
	 * 여기에서 ch1 또는 ch2에서 하나의 문자만 수정하여 
	 * ch1과 ch2가 동일한 문자열이 될 수 있는지 확인하는 코드를 작성해보자
		여기에서, ch1 또는 ch2에서 하나의 문자를 삽입, 제거, 치환할 수 있으며 한 번의
			수정만으로 ch1과 ch2가 동일해져야 한다.
		예를 들어 tank, tanc 가 있다면 k를 c로 혹은 반대로 치환하면 동일해 진다.*/

	// 치환 -> 문자열 길이가 같아야함
	// 삽입, 제거 -> 문자열 길이 차이가 1인경우

	public Test02() {

	}
	public Test02(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}

	public boolean strChk(String str1, String str2) {
		Character[] arr1 = new Character[str1.length()];
		Character[] arr2 = new Character[str2.length()];
		if(Math.abs(str1.length() - str2.length()) > 1) {
			return false;
		}
		int cnt = 0;
		if(str1.length() == str2.length()) { 
			for(int i = 0; i < arr1.length; i++) {
				arr1[i] = str1.charAt(i);
				arr2[i] = str2.charAt(i);
				if(arr1[i].compareTo(arr2[i]) != 0){
					cnt++;
				}
			}
			if(cnt != 1) return false;
			return true;
		}else {
			String s = (str1.length() < str2.length()) ? str1 : str2;
			String l = (str1.length() < str2.length()) ? str2 : str1;
			for(int i=0, j = 0; i < s.length() && j < l.length(); i++,j++) {
				if(s.charAt(i) != l.charAt(j)) {
					cnt++;
					System.out.println(cnt);
					if(cnt > 1) return false;
				}
			}
			if(cnt == 1) return true;
			return false;
		}
	}


}

