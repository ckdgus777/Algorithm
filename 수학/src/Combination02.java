import java.util.Arrays;
import java.util.Scanner;

public class Combination02 {

	static int COUNT = 0;
	static int N, R;

	static int[] src;
	static int[] tgt;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		
		src = new int[N];
		tgt = new int[R];
		
		for (int i = 0; i < N; i++) {
			src[i] = i + 1;
		}
		
		comb(0, 0);
		System.out.println("경우의 수 : " + COUNT);
	}

	private static void comb(int srcIdx, int tgtIdx) {
		if (tgtIdx == R) {
			System.out.println(Arrays.toString(tgt));
			COUNT++;
			return;
		}
		
		if (srcIdx == N) return;
		tgt[tgtIdx] = src[srcIdx];
		comb(srcIdx + 1, tgtIdx + 1);
		comb(srcIdx + 1, tgtIdx);
	}
}
