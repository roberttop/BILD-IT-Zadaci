package zadaci_14_02_2018;
import java.util.Scanner;
public class ObrnutiRedoslijed10Brojeva {

	public static void obrnuti(int[] broj) {
		System.out.print("Uneseni brojevi u obrnutom redosljedu : ");
		for (int i = broj.length-1; i >=0 ; i--) {
			System.out.print(broj[i] + " ");
			}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);
		int[] broj = new int[10];
		System.out.println(" Unesite 10 brojeva: ");
		for (int i = 0; i < 10; i++) {
			broj[i] = unos.nextInt();
			}
		obrnuti(broj);
		unos.close();
	}

}