package zadaci_15_02_2018;
import java.util.Scanner;
public class KarakteriNaNeparnimPozicijama {

	public static void neparni(String string) 
	{
		for (int i=0; i<=string.length()-1; i=i+2) 
		{
			System.out.print(string.charAt(i));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String string = unos.nextLine();
		neparni(string);
		unos.close();
	}

}