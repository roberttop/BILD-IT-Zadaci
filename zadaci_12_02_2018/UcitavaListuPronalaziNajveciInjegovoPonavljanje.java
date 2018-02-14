package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UcitavaListuPronalaziNajveciInjegovoPonavljanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.print(" Unesite elemente niza (0 prekida unos): ");
		Integer broj = unos.nextInt();

		while (broj.intValue() != 0) {
			list.add(broj);
			broj = unos.nextInt();
		}

		System.out.printf(" Najeveci elemet u listi %d ", max(list));
		unos.close();
	}

	public static Integer max(ArrayList<Integer> list) {

		if (list.isEmpty() || list.size() == 0) {
			return null;

		} else {
			return Collections.max(list);
		}
	}
}
