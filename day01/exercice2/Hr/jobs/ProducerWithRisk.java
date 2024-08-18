package day01.exercice2.Hr.jobs;

public class ProducerWithRisk extends Producer {
  public ProducerWithRisk(String nom, String prenom, int age, String entree, int nbUnite){

    super(nom, prenom, age, entree, nbUnite);

  }

  public int calculSalaire(){
    return super.calculSalaire() + 200;
  }
}
