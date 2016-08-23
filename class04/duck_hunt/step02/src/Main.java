public class Main {

    public static void main(String[] args) {
        Mallard mal = new Mallard("Oi, eu sou um Mallard");
        Garganey gar = new Garganey("Garganey na Area");
        Rubber rub = new Rubber("Pato de Borracha");

        mal.performFly();
        gar.performFly();
        rub.performFly();
    }
}
