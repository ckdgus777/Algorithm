import java.util.Scanner;
/*
 * 	유클리드 호제법을 활용하여 최소공배수, 최대공약수를 구한다
 */
public class GCD_LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int GCD = gcd(a, b);
		int LCM = lcm(a, b);
		
		System.out.println("Greatest Common Divisor : " + GCD);
		System.out.println("Least Common Multiple : " + LCM);
		
	}
	
	private static int gcd(int a, int b) {
		if (b == 0) return a;
		else return gcd(b, a % b);
	}
	
	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
