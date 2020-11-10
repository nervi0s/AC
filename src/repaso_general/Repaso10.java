package repaso_general;

public class Repaso10 {
	
	public static void main(String[] args) {
		int[] numbers = { 50, 30, 110, 1, 27 };
		int counter = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int changer;
					changer = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = changer;
				}
				counter++;
			}
		}

		System.out.println("Iteraciones: " + counter);

		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
