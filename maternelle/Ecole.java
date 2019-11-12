package maternelle;

import java.util.HashMap;

public class Ecole {
	private String nom, adresse;
	private Directeur leDirecteur;
	
	private HashMap<String, Groupe> lesGroupes;
	private HashMap<String, Groupe> lesTuteurs;
	
	public Ecole () {
		this.nom ="";
		this.adresse = "";
		this.leDirecteur = new Directeur();
		this.lesGroupes = new HashMap<String, Groupe>();
		this.lesTuteurs = new HashMap<String, Groupe>();
	}
	
	public void saisir () {
		System.out.println("Quel est le nom de l'école :");
		this.nom = Console.saisirString();
		System.out.println("Quelle est le nom de l'école :");
		this.adresse = Console.saisirString();
	}
	
	public void ajouterGroupe () {
		Groupe unGroupe = new Groupe();
		unGroupe.saisir();
		this.lesGroupes.put(unGroupe.getNom(), unGroupe);
	}
	
	public void listerGroupes () {
		System.out.println("Liste des groupes :");
		for (Groupe unGroupe : this.lesGroupes.values()) {
			unGroupe.afficher();
		}
	}
	
	public void supprimerGroupe () {
		String nom ;
		System.out.println("Quel est le nom du groupe à supprimer :");
		nom = Console.saisirString();
		if (this.lesGroupes.containsKey(nom)) {
			this.lesGroupes.remove(nom);
			System.out.println("Groupe supprimé");
		}else {
			System.out.println("Groupe non trouvé");
		}
	}
	
	public void gererGroupe () {
		String nom ;
		System.out.println("Quel est le nom du groupe à gérer :");
		nom = Console.saisirString();
		if (this.lesGroupes.containsKey(nom)) {
			this.lesGroupes.get(nom).gerer(); // gérer groupe
		}else {
			System.out.println("Groupe non trouvé");
		}
	}
	
	public void lesMaitresses () {
		System.out.println("Voici les maitresses de l'ecole");
		for (Groupe unGroupe : this.lesGroupes.values()) {
			unGroupe.getLaMaitresse().afficher();
		}
	}
	
	public void lesNiveauxEtudesDeLecole() {
		System.out.println("Voici les niveaux d'études de l'école");
		for (Groupe unGroupe : this.lesGroupes.values()) {
			unGroupe.getLeNiveau().afficher();
		}
	}
	
	public void gerer () {
		int choix = 0;
		do {
			System.out.println("_____ MENU ECOLE _____");
			System.out.println("1 - Saisie infos");
			System.out.println("2 - Ajouter un grouoe ");
			System.out.println("3 - Lister les groupes" );
			System.out.println("4 - Gerer un groupe ");
			System.out.println("5 - Supprimer");
			System.out.println("6 - Supprimer");
			System.out.println("7 - Supprimer");
			System.out.println("0 - Quitter ");
			System.out.println("Votre Choix -->");
			choix = Console.saisirInt();
			switch (choix) {
			case 1 : this.saisir();break;
			case 2 : this.ajouterGroupe();break;
			case 3 : this.listerGroupes();break;
			case 4 : this.gererGroupe();break;
			case 5 : this.supprimerGroupe();break;
			case 6 : this.lesMaitresses();break;
			case 7 : this.lesNiveauxEtudesDeLecole();break;
			}
		}while(choix != 0);
	}
	
	public static void main (String args[]) {
		Groupe lmsio = new Groupe();
		lmsio.gerer();
	}
}
