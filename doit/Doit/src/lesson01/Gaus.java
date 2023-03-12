package lesson01;

import java.util.Scanner;

public class Gaus {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
//		System.out.print(a + ", ");
//		int b = sc.nextInt();
		System.out.println(gaus1(a));
//		System.out.println(sumof(a, b));
		
		
	}
	
//	public static int gaus(int n) {
//		
//		int result = 0;
//		
//		if(n % 2 == 0) {
//			result = (1 + n) * (n / 2);
//		}else {
//			result = (1 + (n - 1)) * ((n -1) / 2) + n;
//		}
//		
//		return result;
//	}
	
	public static int gaus1(int n) {
		int result = 0;
		
//		if(n > 0) {
//			for(int i = 1; i <= n; i++) {
//				result += i;
//			}
//		}
		
		result = ((n + 1) * (n / 2)) + ((n % 2 == 1) ? (n + 1) / 2 : 0);
		return result;
	}
	
	
	static int sumof(int a, int b) {
//		int s = (a < b) ? a : b;
//		int l = (a < b) ? b : a;
		int s = 0;
		int l = 0;
		if(a < b) {
			s = a;
			l = b;
		}else {
			s = b;
			l = a;
		}
		int result = 0;
		for(int i = s; i <= l; i++) {
			result += i;
		}
		return result;
	}
}
