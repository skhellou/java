package tree;

import java.util.Arrays;

public class Test01 {

	// 숫자 범위는 1~ 100 
	/*
	 * 
	 * 1. random을 이용하여 숫자 10개를 출력한다.(배열로 선언해서),
	 *	단, 중복은 허용하지 않는다. 
	 *	그리고 나서 10개의 숫자를 정렬하시오(내림,오름)
	 * */

	public static void main(String[] args) {


		int[] arr = new int[10];
		int save;

		for(int i = 0; i < 10; i++) {
			arr[i] = (int)((Math.random() * 100) + 1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		//내림차순
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< i; j++) {
				if(arr[i] > arr[j]) {
					save = arr[i];
					arr[i] = arr[j];
					arr[j]=save;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
