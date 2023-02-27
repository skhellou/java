package tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test02 {

	/*
	 *random을 이용하여 숫자 30개를 출력한다.(중복허용)
	 *30개의 숫자 중 중복되는 숫자의 수와 그 수를 같이 출력하는 소스를 작성하시오(map이용)
	 */

	public static void main(String[] args) {

		Map<Integer, Integer> bag = new HashMap<Integer, Integer>();
		int[] arr = new int[30];
		int cnt;

		for(int i = 0; i< 30; i++) {
			cnt = 1;
			arr[i] = (int)((Math.random() * 100) + 1);
			for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					cnt++;
					for(Map.Entry<Integer, Integer> entry : bag.entrySet()) {
						if(entry.getValue() == cnt) {
							bag.replace(arr[i], cnt);
							break;
						}
					}
					bag.put(arr[i], cnt);
					break;
				}
			}
		}
		if(bag.isEmpty()) {
			System.out.println("중복없음");
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(bag.entrySet());

	}
}