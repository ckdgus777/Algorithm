import java.util.Arrays;
import java.util.Scanner;

public class Permutation02 {
	
	static int COUNT = 0;
	static int N, R;
	
	static int[] src;
	static int[] tgt;
	
	static boolean[] visited;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		
		src = new int[N];
		tgt = new int[R];
		visited = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			src[i] = i + 1;
		}
		
		perm(0);
		System.out.println("경우의 수 : " + COUNT);
		
	}

	private static void perm(int tgtIdx) {
		if (tgtIdx == R) {
			System.out.println(Arrays.toString(tgt));
			COUNT++;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (visited[i]) continue;
			tgt[tgtIdx] = src[i];
			visited[i] = true;
			perm(tgtIdx + 1);
			visited[i] = false;
		}
	}
}
