package test0311;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
	/* 정수 배열의 이름인 numbers가 존재한다.
	 * 서로 다른 인덱스에 있는 두개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열 오름차순으로 나열하시오.
	 * (중복을 허용하지 않는다 --> Set)
	 * 
	 * [제한사항]
	 * 1. numbers의 길이는 2이상 100이하
	 * 2. numbers의 모든 수는 0이상 100이하이다.
	 * 
	 * 예) numbers =[2, 1, 3, 4, 1]
	 */
	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		System.out.println(sumArr(numbers));
	}
	private static Set<Integer> sumArr(int[] numbers) {
		
		if(numbers.length < 2 && numbers.length > 100) {
			return null;
		}
		Set<Integer> result = new HashSet<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = numbers.length-1; j > i; j--) {
				int sum = numbers[i] + numbers[j];
				result.add(sum);
			}
		}
		return result;
	}
	//오름차순으로 정렬해주기
	public static int[] setSort(Set<Integer> result) {
		int[] last = new int[result.size()];
		
		for(int n : result) {
			int i = 0;
			if(n > last[i]) {
				
			}
			last[0] = n;
		}
	}
	
}
