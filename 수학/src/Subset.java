import java.util.Scanner;

public class Subset {

	static int COUNT = 0;
	static int N;
	
	static int[] src;
	static boolean[] selected;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		src = new int[N];
		selected = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			src[i] = i + 1;
		}
		
		subset(0);
		System.out.println("경우의 수 : " + COUNT);
	}
	
	private static void subset(int srcIdx) {
		if (srcIdx == N) {
			for (int i = 0; i < N; i++) {
				if (selected[i]) System.out.print(src[i] + " ");
				else System.out.print("X ");
			}
			System.out.println();
			COUNT++;
			return;
		}
		
		selected[srcIdx] = true;
		subset(srcIdx+1);
		selected[srcIdx] = false;
		subset(srcIdx + 1);
	}

}
