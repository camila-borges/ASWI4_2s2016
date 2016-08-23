/**
 * Created by sbmmartins on 8/19/16.
 */
public abstract class Duck {
    private String name;
    private Flyable flyBehavior;

    public Duck(String name, Flyable flyBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
    }

    public void swim() {
        System.out.println("Phelps...");
    }

    public void performFly() {
        this.flyBehavior.fly();
    }
}
