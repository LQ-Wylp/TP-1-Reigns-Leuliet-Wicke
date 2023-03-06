package main;

import java.util.Map;
import java.util.TreeMap;

public class Personnage {
    protected String nom;
    protected Genre genre;
    protected Map<TypeJauge, Jauge> jauges;

    public Personnage(String nom, Genre genre) {
        this.nom = nom;
        this.genre = genre;
        this.initJauges();
    }

    public void initJauges(){
        this.jauges = new TreeMap<>();
        jauges.put(TypeJauge.CLERGE , new Jauge("Clergé", 15 + (int)(Math.random() * (35 - 15))));
        jauges.put(TypeJauge.PEUPLE , new Jauge("Peuple", 15 + (int)(Math.random() * (35 - 15))));
        jauges.put(TypeJauge.ARMEE , new Jauge("Armée", 15 + (int)(Math.random() * (35 - 15))));
        jauges.put(TypeJauge.FINANCE , new Jauge("Finances", 15 + (int)(Math.random() * (35 - 15))));
    }

    public void AfficheJauges() {
        for (Map.Entry<TypeJauge, Jauge> jauge : jauges.entrySet()) {
            jauge.getValue().afficheJauge();
        }
        System.out.println();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Jauge getJauge(TypeJauge type){
        return jauges.get(type);
    }

    public void setJauge(TypeJauge type, Jauge jauge){
        jauges.put(type, jauge);
    }

}
