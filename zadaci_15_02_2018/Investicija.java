package zadaci_15_02_2018;

import java.util.Scanner;

public class Investicija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double buducaVrijednost = 0;
		//;
		//int godine = 0;

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite iznos investicije: ");
		double investicija = unos.nextDouble();
		System.out.println("Unesite godisnju interesnu stopu: ");
		double godStopa = unos.nextDouble();
		System.out.println("Unesite broj godina: ");
		int godine = unos.nextInt();

		double mjesecnaStopa = godStopa / 12 / 100;
		buducaVrijednost = investicija * Math.pow((1 + mjesecnaStopa), (godine * 12));

		System.out.println("Buduca vrijednost je: " + buducaVrijednost);
		unos.close();

	}

}
