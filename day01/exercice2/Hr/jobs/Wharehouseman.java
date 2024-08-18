package day01.exercice2.Hr.jobs;

import day01.exercice2.Hr.Employe;

public class Wharehouseman extends Employe{

  private int nbHeures;

  public Wharehouseman(String nom, String prenom, int age, String entree, int nbHeures){
    super(nom, prenom, age, entree);
    this.nbHeures = nbHeures;
  }

  public int calculSalaire(){
    return nbHeures * 65;
  }

}
