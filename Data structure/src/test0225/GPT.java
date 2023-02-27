package test0225;

import java.util.HashSet;
import java.util.Set;

public class GPT {

	public static void main(String[] args) {
		int[] num = {3, 2, 7, 4, 5, 1, 6, 9};
		int s = 7;

		Set<Set<Integer>> subsets = getSubsets(num);

		// 합이 s인 부분 집합 출력
		for (Set<Integer> subset : subsets) {
			int sum = 0;
			for (int numInSubset : subset) {
				sum += numInSubset;
			}
			if (sum == s) {
				System.out.println(subset);
			}
		}
	}

	// 부분 집합 구하는 메소드
	public static Set<Set<Integer>> getSubsets(int[] num) {
		Set<Set<Integer>> subsets = new HashSet<>();
		subsets.add(new HashSet<>()); // 빈 집합 추가

		for (int i = 0; i < num.length; i++) {
			Set<Set<Integer>> newSubsets = new HashSet<>();
			for (Set<Integer> subset : subsets) {
				Set<Integer> newSubset = new HashSet<>(subset);
				newSubset.add(num[i]);
				newSubsets.add(newSubset);
			}
			subsets.addAll(newSubsets);
		}

		return subsets;
	}
}
