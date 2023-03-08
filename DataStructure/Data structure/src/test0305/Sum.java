package test0305;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sum {
	public static void main(String[] args) {

		int[] arr = {-5, -2, 5, 4, 3, 7, 2, -1, -1, -2, 15, 8, 12, -4, 3};
		int k = 10;

		check(arr, k);
	}

	public static void check(int[] arr, int k) {
		Set<int[]> bucket = new HashSet<int[]>();

		for(int i = 0; i < arr.length - (i+1); i++) {
			for(int e = arr.length -1; e > i; e--) {
				if(arr[i] + arr[e] == k) {
					int[] pos = new int[2];
					pos[0] = arr[i];
					pos[1] = arr[e];
					bucket.add(pos);
				}
			}
		}
		for(int[] s : bucket) {
			System.out.println(Arrays.toString(s));
		}
	}
}