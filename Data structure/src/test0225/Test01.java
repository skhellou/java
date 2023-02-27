package test0225;

import java.util.Arrays;

public class Test01 {

	/*
	 *
	 *1. 정수 배열 arr이 존재한다. 이 배열에 중복된 값이 있을 때 true를 반화하는 소스를 코딩하시요
		예를 들어 주어진 정수가 arr = { 1, 4, 5,4, 2, 3 } 이라고 가정해보자
		이때 중복된 값은 4이다. 이때 결론은 true를 반환한다. 
	*/
	public Test01() {
		
	}
	public boolean doubleCheck(Integer[] arr) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i].compareTo(arr[i+1]) == 0) {
				return true;
			}
		}
		return false;
	}
	
	public boolean forCheck(Integer[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
