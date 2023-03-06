package main;

public class Jauge {
    protected TypeJauge type;
    protected String nom;
    protected int valeur;

    public Jauge(String nom, int valeur){
        this.nom = nom;
        this.valeur = valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
        if (valeur <= 0 || valeur >= 50){
            Reigns.GameOver();
        }
    }

    public void afficheJauge() {
        StringBuilder resultat = new StringBuilder("[");
        // valeur : ####
        resultat.append("#".repeat(Math.max(0, valeur)));
        // on complète avec ____
        resultat.append("_".repeat(Math.max(0, 50 - valeur)));
        resultat.append("] ");
        // affichage du nom
        resultat.append(nom);
        System.out.println(resultat);
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getValeur() {
        return valeur;
    }

    public TypeJauge getType() {
        return type;
    }
    public void setType(TypeJauge type) {
        this.type = type;
    }
}