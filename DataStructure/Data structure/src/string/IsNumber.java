package string;

import java.util.Scanner;

public class IsNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		String str = sc.nextLine();
		System.out.println(isNumber(str));
	}

	public static boolean isNumber(String str) {

		if(str.length() != 4 && str.length() != 6) {
			return false;
		}
		for(char ar : str.toCharArray()) {
			if(!Character.isDigit(ar)) {
				return false;
			}
		}
		return true;
	}
}
