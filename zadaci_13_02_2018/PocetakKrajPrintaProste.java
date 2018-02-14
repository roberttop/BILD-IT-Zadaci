package zadaci_13_02_2018;

import java.util.Scanner;

public class PocetakKrajPrintaProste {

	public static void ispisiProste(int number1, int number2) {

		for (int i = number1; i < number2; i++) {
			if (isPrime(i)) {
				System.out.printf(" %2d ", i);

			}
		}

	}

	public static boolean isPrime(int broj) {

		boolean prosti = true;
		for(int i = 2; i < broj; i++)
		{
			if(broj % i == 0)
			{
				prosti = false;
			}
		}
		return prosti;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite poèetnu vrijednost raspona: ");
		int pocetak = unos.nextInt();
		System.out.print("Unesite krajnju vrijednost raspona: ");
		int kraj = unos.nextInt();
		System.out.print("Prosti brojevi u rasponu od " + pocetak + " do " + kraj + " su :");
		unos.close();
		ispisiProste(pocetak, kraj);

	}

}
