package zadaci_14_02_2018;

public class IzvlacenjeKarte {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int karta = (int) (1 + (Math.random() * 13));
		int znak = (int) (1 + (Math.random() * 4));
		String s = " ";

		if (znak == 1)
			s = "pika";

		if (znak == 2)
			s = "srca";
		else if (znak == 3)
			s = "kocke";
		else
			s = "djeteline";

		if (karta == 1)
			System.out.println("Karta koju ste izvukli je  A  u znaku " + s  );

		else if (karta == 11)
			System.out.println("Karta koju ste izvukli je  J  u znaku " + s  );
		else if (karta == 12)
			System.out.println("Karta koju ste izvukli je  Q  u znaku " + s  );
		else if (karta == 13)
			System.out.println("Karta koju ste izvukli je  K  u znaku " + s );

		else
			System.out.println("Karta koju ste izvukli je " + karta + " u znaku  " + s);

	}

}