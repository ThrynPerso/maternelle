package maternelle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	private static BufferedReader unBuffer = new BufferedReader (new InputStreamReader(System.in));

	public static int saisirInt() {
		int nb = 0;
		String chaine = "";
		boolean ok = false ;
		do {
			try {
				chaine = unBuffer.readLine();
				nb = Integer.parseInt(chaine);
				ok = true;
			} 
			catch (IOException ex) {
				System.out.println("Erreur de saisie");
			}
			catch (NumberFormatException exp) {
				System.out.println("Format de nombre incorrect");
			}
		}while (ok == false);
		return nb;
	}
	
	public static float saisirFloat() {
		float nb = 0;
		String chaine = "";
		boolean ok = false ;
		do {
			try {
				chaine = unBuffer.readLine();
				nb = Float.parseFloat(chaine);
				ok = true;
			} 
			catch (IOException ex) {
				System.out.println("Erreur de saisie");
			}
			catch (NumberFormatException exp) {
				System.out.println("Format de nombre incorrect");
			}
		}while (ok == false);
		return nb;
	}
	
	public static String saisirString() {
		String chaine = "";
			try {
				chaine = unBuffer.readLine();
			} 
			catch (IOException ex) {
				System.out.println("Erreur de saisie");
			}
		return chaine;
	}
	
	public static char saisirChar() {
		String chaine = "";
			try {
				chaine = unBuffer.readLine();
			} 
			catch (IOException ex) {
				System.out.println("Erreur de saisie");
			}
		return chaine.charAt(0);
	}
}
