public class Main {

    public static void main(String[] args) {
        Mallard mal = new Mallard("Oi, eu sou um Mallard");
        Garganey gar = new Garganey("Garganey na Area");

        mal.swim();
        gar.swim();
        System.out.println("");
        mal.fly();
        gar.fly();
    }
}
