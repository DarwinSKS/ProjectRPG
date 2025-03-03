package Joueur;
import java.util.Scanner;

public class Players extends Classes {
    private String nom; // Nom de la classe
    private String nomJoueur; // Nom du joueur

    // Constructor
    public Players(String nom, String classeNom, int pv, int pm, int force, int intelligence, int def, int resMagique, int agilite, int chance, int end, int esprit) {
        super(classeNom, pv, pm, force, intelligence, def, resMagique, agilite, chance, end, esprit);
        this.nom = nom; // Initialisation du nom de la classe
        this.nomJoueur = nomJoueur; // Initialisation du nom du joueur
    }

    // Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    // Choisir un nom de joueur
    public void choisirNomJoueur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom : ");
        nomJoueur = sc.nextLine();
    }

    // Afficher le nom du joueur
    public void afficherNomJoueur() {
        System.out.println("Votre nom : " + nomJoueur);
    }

    // Choisir une classe
    public void choisirUneClasse() {
        System.out.println("Liste des classes: ");
        afficherClasses();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir une classe : ");
        nom = sc.nextLine();
        if (nom.equals("Guerrier") || nom.equals("Mage") || nom.equals("Voleur")) {
            selectionnerClasse(nom);
        }
        else {
            System.out.println("Classe invalide: ");
            choisirUneClasse();
        }
        System.out.println("Détail de votre classe : ");
        afficherDetailClasse();
        validationClasse();
    }

    private void validationClasse() {
        System.out.println("Voulez vous garder votre classe (oui/non): ");
        Scanner sc2 = new Scanner(System.in);
        String reponse = sc2.nextLine();
        if (reponse.equals("non")) {
            choisirUneClasse();
        }
        else if (!reponse.equals("oui")) {
            System.out.println("Réponse invalide");
            validationClasse();
        }
        else {

        }
    }
}
