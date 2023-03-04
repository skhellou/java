package string;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse0304 {
	/*
	 * 자연수 n을 뒤집어서 각 자리수를 원소로 가지는 배열 형태로 리턴하는 소스를 작성
	 * 예를 들면 n이 12345	이면 [5,4,3,2,1] 을 리턴한다.
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		int[] arr = changeToString(num);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		
	}
	
	public static int[] changeToString(int num) {
		String str = Long.toString(num);
		String rv = new StringBuilder(str).reverse().toString();
		char[] ar = rv.toCharArray();
		
		int[] result = new int[ar.length];
		for(int i = 0; i < result.length; i++) {
			result[i] = ar[i] - '0';
		}
		
		return result;
	}
}
