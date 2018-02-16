package zadaci_15_02_2018;

import java.util.Scanner;

public class PrijestupneGodine10PoLiniji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite pocetnu godinu: ");
		int pocetak = unos.nextInt();
		System.out.println("Unesite krajnju godinu: ");
		int kraj = unos.nextInt();
		int brojac = 0;
		System.out.println("Prestupne godine u od: " + pocetak + ". do " + kraj + ". su:");
		for (int i = pocetak; i <= kraj; i++) 
		{
			if (i % 4 == 0 ^ i % 100 == 0) 
			{
				System.out.print(i + ". ");
				brojac++;
			}
			if (brojac % 10 == 0) 
			{
				System.out.println("");
			}
		}
		unos.close();
	}

}