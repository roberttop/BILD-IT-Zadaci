package zadaci_13_02_2018;

import java.util.Scanner;

public class LokacijaNajvecegElementa2Dniza {

	public static int[] locateLargest(double[][] a) {
		int[] najveciNiza = new int[2];
		double najveci = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (najveci < a[i][j]) {
					najveci = a[i][j];
					najveciNiza[0] = i;
					najveciNiza[1] = j;
				}
			}
		}
		return najveciNiza;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);

		double[][] matrica = new double[5][5];

		System.out.print(" Unesite 5x5 matricu :\n ");

		for (int red = 0; red < matrica.length; red++) {
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {
				matrica[red][kolona] = unos.nextDouble();
			}
		}

		unos.close();

		int[] index = locateLargest(matrica);

		System.out.printf("  Lokacija najveceg elementa: [%d,%d]", index[0], index[1]);
	}
}
