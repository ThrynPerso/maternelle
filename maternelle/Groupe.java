package maternelle;

import java.util.ArrayList;
import java.util.Scanner;

public class Groupe {
	private String nom, couleur;
	private Maitresse laMaitresse; //relation 1-1
	private NiveauEtudes leNiveau; //relation 1-1
	private ArrayList<Enfant> lesEnfants; //relation 1-N
	
	public Groupe() {
		this.nom = "";
		this.couleur = "";
		
		//On instancie les instances attributs
		this.laMaitresse = new Maitresse();
		this.leNiveau = new NiveauEtudes();
		this.lesEnfants = new ArrayList<Enfant>();
	}
	
	public void saisir () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Le nom du groupe :");
		this.nom = sc.next();
		System.out.println("La couleur du groupe :");
		this.couleur = sc.next();
		sc.close();
	}
	
	public void afficher() {
		System.out.println("Le nom : "+this.nom);
		System.out.println("La couleur : "+this.couleur);
	}
	
	public void ajouterEnfant () {
		//instancier la classe Enfant
		Enfant unEnfant = new Enfant();
		
		//renseigner les attributs
		unEnfant.saisir();
		
		//ajouter l'instance créée dans l'ArrayList
		this.lesEnfants.add(unEnfant);
		System.out.println("L'enfant a été ajouté avec succès");
	}
	
	public void listerEnfants () {
		// pour chaque enfant dans tous les enfants
		for (Enfant unEnfant : this.lesEnfants) {
			unEnfant.afficher();
		}
	}
	
	public void rechercherEnfant () {
		int code;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le code de l'enfant :");
		code = sc.nextInt();
		boolean trouve = false;
		for (Enfant unEnfant : this.lesEnfants) {
			if (unEnfant.getCode() == code) {
				System.out.println("Enfant trouvé :");
				unEnfant.afficher();
				trouve = true;
				break; // on casse la boucle : fini
			}
		}
		if (trouve == false) {
			System.out.println("Pas d'enfant avec ce code trouvé");
		}
		sc.close();
	}
	
	public void supprimerEnfant() { 
		int code;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le code de l'enfant :");
		code = sc.nextInt();
		boolean trouve = false;
		for (Enfant unEnfant : this.lesEnfants) {
			if (unEnfant.getCode() == code) {
				this.lesEnfants.remove(unEnfant);
				System.out.println("Enfant trouvé et supprimé");
				trouve = true;
				break; // on casse la boucle : fini
			}
		}
		if (trouve == false) {
			System.out.println("Pas d'enfant avec ce code trouvé");
		}
		sc.close();
	}
	
	public String toString () {
		String chaine = "";
		chaine = this.nom +";" + this.couleur +";";
		chaine += this.laMaitresse.toString() + ";";
		chaine += this.leNiveau.toString() + ";";
		for (Enfant unEnfant : this.lesEnfants) {
			chaine += unEnfant.toString() + ";" ;
		}
		return chaine;
	}
	
	public String toXml () 
	{
		String chaine = "";
		chaine += "<Groupe>\n";
		chaine += "\t<nom>" +this.nom +"</nom>\n";
		chaine += "\t<couleur>" +this.couleur +"</libelle>\n";
		chaine += this.laMaitresse.toXml();
		chaine += this.leNiveau.toXml();
		chaine += "<liste>\n";
		for (Enfant unEnfant : this.lesEnfants) {
			chaine += unEnfant.toXml();
		}
		chaine += "</liste>\n";
		chaine += "</Groupe>\n";
		return chaine;
	}
	
	public void gerer () {
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("_____ MENU GROUPE _____");
			System.out.println("1 - Saisie infos groupe");
			System.out.println("2 - Afficher groupe ");
			System.out.println("3 - Ajouter un enfant" );
			System.out.println("4 - Lister les enfants ");
			System.out.println("5 - Rechercher un enfant ");
			System.out.println("6 - Supprimer un enfant ");
			System.out.println("7 - To String ");
			System.out.println("8 - To XML ");
			System.out.println("0 - Quitter ");
			System.out.println("Votre Choix -->");
			choix = sc.nextInt();
			switch (choix) {
			case 1 : this.saisir();break;
			case 2 : this.afficher();break;
			case 3 : this.ajouterEnfant();break;
			case 4 : this.listerEnfants();break;
			case 5 : this.rechercherEnfant();break;
			case 6 : this.supprimerEnfant();break;
			case 7 : System.out.println("To string : " +this.toString());break;
			case 8 : System.out.println("To XML : " +this.toXml());break;
			}
		}while(choix != 0);
		sc.close();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Maitresse getLaMaitresse() {
		return laMaitresse;
	}

	public void setLaMaitresse(Maitresse laMaitresse) {
		this.laMaitresse = laMaitresse;
	}

	public NiveauEtudes getLeNiveau() {
		return leNiveau;
	}

	public void setLeNiveau(NiveauEtudes leNiveau) {
		this.leNiveau = leNiveau;
	}

	public ArrayList<Enfant> getLesEnfants() {
		return lesEnfants;
	}

	public void setLesEnfants(ArrayList<Enfant> lesEnfants) {
		this.lesEnfants = lesEnfants;
	}
	
	
}
