package test0225;

public class Test01_main {
	
	public static void main(String[] args) {
		Integer[] arr = { 1, 4, 5,4, 2, 3 };
		Integer[] arr1 = { 1, 4, 5, 9, 2, 3 };
		Test01 check = new Test01();
		
		
		System.out.println(check.doubleCheck(arr));
		System.out.println(check.doubleCheck(arr1));
		System.out.println(check.forCheck(arr1));
		System.out.println(check.forCheck(arr));
	}
}
