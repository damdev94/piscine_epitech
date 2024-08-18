package day01.exercice2.Hr.jobs;

import day01.exercice2.Hr.Employe;

public class Representant extends Employe{

  int chiffreDAffaire;

  public Representant(String nom, String prenom, int age, String entree, int chiffreDAffaire){
    super(nom, prenom, age, entree);
    this.chiffreDAffaire = chiffreDAffaire;
  }

  public int calculSalaire(){
    return chiffreDAffaire * 20 / 100 + 800;
  }

}
