package zadaci_12_02_2018;

import java.util.Scanner;

public class BrojSuglasnikaISamoglasnika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int samoglasnik = 0, praznina = 0;

		System.out.println("Upisite string: ");
		String s = unos.nextLine();
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				samoglasnik++;
			}
			if (s.charAt(i) == ' ') {
				praznina++;
			}
		}

		System.out.println(
				"Broj samoglasnika: " + samoglasnik + "\nBroj suglasnika : " + (s.length() - samoglasnik - praznina));
		unos.close();
	}

}
