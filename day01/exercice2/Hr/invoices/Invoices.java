package day01.exercice2.Hr.invoices;

import java.util.Date;

public class Invoices {

  private Date date;
  private String label;
  private float total;

  public void setDate(Date date){
    this.date = date;
  }

  public void setLabel(String label){
    this.label = label;
  }

  public void setTotal(float total){
    this.total = total;
  }

  public Date getDate(){
    return date;
  }

  public String getLabel(){
    return label;
  }

  public float getTotal(){
    return total;
  }
}
