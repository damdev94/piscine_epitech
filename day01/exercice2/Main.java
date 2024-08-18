package day01.exercice2;

import java.util.Date;

import day01.exercice2.Hr.Freelance;
import day01.exercice2.Hr.Staff;
import day01.exercice2.Hr.invoices.Invoices;
import day01.exercice2.Hr.jobs.Producer;
import day01.exercice2.Hr.jobs.ProducerWithRisk;
import day01.exercice2.Hr.jobs.Representant;
import day01.exercice2.Hr.jobs.Salesman;
import day01.exercice2.Hr.jobs.Wharehouseman;
import day01.exercice2.Hr.jobs.WharehousemanWithRisk;

public class Main {
  public static void main(final String[] args) {
    final Staff myEmployees = new Staff();
    myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
    myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
    myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
    myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
    myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
    myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));

    Freelance freelance = new Freelance();
    freelance.setName("Damien");
    freelance.setSiren(4582456985555698752l);

    Invoices invoice1 = new Invoices();
    Date date = new Date();
    invoice1.setDate(date);
    invoice1.setLabel("Facture 1");
    invoice1.setTotal(500);

    Invoices invoice2 = new Invoices();
    Date date2 = new Date();
    invoice2.setDate(date2);
    invoice2.setLabel("Facture 2");
    invoice2.setTotal(1000);

    freelance.addInvoice(invoice1);
    freelance.addInvoice(invoice2);

    myEmployees.displaySalaries();
    myEmployees.displayAverageSalary();
  }
}
