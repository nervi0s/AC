package repaso_general;

public class Repaso13 {

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

	public static int factorial(int number) {
		if (number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}

}
