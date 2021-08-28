package com.algo.twoDimensionalArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1954_달팽이숫자 {

	static int T;
	static int N;
	static int[][] snail;
	
	static int[] dy = { 0, 1, 0, -1 }; // 우 하 좌 상
	static int[] dx = { 1, 0, -1, 0 };
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			
			snail = new int[N][N];
			
			// 달팽이 숫자 생성하기
			int target = 1;
			
			int ny = 0;
			int nx = 0;
			int dir = 0; // 우 하 좌 상
			
			for (int i = 0; i < N*N; i++) {
				// 먼저 넣은다음, 방향을 변경한다
				// 우선, ny, nx 위치에 target을 넣는다
				snail[ny][nx] = target++;
				
				int y = ny + dy[dir];
				int x = nx + dx[dir];
				
				// 범위를 벗어나면 dir을 변경한다. 
				// 이미 기록된 지점이면 dir을 변경한다.
				if(y >= N || x >= N || y < 0 || x < 0 || snail[y][x] != 0) {
					dir = (dir+1) % 4;
				}

				ny += dy[dir];
				nx += dx[dir];
			}
			
			// 달팽이 숫자 출력하기
			System.out.println("#" + t);
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(snail[i][j] + " ");
				}
				System.out.println();
			}
			
		}
	}

}
