package zadaci_13_02_2018;

import java.util.Scanner;

public class NajmanjiDecimalniElementNiza {

	public static double min(double[] array) {

		double najmanji = array[0];
		for (int i = 1; i < array.length; i++) {
			if (najmanji > array[i]) {
				najmanji = array[i];
			}
		}
		return najmanji;
}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		double[] array = new double[10];

		System.out.print(" Unesite niz od deset elemenata: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = unos.nextDouble();
		}

		unos.close();

		System.out.printf(" Najmanji element u nizu je: %.2f ", min(array));
	}

}