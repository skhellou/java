package test0305;

import java.util.ArrayList;
import java.util.Arrays;

public class Modify {
	/*
	 * m * n 행렬이 존재한다.
	 * k(i,j)이 0이면 i행과 j행열 전체는 0만을 포함해야 한다.
	 * 추가적인 조건은 사용하지 않고 행렬 k 를 수정하는 코드를 작성하시오
	 * 
	 * 1 	2	 3	 4	 0	 5	 6	 7
	 * 8 	9 	10 	11 	12 	13 	14 	15
	 * 16	17	18	19	20	21	0	22
	 * 23	24	25	26	27	28	29	30
	 * 31	32	33	34	35	36	37	38
	 * 
	 * 0 	0	 0	 0	 0	 0	 0	 0
	 * 8 	9 	10 	11 	 0 	13 	 0 	15
	 * 0 	0	 0	 0	 0	 0	 0	 0
	 * 23	24	25	26	 0	28	 0	30
	 * 31	32	33	34	 0	36	 0	38
	 * */

	public static void main(String[] args) {
		modify(create(5, 8, 0,4,2,6));
	}
	public static int[][] create(int m, int n, int a, int b, int c, int d){
		int[][] arr = new int[m][n];
		int cnt = 1;

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if((i == a && j == b) || (i ==c && j == d)) {
					arr[i][j] = 0;
				}else {
					arr[i][j] = cnt;
					cnt++;
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------");
		return arr;
	}

	public static void modify(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == 0) {
					arr[i][0] = 0;
					arr[0][j] = 0;
				}
				System.out.print(arr[i][j] + "\t"); //머리가 아니 돌아감 ...  
			}
			System.out.println();
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][0] ==0 || arr[0][j]==0) {
					arr[i][j]=0;
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
			//}
		}
	}
}
