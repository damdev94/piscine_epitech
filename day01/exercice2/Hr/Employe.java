package day01.exercice2.Hr;

public abstract class Employe extends Staff {
  public String nom;
  public String prenom;
  public int age;
  public String entreeDansLeService;

  public Employe(String nom, String prenom, int age, String entreeDansLeService){
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.entreeDansLeService = entreeDansLeService;
  }

  public abstract int calculSalaire();
}
