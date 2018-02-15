
package zadaci_14_02_2018;

import java.util.Scanner;

public class StednjaKamata {

	public static void main(String[] args) {
		System.out.print("Unesite mjesecni iznos stednje: ");
		Scanner unos = new Scanner(System.in);
		int stednja = unos.nextInt();
		System.out.print("Unesite broj mjeseci: ");
		int mjesec = unos.nextInt();
		double stanje = stednja * (1 + 0.00417);

		for (int i = 1; i <= mjesec - 1; i++)
		{
			stanje = (stednja + stanje) * (1 + 0.00417);

		}

		System.out.printf("Stanje na racunu iznosi: %.3f", stanje);
		unos.close();
	}

}