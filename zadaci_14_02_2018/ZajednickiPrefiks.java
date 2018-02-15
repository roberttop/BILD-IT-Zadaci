package zadaci_14_02_2018;

import java.util.Scanner;

public class ZajednickiPrefiks {

	public static void prefiks(String s1, String s2) {
		int brojac = 0;
		for (int i = 0; i < s1.length(); i++) 
		{
			if (s1.charAt(i) == s2.charAt(i)) 
			{
				brojac++;
			} else 
			{
				break;
			}
		}
		if (brojac > 0) 
		{
			System.out.println("Zajednicki prefiks za " + s1 + " i " + s2 + " je: ");
			for (int i = 0; i < brojac; i++)
			{
				System.out.print(s1.charAt(i));
			}
		} 
		else 
		{
			System.out.println("Stringovi " + s1 + " i " + s2 + " nemaju zajednicki prefiks.");
		}
	}
	
	
	

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite prvi string: ");
		String string1 = unos.nextLine();
		System.out.print("Unesite drugi string: ");
		String string2 = unos.nextLine();
		prefiks(string1, string2);
		unos.close();
	}

}