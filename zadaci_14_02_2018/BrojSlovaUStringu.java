package zadaci_14_02_2018;

import java.util.Scanner;

class BrojSlovaUStringu {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite neki string : ");
		String string = unos.nextLine();

		System.out.println("Uneseni string ima " + brojiSlova(string) + " slova");
		unos.close();
	}

	public static int brojiSlova(String string) {
		int brojac = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) {
				brojac++;
			}
		}
		return brojac;
	}
}