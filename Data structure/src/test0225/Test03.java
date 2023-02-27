package test0225;

import java.util.HashSet;
import java.util.Set;

public class Test03 {

	/*
	 * 3. 양의 정수 집합 num과 s라는 값이 있습니다.
	 * 이 배열에서 주어진 s 값과 합이 같은 부분 집합을 출력하 코드를 작성해보자
		예를 들어, 주어진 배열 num = { 3, 2, 7, 4, 5, 1, 6, 9 } 이고 
		주어진 s값을 sum이라고 가정해보자. 
		sum = 7일때 다음과 같이 num에서 sum 값과 합이 같은 부분 집합은 2, 4, 1 을
		요소로 포함할 수 있다. 여기에서 가능한 모든 부분 집합을 나열하면 
		{ 3, 4 }, { 2, 4, 1 }, { 2, 5 }, { 7 }, { 1, 6 } 이 존재한다.

		// 만약 같은 원소가 두개 이상 있다면 ?? 
	 * */
	public Test03() {

	}

	public Set<Set<Integer>> sumAble(int[] arr, int s){

		Set<Set<Integer>> sumSets = new HashSet<>();
		while(s<=0) {
			Set<Integer> sumSet = new HashSet<>();
			for(int i = 0; i < arr.length - 1; i++) {
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[i] < s &&( sumSet.contains(arr[i]))==false) {
						s -= arr[i];
						sumSet.add(arr[i]);
						System.out.println("arri : " + arr[i]);
						System.out.println("s : " + s);
					}
					if(arr[j] <= s)
						s -= arr[j];
					System.out.println("arrj : " + arr[j]);
					System.out.println("s : " + s);
					sumSet.add(arr[j]);
					
				}
				sumSets.add(sumSet);
			}
		}
		return sumSets;

	}



}	
//
//	public Set<Set<Integer>> sumAble(int[] ar, int s){
//		Set<Set<Integer>> sumSets = new HashSet<>();
//		// 합이되는 숫자 Set에 담아주기
//		Set<Integer> sumSet = new HashSet<Integer>();
//		for(int i = 0; i< ar.length; i++) {
//			for(int j = i+1; j < ar.length; j++) {
//				while(s < 0) {
//					if(sumSet.contains(ar[i]) == true || sumSet == null) {
//						continue;
//					}else if(ar[i] <= s || (s - ar[i]) == 0) {
//						sumSet.add(ar[i]);
//						s -= ar[i];
//					}else {
//						sumSet.removeAll(sumSet);
//					}
//				}
//			}
//			if(s == 0) {
//				sumSets.add(sumSet);
//				break;
//			}
//		}
//		return sumSets;
//	}



