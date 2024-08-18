package day01.exercice2.Hr.jobs;

import day01.exercice2.Hr.Employe;

public class Salesman extends Employe {

  private int chiffreDAffaire;

  public Salesman(String nom, String prenom, int age, String entree, int chiffreDAffaire) {
      super(nom, prenom, age, entree);
      this.chiffreDAffaire = chiffreDAffaire;
  }

  public int calculSalaire(){
   return (chiffreDAffaire * 20 / 100) + 400;
  }

}
