/**
 * Created by sbmmartins on 8/5/16.
 */
public class Publisher {
    private String name;
    private int id;

    public Publisher(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void print() {
        System.out.println("---------------");
        System.out.println("- name: " + this.name);
        System.out.println("- id: " + this.id);
        System.out.println("---------------");
    }
}


















