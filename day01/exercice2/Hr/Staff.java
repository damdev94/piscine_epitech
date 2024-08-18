package day01.exercice2.Hr;

import java.util.ArrayList;

public class Staff {
  ArrayList<Employe> employes;
  public int totalSalaire;

  public Staff(){
    this.employes = new ArrayList<>();
  }

  public void add(Employe employe){
    employes.add(employe);
  }

  public void displaySalaries(){
    System.out.println("Liste des salaires des salariés : ");
    for(Employe employe : employes){
      int salaire = employe.calculSalaire();
      System.out.println("    Le salaire de l'employé " + employe.nom + " " + employe.prenom + " est de " + salaire + " €");
    }
  }

  public void displayAverageSalary(){

    for(Employe employe : employes){

      totalSalaire += employe.calculSalaire();
    }
    System.out.println(" ");
    System.out.println("Valeur du salaire moyen : " + totalSalaire / employes.size() + " €");
  }
}
