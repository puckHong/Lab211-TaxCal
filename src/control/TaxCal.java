package control;

import java.util.List;
import model.Person;

public class TaxCal {

    double income;
    List<Person> depen;

    public TaxCal(double income, List<Person> depen) {
        this.income = income;
        this.depen = depen;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public List<Person> getDepen() {
        return depen;
    }

    public void setDepen(List<Person> depen) {
        this.depen = depen;
    }

    public int countChil() {
        int count = 0;
        for (Person person : depen) {
            if (person.getKindOfDepen().equalsIgnoreCase("child") && (person.getAge() < 18)) {
                count++;
                if (count == 2) {
                break;
            }
            }
            
        }
        return count;
    }

    public int countParent() {
        int count = 0;
        for (Person person : depen) {
            if (person.getKindOfDepen().equalsIgnoreCase("mother") && person.getAge() >= 55) {
                count++;
            } else if (person.getKindOfDepen().equalsIgnoreCase("father") && person.getAge() >= 60) {
                count++;
            }
        }
        return count;
    }

    public double deductionSelf() {
        return 1100000;
    }

    public double DepenMoney() {
        return countChil() * 4400000 + countParent() * 4400000;
    }

    public double deductionMoney() {
        return DepenMoney() + deductionSelf();
    }

    public double TaxableIncome() {
        return income - deductionMoney();
    }

    public double taxCal() {
        double tax = 0;
        if (TaxableIncome() <= 4000000) {
            tax = 0;
        } else if (TaxableIncome() <= 6000000) {
            tax = 0.05 * (TaxableIncome() - 4000000);
        } else if (TaxableIncome() <= 10000000) {
            tax = (0.1 * (TaxableIncome() - 600000)) + (0.05 * 2000000);
        } else if (TaxableIncome() >= 1000000) {
            tax = (0.2 * (TaxableIncome() - 500000)) + (0.1 * 400000) + (0.05 * 2000000);

        }
        return tax;
    }
    
    public void display(){
        System.out.println("Number of child allowed a deduction: "+countChil() +" Money :"+countChil()*4400000);
        System.out.println("Number of parent allowed a deduction: "+countParent()+" Money : "+countParent()*4400000);
        System.out.println("Deduction for self: "+deductionSelf());
        System.out.println("Tax need to pay: "+taxCal());
    }

}
