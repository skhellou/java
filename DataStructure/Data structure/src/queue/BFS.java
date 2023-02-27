package queue;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public static void main(String[] args) {

		int m = 5, n = 5;
		int[][] arr = new int[m][n];
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; m < n; j++) {
				if(arr[i][j] == 1) {
					q.offer(arr[n][m]);
				}
			}
		}
	}
}
