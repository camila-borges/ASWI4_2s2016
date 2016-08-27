package br.edu.ifsp.asw;


public abstract class Duck {
    private String name;
    private Voar v;

    public Duck(String name, Voar v) {
        this.name = name;
        this.v = v;
    }

    public void setVoar(Voar v) {
        this.v = v;
    }

    public void swim() {
        System.out.println("Michal Phelps do Brasiiil");
    }

    public void myFly() {
        this.v.fly();
    }


}







