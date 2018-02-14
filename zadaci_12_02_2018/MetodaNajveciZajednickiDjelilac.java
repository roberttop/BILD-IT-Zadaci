package zadaci_12_02_2018;

import java.util.Scanner;

public class MetodaNajveciZajednickiDjelilac {

	public static int NajveciDjelilac(int a, int b) {
		int min = a;
		int najveci = 1;
		if (a > b) {
			min = b;
		}

		for (int i = 2; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				najveci = i;
			}
		}

		return najveci;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi prvi broj: ");
		int a = unos.nextInt();
		System.out.println("Unesi drugi broj: ");
		int b = unos.nextInt();
		System.out.println("Najveci zajednicki djelilca brojeva " + a + " i " + b + " je " + NajveciDjelilac(a, b));
		unos.close();
	}

}