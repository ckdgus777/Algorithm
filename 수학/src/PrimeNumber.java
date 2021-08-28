import java.util.Scanner;
/*
 * 	에라토스테네스의 체를 활용한 소수 구하기
 * 	입력 받는 숫자보다 작은 소수의 개수를 찾는다
 */
public class PrimeNumber {

	static boolean[] isNotPrime;
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		isNotPrime = new boolean[num + 1];

		// 0과 1은 소수가 아니므로 제외한다
		isNotPrime[0] = isNotPrime[1] = true;

		getPrime(num);

		// 소수 출력
		for (int i = 0; i <= num; i++) {
			if (!isNotPrime[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.printf("%n%d 이하의 숫자 중, 소수의 개수는 %d 개다.", num, count);

	}

	private static void getPrime(int num) {
		// num보다 작거나 같은 수 i에 대해서, i가 소수라면 i의 배수는 소수가 아니다
		for (int i = 2; i*i <= num; i++) {
			if (!isNotPrime[i]) {
				for (int j = i*i; j <= num; j += i) {
					isNotPrime[j] = true;
				}
			}
		}
	}
	
}
