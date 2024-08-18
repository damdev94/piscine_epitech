package day01.exercice2.Hr;

import java.util.ArrayList;

import day01.exercice2.Hr.invoices.Invoices;

public class Freelance {

  private String nom;
  private long siren;
  private ArrayList<Invoices> invoices;

  public Freelance() {
    this.invoices = new ArrayList<>();
}

  public void setName(String nom){
    this.nom = nom;
  }

  public void setSiren(long siren){
    this.siren = siren;
  }

  public String getName(){
    return nom;
  }

  public long getSiren(){
    return siren;
  }

  public ArrayList<Invoices> getInvoices(){
    return invoices;
  }

  public void addInvoice(Invoices invoice){
    invoices.add(invoice);
  }

}
