
package control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Person;


public class TaxRun {
    public void run(){
        Scanner sc = new Scanner(System.in);
        List<Person>depen = new ArrayList<>();
        System.out.println("Enter income: ");
        double income = sc.nextDouble();
        if(income <11000000){
            System.out.println("Dont have to pay tax");
            System.exit(0);
        }
        System.out.println("Enter number of depent:");
        int num = sc.nextInt();
        for (int i = 0; i <num; i++) {
            System.out.println("Enter kind of depen:");
            sc.nextLine();
            String kind = sc.nextLine();
            System.out.println("Enter age of depen:");
            int age = sc.nextInt();
            depen.add(new Person(kind, age));
        }
        TaxCal tax = new TaxCal(income, depen);
        tax.display();
    }
}
