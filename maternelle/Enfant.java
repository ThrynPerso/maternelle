package maternelle;

import java.util.Scanner;

public class Enfant {
	private String nom, prenom;
	private int code;
	private String adresse;
	
	public Enfant() {
		this.nom = "";
		this.prenom = "";
		this.code = 0;
		this.adresse = "";
	}
	public void saisir () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Le nom :");
		this.nom = sc.next();
		System.out.println("Le prenom :");
		this.prenom = sc.next();
		System.out.println("Le code :");
		this.code = sc.nextInt();
		System.out.println("L'adresse :");
		this.adresse = sc.next();
		sc.close();
	}
	public void afficher() {
		System.out.println("Le nom : "+this.nom);
		System.out.println("Le prenom : "+this.prenom);
		System.out.println("Le code : "+this.code);
		System.out.println("L'adresse : "+this.adresse);
	}
	public String toString () {
		return this.code + ";" + this.nom +";"
					+ this.prenom +";" + this.adresse;
	}
	public String toXml () {
		String chaine = "";
		chaine += "<Enfant>\n";
		chaine += "\t<code>" +this.code +"</code>\n";
		chaine += "\t<nom>" +this.nom +"</nom>\n";
		chaine += "\t<prenom>" +this.prenom +"</prenom>\n";
		chaine += "\t<adresse>" +this.adresse +"</adresse>\n";
		chaine += "</Enfant>\n";
		return chaine;
	}
	
	
	//getters and setters
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
		
}
