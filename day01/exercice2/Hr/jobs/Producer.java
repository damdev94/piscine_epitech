package day01.exercice2.Hr.jobs;

import day01.exercice2.Hr.Employe;

public class Producer extends Employe{

  private int nbUnite;

  public Producer(String nom, String prenom, int age, String entree, int nbUnite){
    super(nom, prenom, age, entree);
    this.nbUnite = nbUnite;
  }

  public int calculSalaire(){
    return nbUnite * 5;
  }

}
