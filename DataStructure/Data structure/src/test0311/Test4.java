package test0311;


public class Test4 {
	/*
	 * 정수를 이어 붙여서 만들 수 있는 가장 큰 수를 알아내는 함수를 작성하시오.
	 * 예 ) [6, 10, 2] --> 가장 큰 수는 6210 이 된다. 
	 * 
	 * 가장 큰 수를 문자열로 바꾸어서 반환하는 함수 작성.
	 * 
	 * [조건] numbers의 길이는 1 이상 100,000이
	 * 		 numbers의 원소는 0이상 1,000이하
	 * 		 마지막으로 문자열로 변환하여 반환
	 * 
	 * 
	 * 숫자를 이어 붙여서 모두 문자열로 변환 
	 *  Arrays.stream(numbers)
	 *  	  .mapToObj(String::valueOf)
	 *  	  .sorted((s1,s2) -> {
	 *  		int orig = Integer.parseInt(s1 + s2);
	 *  		int rev = Integer.parseInt(s2 + s1);
	 *  		return rev - orig;
	 *  	})
	 *  	  .collect(Collectors.joining(""))
	 *  	  .replaceAll("^0+" , "0");  (정규표현식에서  ^ -> 문자열의 시작,
	 *  											  + -> 1회 이상 반복한다.(문자열의 시작부분에 0이 반복해서 나타나면 0 하나로 대체))
	 */
	
		public static void main(String[] args) {
			int[] numbers = {6, 10, 2};
//			Arrays.str
		}
		
}
