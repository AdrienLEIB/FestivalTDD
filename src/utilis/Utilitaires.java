package utilis;

import java.util.Scanner;

public class Utilitaires {

	public static String saisieString() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public static int saisieInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
