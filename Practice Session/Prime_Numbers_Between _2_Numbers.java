
import java.util.Scanner;
class Abc {

	public static void main(String args[]) {
		int start, end;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Start Number");
		start = s.nextInt();
		System.out.println("Enter end Number");
		end = s.nextInt();
		for (int i = start; i < end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static Boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
			

		}

		return true;
	}
}
