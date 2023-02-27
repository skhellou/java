package pickNumber;

import java.util.ArrayList;
import java.util.List;

public class Picker {
	
	public Picker() {}
	
	public List<Integer> extrace(String str){
		//아스키코드 = 48~57 : 0~9
		StringBuilder temp = new StringBuilder();
		List<String> arr = new ArrayList<String>();
		arr.add(str.split(" "));
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 48 && c <= 57) {
				temp.append(c);
				System.out.println(temp);
			}
		}
			return arr;
	}
}
