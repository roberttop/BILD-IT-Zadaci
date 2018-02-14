package zadaci_13_02_2018;

import java.util.Scanner;

public class SortiraRedove2Dniza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);

		double[][] matrica = new double[3][3];

		System.out.print(" Unesite 3x3 matricu :\n ");

		for (int red = 0; red < matrica.length; red++) {
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {
				matrica[red][kolona] = unos.nextDouble();
			}
		}

		unos.close();
		System.out.println(sortRows(matrica));
	}

	public static double[][] sortRows(double[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				double t = mat[i][j];
				int temp = j;

				for (int k = j + 1; k < mat[i].length; k++) {
					if (t > mat[i][k]) {
						t = mat[i][k];
						temp = k;
					}
				}

				if (temp != j) {
					mat[i][temp] = mat[i][j];
					mat[i][j] = t;
				}
			}
		}
		return mat;
	}
}