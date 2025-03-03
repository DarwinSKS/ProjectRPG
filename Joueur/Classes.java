package Joueur;

public class Classes {
    private String nom; // Nom de la classe
    private int pv; // Points de Vie (PV) : Représentent la santé du personnage
    private int pm; // Points de Mana (PM) : Utilisés pour les sorts et compétences spéciales
    private int force; // Force : Dégâts des attaques physiques
    private int intelligence; // Intelligence : Efficacité des sorts magiques.
    private int def; // Défense : Réduction des dégâts physiques reçus.
    private int resMagique; // Résistance Magique : Réduction des dégâts magiques reçus.
    private int agilite; // Agilité : Vitesse d'action et capacité d'esquive.
    private int chance; // Chance : Chances de coups critiques et trouvailles rares.
    private int end; // Endurance : Résistance aux effets.
    private int esprit; // Esprit : Régénération de mana et résistance mentale.

    public Classes(String nom, int pv, int pm, int force, int intelligence, int def, int resMagique, int agilite, int chance, int end, int esprit) {
        this.nom = nom;
        this.pv = pv;
        this.pm = pm;
        this.force = force;
        this.intelligence = intelligence;
        this.def = def;
        this.resMagique = resMagique;
        this.agilite = agilite;
        this.chance = chance;
        this.end = end;
        this.esprit = esprit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPm() {
        return pm;
    }

    public void setPm(int pm) {
        this.pm = pm;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getResMagique() {
        return resMagique;
    }

    public void setResMagique(int resMagique) {
        this.resMagique = resMagique;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getEsprit() {
        return esprit;
    }

    public void setEsprit(int esprit) {
        this.esprit = esprit;
    }

    public void afficherClasse(String nom) {
        switch (nom) {
            case "Guerrier":
                this.nom = "Guerrier";
                this.pv = 150;
                this.pm = 50;
                this.force = 15;
                this.intelligence = 5;
                this.def = 10;
                this.resMagique = 5;
                this.agilite = 5;
                this.chance = 5;
                this.end = 10;
                this.esprit = 5;
                break;
            case "Mage":
                this.nom = "Mage";
                this.pv = 50;
                this.pm = 100;
                this.force = 5;
                this.intelligence = 10;
                this.def = 5;
                this.resMagique = 10;
                this.agilite = 5;
                this.chance = 5;
                this.end = 5;
                this.esprit = 10;
                break;
            case "Voleur":
                this.nom = "Voleur";
                this.pv = 75;
                this.pm = 75;
                this.force = 7;
                this.intelligence = 7;
                this.def = 7;
                this.resMagique = 7;
                this.agilite = 10;
                this.chance = 10;
                this.end = 7;
                this.esprit = 7;
                break;
            case "Paladin":
                this.nom = "Paladin";
                this.pv = 90;
                this.pm = 60;
                this.force = 9;
                this.intelligence = 6;
                this.def = 9;
                this.resMagique = 6;
                this.agilite = 6;
                this.chance = 6;
                this.end = 9;
                this.esprit = 6;
                break;
            case "Sorcier":
                this.nom = "Sorcier";
                this.pv = 60;
                this.pm = 90;
                this.force = 6;
                this.intelligence = 9;
                this.def = 6;
                this.resMagique = 9;
                this.agilite = 6;
                this.chance = 6;
                this.end = 6;
                this.esprit = 9;
                break;
            case "Assassin":
                this.nom = "Assassin";
                this.pv =
        }

        System.out.println("Nom de la classe : " + this.nom);
        System.out.println("Points de Vie : " + this.pv);
        System.out.println("Points de Mana : " + this.pm);
        System.out.println("Force : " + this.force);
        System.out.println("Intelligence : " + this.intelligence);
        System.out.println("Défense : " + this.def);
        System.out.println("Résistance Magique : " + this.resMagique);
        System.out.println("Agilité : " + this.agilite);
        System.out.println("Chance : " + this.chance);
        System.out.println("Endurance : " + this.end);
        System.out.println("Esprit : " + this.esprit);
    }
}
