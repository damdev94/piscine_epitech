package day01.exercice2.Hr.jobs;

public class WharehousemanWithRisk extends Wharehouseman {

  public WharehousemanWithRisk(String nom, String prenom, int age, String entree, int nbHeures){

    super(nom, prenom, age, entree, nbHeures);

  }

  public int calculSalaire(){
    return super.calculSalaire() + 200;
  }
}
