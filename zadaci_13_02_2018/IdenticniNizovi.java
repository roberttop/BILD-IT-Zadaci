package zadaci_13_02_2018;

import java.util.Scanner;

public class IdenticniNizovi {

	public static boolean equals(int[] niz1, int[] niz2) {

		if (niz1.length != niz2.length) {
			return false;
		} else {
			for (int i = 0; i < niz1.length; i++) {
				if (niz1[i] != niz2[i]) {
					return false;
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite duzinu prvog niza: ");
		int duz1 = unos.nextInt();
		int niz1[] = new int[duz1];
		System.out.println("Unesite duzinu drugog niza: ");
		int duz2 = unos.nextInt();
		int niz2[] = new int[duz2];
		System.out.println("Unesite clanove prvog niza: ");

		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = unos.nextInt();
		}
		System.out.println("Unesite clanove drugog niza: ");
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = unos.nextInt();
		}
		unos.close();
		if (equals(niz1, niz2)) {
			System.out.println("Nizovi su striktno identicni");
		} else {
			System.out.println("Nizovi nisu striktno identicni");
		}
	}

}
