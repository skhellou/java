package lesson01;

public class Median {
	
	public static void main(String[] args) {
		
	}
	
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
