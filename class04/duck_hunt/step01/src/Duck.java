/**
 * Created by sbmmartins on 8/19/16.
 */
public abstract class Duck {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println("Phelps...");
    }

    public void fly() {
        System.out.println("I believe I can fly!");
    }
}
