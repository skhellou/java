package lesson01;

public class Median {
	
	public static void main(String[] args) {
		
		System.out.println(mid3(2,34,21));
		System.out.println(mid3(1,2,0));
	}
	//중앙값 구하는 메서드
	static int mid3(int a, int b, int c) {
		
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(c >= a) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b < c){
			return b;
		}else {
			return c;
		}
		
	}
}
