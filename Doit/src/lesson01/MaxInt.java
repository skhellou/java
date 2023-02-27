package lesson01;

public class MaxInt {

	public static void main(String[] args) {

		max4(3, 6, 1, 3);
		min3(2,7,3);
		min4(23,236,66,22);
	} 

	static void max4(int a, int b, int c, int d) {

		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;

		System.out.println("max4의 최댓값은 : " + max);

	}

	static void min3(int a, int b, int c) {
		int min = a;

		if(b < min) min = b;
		if(c < min) min = c;

		System.out.println("min3의 최솟값은 : " + min);
	}

	static void min4(int a, int b, int c, int d) {
		int min = a;

		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		System.out.println("min4의 최솟값은 : " + min);
	}

}
