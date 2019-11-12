package maternelle;

import java.util.Scanner;

public class NiveauEtudes {
	private int code ;
	private String libelle ;
	
	public NiveauEtudes() {
		this.code = 0;
		this.libelle="";
	} 

	public void saisir () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Le code :");
		this.code = Console.saisirInt();
		System.out.println("Le libelle :");
		this.libelle = sc.next();
		sc.close();
	}
	public void afficher () {
		System.out.println("Le code : "+this.code);
		System.out.println("Le libelle : "+this.libelle);
	}
	public String toString () {
		return this.code +";" + this.libelle;
	}
	public String toXml () 
	{
		String chaine = "";
		chaine += "<NiveauEtudes>\n";
		chaine += "\t<code>" +this.code +"</code>\n";
		chaine += "\t<libelle>" +this.libelle +"</libelle>\n";
		chaine += "</NiveauEtudes>\n";
		return chaine;
	}
	
	//getter and setter
	
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public String getLibelle() {
			return libelle;
		}
		public void setPrenom(String libelle) {
			this.libelle = libelle;
		}
	
}