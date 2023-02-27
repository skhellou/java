package test0225;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test03_main {

	
	public static void main(String[] args) {
		
		int[] num = { 3, 2, 7, 4, 5, 1, 6, 9 };
		int s = 7;
		Test03 test03 = new Test03();
		
		Set<Set<Integer>> list = test03.sumAble(num, s);
		
		System.out.println(list);
		
		
	}
}
