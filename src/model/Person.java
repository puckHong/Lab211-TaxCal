
package model;


public class Person {
    public String kindOfDepen;
    public int age;
    public boolean isStudying;

    public String getKindOfDepen() {
        return kindOfDepen;
    }

    public void setKindOfDepen(String kindOfDepen) {
        this.kindOfDepen = kindOfDepen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsStudying() {
        return isStudying;
    }

    public void setIsStudying(boolean isStudying) {
        this.isStudying = isStudying;
    }

    public Person(String kindOfDepen, int age) {
        this.kindOfDepen = kindOfDepen;
        this.age = age;
    }
    
}
