package maternelle;

import java.util.Scanner;

public class Maitresse {
	private String nom, prenom, diplome;
	
	public Maitresse() {
		this.nom = "";
		this.prenom = "";
		this.diplome = "";
	}
		
	public void saisir () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Le nom :");
		this.nom = sc.next();
		System.out.println("Le prenom :");
		this.prenom = sc.next();
		System.out.println("Le diplome :");
		this.diplome = sc.next();
		sc.close();
	}
	public void afficher () {
		System.out.println("Le nom : "+this.nom);
		System.out.println("Le prenom : "+this.prenom);
		System.out.println("Le diplome : "+this.diplome);
	}
	public String toString () {
		return this.nom +";" + this.prenom +";" + this.diplome;
	}
	public String toXml () {
		String chaine = "";
		chaine += "<Maitresse>\n";
		chaine += "\t<nom>" +this.nom +"</nom>\n";
		chaine += "\t<prenom>" +this.prenom +"</prenom>\n";
		chaine += "\t<diplome>" +this.diplome +"</diplome>\n";
		chaine += "</Maitresse>\n";
		return chaine;
	}
	
	//getter and setter
	
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
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	
		
}
