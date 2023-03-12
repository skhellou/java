package test0311;

import java.util.stream.IntStream;

public class Test1 {
	/* 수포자 3명이 모의고사를 푸는데 수학 문제는 전부 찍어서 제출하려고 한다.
	 * 처음부터 마지막 문제까지 다음과 같이 찍는다.
	 * 첫번째 수포자 : 1, 2, 3, 4, 5, 1, 2, 3, 4, 5,....
	 * 두번째 수포자 : 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, 2...
	 * 세번째 수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 ...
	 * 
	 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answer가 주어졌을때,
	 * 가장 많은 문제를 맞힌 사람은 누구인지 배열엘 담아서 return 하는 함수를 작성. 
	 * 
	 * [조건]
	 * 		시험은 최대 10,000 문제
	 * 		문제의 정답은 1, 2, 3, 4, 5 중 하나.
	 * 		가장 높은 점수를 받은 사람이 여럿일 경우, 반환하는 값을 오름차순으로 정렬한다.
	 * 
	 * 		answer [1,2,3,4,5]		[1,3,2,4,2]
	 * 		return	   [1]		   	  [1,2,3]
	 * 
	 * ---------------------------------------------------------------------------------
	 * 	먼저 사용자들 답의 규칙(패턴)을 찾아야한다.
	 *  첫번째 : 1,2,3,4,5
	 *  두번째 : 2,1,2,3,2,4,2,5
	 *  세번째 : 3,3,1,1,2,2,4,4,5,5
	 *  
	 *  완전탐색
	 *  문제 개수 -> N --> O(N)
	 *  수포자 --> M --> O(NM) --> 30,000
	 *  
	 *  각자 데이터의 길이값이 다르니까 arrayList 에 담아준다 ?  
	 */
	//비효율적이다.
	//	private static final int[] STUDENT1 = {1, 2, 3, 4, 5};
	//	private static final int[] STUDENT2 = {2, 1, 2, 3, 2, 4, 2, 5};
	//	private static final int[] STUDENT3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

	//DFS 가 효율적이지 않을까 ? 
	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 3, 2, 3, 4, 5, 1, 2, 4};
		System.out.println(getPerson(answers));

	}
	private static final int[][] STUDENT = {
			{1, 2, 3, 4, 5},
			{2, 1, 2, 3, 2, 4, 2, 5},
			{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
	};

	private static int getChoice(int person, int problem) {		//ex)  problem == 문제 번호??
		int[] stud = STUDENT[person];
		int index = problem % stud.length;
		return stud[index];
	}

	public static int getPerson(int[] answers) {
		int[] corrects = new int[3];
		int max = 0;	//가장 많이 맞힌개수

		for(int problem = 0; problem < answers.length; problem++) {
			int answer = answers[problem];

			//각각 학생들의 정답 개수 카운트
			for(int person = 0; person < 3; person++) {
				int choice = getChoice(person, problem);
				if(answer == choice) {
					if(++corrects[person] > max) {
						max = corrects[person];
					}
				}
			}
		}
		return max;
//		final int maxCorrects = max;
//		return IntStream.range(0,3)
//				.filter(i -> corrects[i] == maxCorrects)
//				.map(i -> i + 1)
//				.toArray();
	}
	//lamda 함수 == 자바의 익명 내부 클래스와 같은 개념


}
