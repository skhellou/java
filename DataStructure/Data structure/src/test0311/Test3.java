package test0311;

import java.util.stream.Stream;

public class Test3 {

	/* 문자열 S에 나타나는 문자를 큰 것부터 작은 순서로 정렬해 
	 * 새로운 문자열을 리턴하는 함수를 작성하시오.
	 * S -> 영문 대소문자로만 구성. 대문자는 소문자보다 작다 라고 가정
	 * 
	 * [제한 사항] 
	 * 	str은 길이 1이상인 문자열
	 * s = "Zbcdefg" -> return "gfedcbZ"
	 * 문자열을 역으로 출력
	 * 문자열 -> 문자형으로 변환 char
	 * 
	 * * 문자열에서 chars() 메서드 호출 ==> IntStream이 반환된다.
	 * (CharStream은 존재하지 않는다.)
	 * 
	 * 


		람다 -> 익명함수 사용
			정수형을 내림차순으로 정렬하는 것 처럼 문자도 역순으로 정렬할 수 있다.
			주의 ** 
			 정수 배열을 내림차순으로 정렬할 때 -> Stream을 사용
			 char도 같은 방식으로 진행할 수 있다. 그러나 다시 문자열로 반환해야 한다. 
		
			
		1. 입력받은 문자열 s를 chars() 사용하여 IntStream으로 변환해 주고, 
		in()메서드로 Stream<Integer>
		
		s.chars()
			.in()
			.sorted((v1,v2) -> v2 - v1)
			.collect(StringBuilder::new, 
					 StringBuilder::appendCodePoint, 
					 StringBuilder::append)
			.toString();
		
		
	 */
	
	
}
