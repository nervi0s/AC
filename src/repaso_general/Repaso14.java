package repaso_general;

public class Repaso14 {

	public static void main(String[] args) {
		System.out.println(isPrime(134));
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
