package main;

import java.util.List;
import java.util.Map;

public class Question {
    protected String nomPersonnage;
    protected String question;
    protected Effets effetsGauche, effetsDroite;


    public Question(String nomPersonnage,
                    String question,
                    Effets effetsGauche,
                    Effets effetsDroite) {
        this.nomPersonnage = nomPersonnage;
        this.question = question;
        this.effetsGauche = effetsGauche;
        this.effetsDroite = effetsDroite;
    }

    public void afficheQuestion() {
        String result = "["+nomPersonnage+"] "
                + question
                + "[G: "+ effetsGauche.intitule
                + ",D: "+ effetsDroite.intitule
                + "]";
        System.out.println(result);
        System.out.println("Effet G:"+ effetsGauche.afficheEffets());
        System.out.println("Effet D:"+ effetsDroite.afficheEffets());
        System.out.flush();
    }


    public String getNomPersonnage() {
        return nomPersonnage;
    }

    public void setNomPersonnage(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Effets getEffetGauche() {
        return effetsGauche;
    }

    public void setEffetGauche(Effets effetsGauche) {
        this.effetsGauche = effetsGauche;
    }

    public Effets getEffetsDroite() {
        return effetsDroite;
    }

    public void setEffetDroite(Effets effetsDroite) {
        this.effetsDroite = effetsDroite;
    }

}
