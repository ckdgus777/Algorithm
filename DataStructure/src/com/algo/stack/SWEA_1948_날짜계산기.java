package com.algo.stack;

import java.util.Scanner;

public class SWEA_1948_날짜계산기 {
	
	static int T, M1, D1, M2, D2, answer;
	static int[] Months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			M1 = sc.nextInt();
			D1 = sc.nextInt();
			M2 = sc.nextInt();
			D2 = sc.nextInt();
			answer = 1;
			
			for (int i = M1; i < M2; i++) {
				answer += Months[i];
			}
			answer += D2;
			answer -= D1;
			
			// 출력
			System.out.println("#" + t + " " + answer);
			
		}
		
		
	}

}
