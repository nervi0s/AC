package repaso_general;

public class Repaso4 {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 3;
		int n3 = 3;

		System.out.print("El número mayor es: ");
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1);
		} else {
			if (n2 > n3) {
				System.out.println(n2);
			} else {
				System.out.println(n3);
			}
		}

	}

}
