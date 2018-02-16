package zadaci_15_02_2018;

import java.util.Scanner;

public class Avion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite brzinu aviona :  ");
		double brzina = input.nextDouble();
		System.out.print("Unesite ubrzanje aviona :  ");
		double ubrzanje = input.nextDouble();

		double duzina = Math.pow(brzina, 2) / (2 * ubrzanje);

		System.out.print("Minimalna duzina piste za navedeni avion, iznosi :  " + duzina);

		input.close();

	}

}
