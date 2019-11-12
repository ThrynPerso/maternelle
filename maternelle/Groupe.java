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
			
		}
	}
}